
package Panels;

import Panels.validar;
import Implementacoes.FilaEnc;
import Implementacoes.ListaSeq;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class FilaTESTEZIKA extends javax.swing.JFrame {
    validar validar = new validar();
    
    public FilaTESTEZIKA() {
        initComponents();
        createBufferStrategy(1);
        setLocationRelativeTo(null);
    }
    
    Graphics g;    
    FilaEnc fila = new FilaEnc();
    //lista pra desenhar
    ListaSeq lista = new ListaSeq();
    //eixo em destaque X
    int eixoX = 20;
    String v = new String();    
    int valor, posicao;
    int elementos = 0;
    
    public void quadrado(String Valor){
        //quadrado
        g.drawRect(eixoX,200,30 ,20);
        //string com os valores
        g.drawString(Valor,eixoX+10, 210);
    }
    
    public void linhaHorizontal(){
        //linha horizontal
        g.setColor(Color.BLUE);
        g.drawLine(eixoX-15, 210, eixoX, 210); 
        g.setColor(Color.BLACK);
    }
    
    public void inserir(String Valor){
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
    
    public void reload(int elementos){
        //atualiza elementos        
        elementos_txt.setText(Integer.toString(elementos));
        //limpa os valores
        valor_txt.setText(null);        
        inicio_txt.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inserir_Bt = new javax.swing.JButton();
        remover_Bt = new javax.swing.JButton();
        inicio_bt = new javax.swing.JButton();
        valor_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        elementos_txt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicio_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fila Encadeada");

        inserir_Bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inserir_Bt.setText("Inserir");
        inserir_Bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserir_BtActionPerformed(evt);
            }
        });

        remover_Bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        remover_Bt.setText("Remover");
        remover_Bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_BtActionPerformed(evt);
            }
        });

        inicio_bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inicio_bt.setText("Inicio");
        inicio_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio_btActionPerformed(evt);
            }
        });

        valor_txt.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Elementos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inicio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(609, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(inicio_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inserir_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor_txt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(inicio_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(inicio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(elementos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inserir_Bt)
                .addGap(18, 18, 18)
                .addComponent(remover_Bt)
                .addGap(18, 18, 18)
                .addComponent(inicio_bt)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserir_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_BtActionPerformed
        g = getBufferStrategy().getDrawGraphics();
        if(validar.validarValor(valor_txt.getText())){            
            inserir(valor_txt.getText());
            reload(elementos);
        }        
    }//GEN-LAST:event_inserir_BtActionPerformed

    private void remover_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_BtActionPerformed
        g = getBufferStrategy().getDrawGraphics();
        if(fila.vazia()){
            JOptionPane.showMessageDialog(rootPane, "Fila vazia", "ERRO", JOptionPane.ERROR_MESSAGE);        
        }else{
            remover(); 
            reload(elementos);
        }         
    }//GEN-LAST:event_remover_BtActionPerformed

    private void inicio_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio_btActionPerformed
        int v = fila.inicio(); 
        if(v>=0){
            int q = fila.inicio();
            String t = Integer.toString(q);
            inicio_txt.setText(t);            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Fila vazia", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inicio_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windown".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilaTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilaTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilaTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilaTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilaTESTEZIKA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementos_txt;
    private javax.swing.JButton inicio_bt;
    private javax.swing.JLabel inicio_txt;
    private javax.swing.JButton inserir_Bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton remover_Bt;
    private javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
