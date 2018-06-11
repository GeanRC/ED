
package Panels;

import Implementacoes.ListaSE;
import java.awt.Color;
import java.awt.Graphics;

/*
 * @author Gean RC
 */
public class ListasPanel extends javax.swing.JPanel {

    int modo1=1, modo2=2, modo3=3;    
    Graphics l;    
    ListaSE lista = new ListaSE();
    //eixo em destaque X
    int x = 20;
    String v = new String();    
    int valor, posicao;
    int elementos = 0;
    
    int s = modo3;
    int w,j,m,o;
    int p=0;
    //espaço dos quadrados
    
    public void quadrado(String Valor, int s){
        int j;
        //valor da largura muda se for duplamente encadeada 
        if(s!=3){
            j=30;
            p=45;
        }else{
            j=40;
            p=55;
        }
        //quadrado
        l.drawRect(x,200,j,20);
        //string com os valores
        l.drawString(Valor,x+10, 210);
    }
    
    public void linhaVertical(int s){        
        int j=0;
        //muda a coordenada la linha dependendo do tipo de encadeamento 
        if(s==2){
            j=25;
        }else if(s==3){
            j=35;
        }
        //linha vertical
        l.setColor(Color.BLUE);
        l.drawLine(x+j, 200, x+j, 220);
        if(s==3){
            //linha adicional na duplamente encadeada
            l.drawLine(x+5, 200, x+5, 220);
        }
        l.setColor(Color.BLACK);
    }
    
    public void linhaHorizontal(){
        //linha horizontal
        l.setColor(Color.BLUE);
        l.drawLine(x-15, 210, x, 210);
        l.setColor(Color.BLACK);
    }
    
    public void inserir(String Valor, String Posicao){       
        //pega os valores digitados e coloca na lista
        valor = Integer.parseInt(Valor);
        posicao = Integer.parseInt(Posicao);
        lista.insere(posicao, valor); 
        //informa o numero de elementos na lista
        elementos++;
        if(lista.vazia()){
        //insere em lista vazia
            quadrado(Valor,s);
            if(s!=1){
                linhaVertical(s);
            }
            x = x+p;
        }else if (Integer.parseInt(Posicao)== elementos+1){ 
        //insere no fim   
            quadrado(Valor,s);
            if(s!=1){
                linhaVertical(s);
            }
            linhaHorizontal();
            x = x+p;
        }else if(0<Integer.parseInt(Posicao) && Integer.parseInt(Posicao)<elementos+1){
        //insere no meio ou no inicio    
            if(Integer.parseInt(Posicao) ==1){
                //limpa
                l.clearRect(20, 190,500, 20);  
                x = 20;
                quadrado(Valor,s);
                if(s!=1){
                    linhaVertical(s);
                }   
                x = x+p;
                //desloca o desenho
            }else{ 
                x = 20;
                quadrado(" ",s);
                x = x+p;
                //limpa
                l.clearRect(x, 190,500, 20);
            }
            for(int k = 2; k<=elementos; k++){
                v = Integer.toString(lista.elemento(k));
                quadrado(v,s); 
                if(s!=1){
                    linhaVertical(s);
                }
                linhaHorizontal();
                x = x+p;
            }
        }
    }
    
    public void remover(String Posicao){
        if(Integer.parseInt(Posicao)<=elementos){
            int q = Integer.parseInt(Posicao);
            //limpa
            l.clearRect(0, 190,x+100, 500);
            lista.remove(q);
            x = 20;
            //reescreve
            for (int k = 1; k<elementos; k++){
                //se nao e primeira posicao desenha linha horizontal
                if(k!=1){
                    linhaHorizontal();
                }
                v = Integer.toString(lista.elemento(k));
                quadrado(v,s);
                linhaVertical(s);
                x = x+p;
            }   
            //informa o numero de elementos na lista
            elementos--;
        }
    }
    
    public int elementos(){
        return elementos;
    }
    
    
    public ListasPanel() {
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
