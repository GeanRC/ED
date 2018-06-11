
package InterfaceGrafica;

import Panels.PilhaPanel;
import Panels.validar;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class Pilha extends javax.swing.JFrame {
    validar validar = new validar();
    PilhaPanel pilha = new PilhaPanel();
    
    public Pilha() {
        initComponents();        
        jPanel2.add(pilha);
        pilha.setSize(589,400);
        setLocationRelativeTo(null);
    }   
    
    public void reload(int elementos){
        //atualiza elementos
        elementos_txt.setText(Integer.toString(elementos));
        //limpa os valores
        topo_txt.setText("");
        valor_txt.setText("");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        push_bt = new javax.swing.JButton();
        pop_bt = new javax.swing.JButton();
        top_bt = new javax.swing.JButton();
        valor_txt = new javax.swing.JTextField();
        valor_lb = new javax.swing.JLabel();
        elementos_lb = new javax.swing.JLabel();
        elementos_txt = new javax.swing.JLabel();
        topo_lb = new javax.swing.JLabel();
        topo_txt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pilha Encadeada");

        push_bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        push_bt.setText("Push");
        push_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                push_btActionPerformed(evt);
            }
        });

        pop_bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pop_bt.setText("Pop");
        pop_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_btActionPerformed(evt);
            }
        });

        top_bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        top_bt.setText("Top");
        top_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_btActionPerformed(evt);
            }
        });

        valor_txt.setOpaque(false);

        valor_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor_lb.setText("Valor:");

        elementos_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        elementos_lb.setText("Elementos:");

        topo_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        topo_lb.setText("Topo:");

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(589, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pop_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elementos_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(push_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor_txt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valor_lb)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topo_lb)
                        .addGap(38, 38, 38)
                        .addComponent(topo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topo_lb)
                    .addComponent(topo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(elementos_lb)
                    .addComponent(elementos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(push_bt)
                .addGap(18, 18, 18)
                .addComponent(pop_bt)
                .addGap(18, 18, 18)
                .addComponent(top_bt)
                .addGap(18, 18, 18)
                .addComponent(valor_lb)
                .addGap(18, 18, 18)
                .addComponent(valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void push_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_push_btActionPerformed
        if(validar.validarValor(valor_txt.getText())){
            pilha.inserir(valor_txt.getText());
            reload(pilha.elementos());
        }        
    }//GEN-LAST:event_push_btActionPerformed

    private void pop_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_btActionPerformed
        if(pilha.pilhaEnc.vazia()){
            JOptionPane.showMessageDialog(rootPane, "Pilha Vazia", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            pilha.remover();
            reload(pilha.elementos());
        }
    }//GEN-LAST:event_pop_btActionPerformed
    private void top_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_btActionPerformed
        if(pilha.pilhaEnc.vazia()){
            JOptionPane.showMessageDialog(rootPane, "Pilha vazia", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            topo_txt.setText(Integer.toString(pilha.pilhaEnc.top()));
        }
    }//GEN-LAST:event_top_btActionPerformed

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
            java.util.logging.Logger.getLogger(Pilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementos_lb;
    private javax.swing.JLabel elementos_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pop_bt;
    private javax.swing.JButton push_bt;
    private javax.swing.JButton top_bt;
    private javax.swing.JLabel topo_lb;
    private javax.swing.JLabel topo_txt;
    private javax.swing.JLabel valor_lb;
    private javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
