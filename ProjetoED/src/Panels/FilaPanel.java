
package Panels;

import Implementacoes.FilaEnc;
import Implementacoes.ListaSeq;
import java.awt.Color;
import java.awt.Graphics;

/*
 * @author Gean RC
 */

public class FilaPanel extends javax.swing.JPanel {
    public FilaEnc fila = new FilaEnc();
    //lista pra desenhar
    ListaSeq lista = new ListaSeq();
    //eixo em destaque X
    int eixoX = 20;
    String v = new String();    
    int valor, posicao;
    int elementos = 0;
    
    public void quadrado(String Valor){
        Graphics g = getGraphics();
        //quadrado
        g.drawRect(eixoX,200,30 ,20);
        //string com os valores
        g.drawString(Valor,eixoX+10, 210);
    }
    
    public void linhaHorizontal(){
        Graphics g = getGraphics();
        //linha horizontal
        g.setColor(Color.BLUE);
        g.drawLine(eixoX-15, 210, eixoX, 210); 
        g.setColor(Color.BLACK);
    }
    
    public void inserir(String Valor){
        Graphics g = getGraphics();
        if(fila.vazia()==false){
            linhaHorizontal();
        }        
        //pega os valores digitados e coloca na lista
        valor = Integer.parseInt(Valor);            
        fila.insere(valor);
        //informa o numero de elementos na lista
        elementos++;
        //lista pra desenhar
        lista.insere(elementos, valor);
        quadrado(Valor);
        eixoX = eixoX+45;
    }
    
    public void remover(){
        Graphics g = getGraphics();
        //limpa
        g.clearRect(0, 190,eixoX+100, 500);
        fila.remove();
        lista.remove(1);
        eixoX = 20;
        //reescreve 
        for (int k = 1; k<elementos; k++){
            v = Integer.toString(lista.elemento(k));
            quadrado(v);           
            if(k>1){                
                linhaHorizontal();
            }
            eixoX = eixoX+45;
        }
        elementos--;
    }
    
    public int elementos(){
        return elementos;
    }
    
    public FilaPanel() {
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
