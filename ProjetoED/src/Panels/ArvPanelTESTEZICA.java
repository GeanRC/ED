
package Panels;
import Implementacoes.ABP;
import Implementacoes.No2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class ArvPanelTESTEZICA extends javax.swing.JPanel {
    ABP arv = new ABP();
    String inOrdem;     
    String posOrdem;    
    String preOrdem;    
    No2 raiz = null; 
    int quantNo = 0;
    int[][] noCoordenada = new int[500][3];                                       
    //array pra armazenar as coordenadas dos nos da árvore
    static int cont = 0;
    boolean arvPintada = false;
    private int raioCirculo = 15; 
    private int sepVertical = 30;  
    
    private static No2 Adicionar(No2 noAux, int valor){
        //funcao pra inserir na arvore
        if(noAux == null){
            noAux = new No2();
            noAux.setConteudo(valor);
        }else{
            if(valor <= noAux.getConteudo()){
                noAux.setEsq(Adicionar(noAux.getEsq(),valor));             
            }else{
                noAux.setDir(Adicionar(noAux.getDir(),valor)); 
            }
        }
        return noAux;
    }
    
    private int[] ProcurarCoordenadas(int x){
        // Procura pelas coordenadas do valor passado        
        for(int i=0; i<noCoordenada.length; i++){
            if(x == noCoordenada[i][2]){
                int[] temp = {noCoordenada[i][0], noCoordenada[i][1]};
                return temp;
            }
        }
        return new int[2];
    }   
    
    private boolean Pesquisar(No2 noAux, int valor){
        //funcao recursiva pra procurar valor na arvore 
        Graphics g = getGraphics();
        try {
            Thread.sleep(500);
        }catch(InterruptedException ex){
            Logger.getLogger(ArvPanelTESTEZICA.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(noAux == null){ 
            return false;
        }
        int[] temp = ProcurarCoordenadas(noAux.getConteudo());
            if(temp[0] != 0 && temp[1] != 0){
                if(valor == noAux.getConteudo()){
                    //se o valor for encontrado muda pra cor verde
                    g.setColor(Color.green);                   
                }else{
                    //se nao pinta tudo de amarelo
                    g.setColor(Color.yellow);                    
                }                 
                g.fillOval(temp[0], temp[1], 30, 30);
                g.setColor(Color.black);
                g.drawString(noAux.getConteudo() + "", temp[0] + 10, temp[1] + 20);
            } 
            
            if(valor == noAux.getConteudo()){
                return true; 
            }else if (valor<noAux.getConteudo()){
                //na subarvore da esquerda pois os dados são menores que os dados do no atual
                return Pesquisar(noAux.getEsq(), valor);
            }
            else{
                //na subarvore da direita pois os dados são maiores que os dados do no atual
                return Pesquisar(noAux.getDir(), valor);
            }
    }
    
    public void InOrder(No2 raiz){
        if(raiz != null){
            InOrder(raiz.getEsq());
            inOrdem += raiz.getConteudo() + " ";
            InOrder(raiz.getDir());
        }
    }
    
    public void PreOrder(No2 raiz){
        if(raiz != null){   
            preOrdem += raiz.getConteudo() + " ";
            PreOrder(raiz.getEsq());
            PreOrder(raiz.getDir());
        }
    }
    
    public void PosOrder(No2 raiz){
        if(raiz != null){
            PosOrder(raiz.getEsq());
            PosOrder(raiz.getDir());
            posOrdem += raiz.getConteudo() + " ";
        }        
    }
    
    protected void PintarArvore(){
        Graphics g = getGraphics();
        if(raiz != null){  
            ExibirArvore(g, raiz, getWidth()/2, 35, getWidth()/4); 
        }
    }
    
    private void ExibirArvore(Graphics g, No2 noAux, int x, int y, int sepHorizontal){
        //Função para exibir uma subarvore com raiz como x, y       
        g.setColor(Color.CYAN);
        g.fillOval(x - raioCirculo, y - raioCirculo, 2 * raioCirculo, 2 * raioCirculo);      
        //Armazene as coordenadas do nó, a serem usadas para procurar
        noCoordenada[cont][0] = x - raioCirculo;
        noCoordenada[cont][1] = y - raioCirculo;
        noCoordenada[cont][2] = noAux.getConteudo();

        cont++;      
        //Escreva o valor dos dados no no
        g.setColor(Color.black);
        g.drawString(noAux.getConteudo() + "", x - 6, y + 4);

        if(noAux.getEsq() != null){

            //usa drawLine pra desenhar linha no no esquerdo
            if(!arvPintada){
                try{ 
                    Thread.sleep(500);
                }catch(InterruptedException ex){
                    Logger.getLogger(ArvPanelTESTEZICA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //desenha linha
            DesenhaLinhaEntre2Circulos(g, x - sepHorizontal, y + sepVertical, x, y);
            //desenha recursivamente a subarvore esquerda, decrementa as lacunas orizontal e vertical
            ExibirArvore(g, noAux.getEsq(), x - sepHorizontal, y + sepVertical, sepHorizontal/2);

        }   
        if(noAux.getDir() != null){

            //usa drawLine pra desnhar linha para o no direito
            if(!arvPintada){
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ex){
                    Logger.getLogger(ArvPanelTESTEZICA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //desenha linha
            DesenhaLinhaEntre2Circulos(g, x + sepHorizontal, y + sepVertical, x, y);  
            //desenha recursivamente a subarvore direita, decrementa as lacunas orizontal e vertical
            ExibirArvore(g, noAux.getDir(), x + sepHorizontal, y + sepVertical, sepHorizontal/2); 

        }
    }        
    
    private void DesenhaLinhaEntre2Circulos(Graphics g, int x1, int y1, int x2, int y2){    
    // Função para desenhar uma linha entre dois círculos centrados em x1, y1 e x2, y2
    // Computando coordenadas ajustadas
    double d = Math.sqrt(sepVertical * sepVertical + (x2 - x1) * (x2 - x1));
    int xAjustado = (int)(x1 - raioCirculo * (x1 - x2) / d);
    int yAjustado = (int)(y1 - raioCirculo * (y1 - y2) / d);
    int xAjustado2 = (int)(x2 + raioCirculo * (x1 - x2) / d);
    int yAjustado2 = (int)(y2 + raioCirculo * (y1 - y2) / d);
    //desenha linha entre as coordenadas ajustadas
    g.drawLine(xAjustado, yAjustado, xAjustado2, yAjustado2);
    }
    
    public void chamar(String str){
        //divide usando ","
        String[] treeSplit = str.split(",");
        quantNo = treeSplit.length; 
        //no raiz criado   
        No2 temp = new No2();
        temp.setConteudo(Integer.parseInt(treeSplit[0]));
        //faz as iteracoes e adiciona nos 
        for(int i=1; i<treeSplit.length;i++){
            temp = Adicionar(temp,Integer.parseInt(treeSplit[i]));
        }
        //seta a raiz pra temp
        raiz = temp;
        //desenha arvore no painel
        PintarArvore();
        arvPintada = true;
    }
    
    public boolean buscar(int x){
        PintarArvore();
        if(Pesquisar(raiz,x)){
            return true;
        }else{
            return false;
        }
    }
    
    public void printar(){
        inOrdem = "";
        InOrder(raiz);
        posOrdem = "";
        PosOrder(raiz);
        preOrdem = "";
        PreOrder(raiz);
        JOptionPane.showMessageDialog(null,"InOrdem:    "+inOrdem+"\r\n"+
                                            "\r\n" +"PreOrdem: "+preOrdem+
                                        "\r\n"+"\r\n" +"PosOrdem: "+posOrdem);
    }
    
    public ArvPanelTESTEZICA() {
        setVisible(true);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
