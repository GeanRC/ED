
package Panels;

import Implementacoes.PilhaEnc;
import java.awt.Color;
import java.awt.Graphics;

/*
 * @author Gean RC
 */

public class PilhaPanel extends javax.swing.JPanel {    
    public PilhaEnc pilhaEnc = new PilhaEnc();    
    int eixoY = 300;
    String v = new String();
    int valor;
    int elementos = 0;
    
    public void quadrado(String t){
        Graphics e = getGraphics();
        //quadrado
        e.drawRect(250, eixoY, 40, 50);
        //string com os valores
        e.drawString(t, 270, eixoY+30);
    }
    
    public void linhaVertical(){
        Graphics e = getGraphics();
         //linha vertical
         e.setColor(Color.BLUE);
         e.drawLine(275,eixoY+50 ,275 ,eixoY+70);
         e.setColor(Color.BLACK);
    }
    
    public void linhaHorizontal(){
        Graphics e = getGraphics();
        //linha horizontal
        e.setColor(Color.BLUE);
        e.drawLine(250, eixoY+15, 290, eixoY+15);
        e.setColor(Color.BLACK);
    }
    
    public void inserir(String Valor){
        Graphics e = getGraphics();
        if(pilhaEnc.vazia()==false){
             linhaVertical();
        }
        //pega valor digitado e coloca na pilha
        valor = Integer.parseInt(Valor);
        pilhaEnc.push(valor);              
        linhaHorizontal();
        quadrado(Valor);        
        eixoY = eixoY-70;      
        //informa o numero de elementos na pilha
        elementos++;
    }
    
    public void remover(){
        Graphics e = getGraphics();
        //remove valor da pilha
        pilhaEnc.pop();
        //limpa e meche no Y
        e.clearRect(249, eixoY+70, 42, 70);
        eixoY = eixoY + 70;
        //informa o numero de elementos na pilha
        elementos--;
    }
    
    public int elementos(){
        return elementos;
    }
    
    public PilhaPanel() {
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
