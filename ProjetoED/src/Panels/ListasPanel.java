
package Panels;

import Implementacoes.ListaSE;
import java.awt.Color;
import java.awt.Graphics;

/*
 * @author Gean RC
 */

public class ListasPanel extends javax.swing.JPanel {
    public ListaSE lista = new ListaSE();
    int eixoX = 20;
    String v = new String();    
    int valor, posicao;
    int elementos = 0;
    int w,j,m,o,s,p=0;    
      
    public void setS(int x){
        s = x;
    }
    
    public void quadrado(String Valor, int s){
        Graphics l = getGraphics();
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
        l.drawRect(eixoX,200,j,20);
        //string com os valores
        l.drawString(Valor,eixoX+10, 210);
    }
    
    public void linhaVertical(int s){ 
        Graphics l = getGraphics();
        int j=0;
        //muda a coordenada la linha dependendo do tipo de encadeamento 
        if(s==2){
            j=25;
        }else if(s==3){
            j=35;
        }
        //linha vertical
        l.setColor(Color.BLUE);
        l.drawLine(eixoX+j, 200, eixoX+j, 220);
        if(s==3){
            //linha adicional na duplamente encadeada
            l.drawLine(eixoX+5, 200, eixoX+5, 220);
        }
        l.setColor(Color.BLACK);
    }
    
    public void linhaHorizontal(){
        Graphics l = getGraphics();
        //linha horizontal
        l.setColor(Color.BLUE);
        l.drawLine(eixoX-15, 210, eixoX, 210);
        l.setColor(Color.BLACK);
    }
    
    public void inserir(String Valor, String Posicao){   
        Graphics l = getGraphics();
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
            eixoX = eixoX+p;
        }else if (Integer.parseInt(Posicao)== elementos+1){ 
        //insere no fim   
            quadrado(Valor,s);
            if(s!=1){
                linhaVertical(s);
            }
            linhaHorizontal();
            eixoX = eixoX+p;
        }else if(0<Integer.parseInt(Posicao) && Integer.parseInt(Posicao)<elementos+1){
        //insere no meio ou no inicio    
            if(Integer.parseInt(Posicao) ==1){
                //limpa
                l.clearRect(20, 190,500, 20);  
                eixoX = 20;
                quadrado(Valor,s);
                if(s!=1){
                    linhaVertical(s);
                }   
                eixoX = eixoX+p;
                //desloca o desenho
            }else{ 
                eixoX = 20;
                quadrado(" ",s);
                eixoX = eixoX+p;
                //limpa
                l.clearRect(eixoX, 190,500, 20);
            }
            for(int k = 2; k<=elementos; k++){
                v = Integer.toString(lista.elemento(k));
                quadrado(v,s); 
                if(s!=1){
                    linhaVertical(s);
                }
                linhaHorizontal();
                eixoX = eixoX+p;
            }
        }
    }
    
    public void remover(String Posicao){
        Graphics l = getGraphics();
        if(Integer.parseInt(Posicao)<=elementos){
            int q = Integer.parseInt(Posicao);
            //limpa
            l.clearRect(0, 190,eixoX+100, 500);
            lista.remove(q);
            eixoX = 20;
            //reescreve
            for (int k = 1; k<elementos; k++){
                //se nao e primeira posicao desenha linha horizontal
                if(k!=1){
                    linhaHorizontal();
                }
                v = Integer.toString(lista.elemento(k));
                quadrado(v,s);
                linhaVertical(s);
                eixoX = eixoX+p;
            }   
            //informa o numero de elementos na lista
            elementos--;
        }
    }
    
    public int elementos(){
        return elementos;
    }    
    
    public ListasPanel() {        
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
