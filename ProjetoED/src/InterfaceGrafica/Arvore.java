
package InterfaceGrafica;

import Panels.validar;
import Panels.ArvPanel;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class Arvore extends javax.swing.JFrame {
    ArvPanel arvore = new ArvPanel();
    validar validar = new validar();
    
    public Arvore(){
        initComponents();
        exibir_bt.setEnabled(false);
        painel_jp.add(arvore);
        arvore.setSize(700,417);
        setLocationRelativeTo(null);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adicionar_bt = new javax.swing.JButton();
        adicionar_txt = new javax.swing.JTextField();
        pesquisar_txt = new javax.swing.JTextField();
        pesquisar_bt = new javax.swing.JButton();
        exibir_bt = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        painel_jp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Árvore binária de busca ");

        adicionar_bt.setText("Adicionar");
        adicionar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar_btActionPerformed(evt);
            }
        });

        adicionar_txt.setOpaque(false);

        pesquisar_txt.setOpaque(false);

        pesquisar_bt.setText("Pesquisar");
        pesquisar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_btActionPerformed(evt);
            }
        });

        exibir_bt.setText("Exibir conteudo");
        exibir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibir_btActionPerformed(evt);
            }
        });

        painel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout painel_jpLayout = new javax.swing.GroupLayout(painel_jp);
        painel_jp.setLayout(painel_jpLayout);
        painel_jpLayout.setHorizontalGroup(
            painel_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        painel_jpLayout.setVerticalGroup(
            painel_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        painel.add(painel_jp, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adicionar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionar_bt)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisar_bt)
                        .addGap(18, 18, 18)
                        .addComponent(exibir_bt))
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar_bt)
                    .addComponent(exibir_bt)
                    .addComponent(adicionar_bt)
                    .addComponent(adicionar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar_btActionPerformed
        if(validar.soValor(adicionar_txt.getText())){
            String str = adicionar_txt.getText(); 
            arvore.chamar(str);
            exibir_bt.setEnabled(true);            
        }
    }//GEN-LAST:event_adicionar_btActionPerformed

    private void pesquisar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_btActionPerformed
        if(validar.validarValor(pesquisar_txt.getText())){
            //passa o valor a ser pesquisado
            int x = Integer.parseInt(pesquisar_txt.getText());
            //procura o valor 
            if(arvore.buscar(x)){
            //informa se encontrar
            JOptionPane.showMessageDialog(null, x + "   Encontrado");
            }else{
                //informa se nao encontrar
                JOptionPane.showMessageDialog(null, x+"   Nao encontrado", "Erro" , JOptionPane.ERROR_MESSAGE); 
            }
        }
        pesquisar_txt.setText("");
    }//GEN-LAST:event_pesquisar_btActionPerformed

    private void exibir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibir_btActionPerformed
        arvore.printar();
    }//GEN-LAST:event_exibir_btActionPerformed

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
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arvore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar_bt;
    private javax.swing.JTextField adicionar_txt;
    private javax.swing.JButton exibir_bt;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel_jp;
    private javax.swing.JButton pesquisar_bt;
    private javax.swing.JTextField pesquisar_txt;
    // End of variables declaration//GEN-END:variables
}
