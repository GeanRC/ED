
package InterfaceGrafica;

import Implementacoes.ListaSeq;
import Panels.ListasPanel;
import Panels.validar;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class ListaSequenc extends javax.swing.JFrame {
    validar validar = new validar();
    ListasPanel listas = new ListasPanel();
    
    public ListaSequenc() {
        initComponents();
        jPanel2.add(listas);
        listas.setSize(589,400);
        listas.setS(1);
        setLocationRelativeTo(null);
    }
    
    public void reload(int elementos){
        //atualzia elementos
        elementos_txt.setText(Integer.toString(elementos));
        //limpa campos
        valor_txt.setText("");
        posicao_txt.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inserir_Bt = new javax.swing.JButton();
        remover_Bt = new javax.swing.JButton();
        pesquisar_Bt = new javax.swing.JButton();
        valor_txt = new javax.swing.JTextField();
        posicao_txt = new javax.swing.JTextField();
        valor_lb = new javax.swing.JLabel();
        posicao_lb = new javax.swing.JLabel();
        elementos_lb = new javax.swing.JLabel();
        elementos_txt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Sequêncial");

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

        pesquisar_Bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pesquisar_Bt.setText("Pesquisar");
        pesquisar_Bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_BtActionPerformed(evt);
            }
        });

        valor_txt.setOpaque(false);

        posicao_txt.setOpaque(false);

        valor_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor_lb.setText("Valor:");

        posicao_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        posicao_lb.setText("Posição:");

        elementos_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        elementos_lb.setText("Elementos:");

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(582, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elementos_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(posicao_lb)
                    .addComponent(valor_lb)
                    .addComponent(pesquisar_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inserir_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor_txt)
                    .addComponent(posicao_txt))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(elementos_lb)
                    .addComponent(elementos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inserir_Bt)
                .addGap(18, 18, 18)
                .addComponent(remover_Bt)
                .addGap(18, 18, 18)
                .addComponent(pesquisar_Bt)
                .addGap(18, 18, 18)
                .addComponent(valor_lb)
                .addGap(18, 18, 18)
                .addComponent(valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(posicao_lb)
                .addGap(18, 18, 18)
                .addComponent(posicao_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserir_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_BtActionPerformed
        if(validar.validarValor(valor_txt.getText()) & validar.validarPosicao(posicao_txt.getText())){
            listas.inserir(valor_txt.getText(), posicao_txt.getText());
            reload(listas.elementos());
        }
    }//GEN-LAST:event_inserir_BtActionPerformed
    
    private void remover_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_BtActionPerformed
        if(listas.lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "LISTA VAZIA", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else if(validar.validarPosicao(posicao_txt.getText())){
            listas.remover(posicao_txt.getText());
            reload(listas.elementos());
        }  
    }//GEN-LAST:event_remover_BtActionPerformed
    private void pesquisar_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_BtActionPerformed
        if(listas.lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Lista Vazia!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(validar.validarPosicao(posicao_txt.getText())){
            int posicao = Integer.parseInt(posicao_txt.getText());
            posicao_txt.setText(null);
            valor_txt.setText(Integer.toString(listas.lista.elemento(posicao)));
        }
    }//GEN-LAST:event_pesquisar_BtActionPerformed

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
            java.util.logging.Logger.getLogger(ListaSeq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSeq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSeq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSeq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSequenc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementos_lb;
    private javax.swing.JLabel elementos_txt;
    private javax.swing.JButton inserir_Bt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pesquisar_Bt;
    private javax.swing.JLabel posicao_lb;
    private javax.swing.JTextField posicao_txt;
    private javax.swing.JButton remover_Bt;
    private javax.swing.JLabel valor_lb;
    private javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
