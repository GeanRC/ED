
package InterfaceGrafica;

import Implementacoes.ListaSE;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class ListaEncad extends javax.swing.JFrame {

    public ListaEncad() {
        initComponents();
        createBufferStrategy(1);
        setLocationRelativeTo(null);        
    }
    
    Graphics l;
    int x = 20;
    ListaSE lista = new ListaSE();
    String v = new String();
    int con = 0;
    int c, p;
    int e = 0; 

    public boolean validarCampos(){
        if(valor_txt.getText().isEmpty()){
            //Verifica se tem campo vazio
            JOptionPane.showMessageDialog(this, "Campo vazio! Por favor preencha!", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
                //verifica se foram colocados valores errados
            try {
                Integer.parseInt(valor_txt.getText());
            }catch (NumberFormatException e){
                //Exibe a mensagem de erro caso digitem errado
                JOptionPane.showMessageDialog(this, "Entrada invalida! Apenas numeros", "Invalido!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public boolean validarPosicao(){
        if(posicao_txt.getText().isEmpty()){
            //Verifica se tem campo vazio
            JOptionPane.showMessageDialog(this, "Campo vazio! Por favor preencha!", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
                //verifica se foram colocados valores errados
            try {
                Integer.parseInt(posicao_txt.getText());
            }catch (NumberFormatException e){
                //Exibe a mensagem de erro caso digitem errado
                JOptionPane.showMessageDialog(this, "Entrada invalida! Apenas numeros", "Invalido!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inserir_Bt = new javax.swing.JButton();
        remover_Bt = new javax.swing.JButton();
        pesquisar_Bt = new javax.swing.JButton();
        valor_txt = new javax.swing.JTextField();
        posicao_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Encadeada");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Posição:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pesquisar_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inserir_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remover_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valor_txt)
                        .addComponent(posicao_txt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(inserir_Bt)
                .addGap(18, 18, 18)
                .addComponent(remover_Bt)
                .addGap(18, 18, 18)
                .addComponent(pesquisar_Bt)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(posicao_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserir_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_BtActionPerformed
        l = getBufferStrategy().getDrawGraphics();
        if(validarCampos()){
            if(lista.vazia()){
                l.drawRect(x,200,30 ,20);
                l.drawString(valor_txt.getText(),x+10, 210);
                l.drawLine(x+20, 200, x+20, 220);
                c = Integer.parseInt(valor_txt.getText());
                p = Integer.parseInt(posicao_txt.getText());
                lista.insere(p, c);
                x = x+45;
                l.dispose();
                getBufferStrategy().show();
                e++;
                valor_txt.setText(null);
                posicao_txt.setText(null);
        }
            else if (Integer.parseInt(posicao_txt.getText())== e+1) {
                l.drawRect(x,200,30 ,20);
                l.drawString(valor_txt.getText(),x+10, 210);
                l.drawLine(x+20, 200, x+20, 220);
                l.drawLine(x-15, 210, x, 210);
                c = Integer.parseInt(valor_txt.getText());
                p = Integer.parseInt(posicao_txt.getText());
                lista.insere(p, c);
                x = x+45;
                l.dispose();
                e++;
                getBufferStrategy().show();
                valor_txt.setText(null);
                posicao_txt.setText(null);
                }
            else if(0<Integer.parseInt(posicao_txt.getText()) && Integer.parseInt(posicao_txt.getText())<e+1){
                p = Integer.parseInt(posicao_txt.getText());
                c = Integer.parseInt(valor_txt.getText());
                lista.insere(p, c);

                
                
                
                
                e++;
                x = 20;
                l.drawRect(x,200,30 ,20);
                
//                l.drawString(valor_txt.getText(),x+10, 210);
//                l.drawLine(x+20, 200, x+20, 220);
                
                x = x+45;
                l.clearRect(x, 190,500, 20);
                for (int k = 2; k<=e; k++){
                    //quadrado
                    l.drawRect(x,200,30 ,20);
                    //vetor com elementos ja existentes
                    v = Integer.toString(lista.elemento(k));
                    l.drawString(v,x+10, 210);
                    //traco vertical
                    l.drawLine(x+20, 200, x+20, 220);
                    //traco horizontal
                    l.drawLine(x-15, 210, x, 210);
                    x = x+45;                    
                }
                valor_txt.setText(null);
                posicao_txt.setText(null);
                l.dispose();
                getBufferStrategy().show();                                            
                }
        }
    }//GEN-LAST:event_inserir_BtActionPerformed

    private void remover_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_BtActionPerformed
         l = getBufferStrategy().getDrawGraphics();
        if(lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "LISTA VAZIA", "ERRO", HEIGHT);
        }
        else if(validarPosicao()){
           if(Integer.parseInt(posicao_txt.getText())<=e && validarPosicao()){
               int p = Integer.parseInt(posicao_txt.getText());
               l.clearRect(0, 190,x+100, 500);
               lista.remove(p);
               x = 20;
               for (int k = 1; k<e; k++){
                   if(k==1){
                    l.drawRect(x,200,30 ,20);
                    v = Integer.toString(lista.elemento(k));
                    l.drawString(v,x+10, 210);
                    l.drawLine(x+20, 200, x+20, 220);
                    x = x+45;
                    posicao_txt.setText(null);
                   }
                   else{
                    v = Integer.toString(lista.elemento(k));   
                    l.drawRect(x, 200, 30, 20);
                    l.drawString(v,x+10, 210);
                    l.drawLine(x+20, 200, x+20, 220);
                    l.drawLine(x-15, 210, x, 210);
                    x = x+45;
                                      }
               }
               l.dispose();
               getBufferStrategy().show();
               e--;           
           }
        }
    }//GEN-LAST:event_remover_BtActionPerformed

    private void pesquisar_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_BtActionPerformed
        if(lista.vazia()){
        JOptionPane.showMessageDialog(rootPane, "ERRO: Lista Vazia ou Posicao!", "ERRO", HEIGHT);
        }
//        else if(validarCampos()){
//            c = Integer.parseInt(valor_txt.getText());
//            
//            posicao_txt.setText(Integer.toString(lista.posicao(c)));
//            valor_txt.setText(null);
//                }
        else if(validarPosicao()){
            p = Integer.parseInt(posicao_txt.getText());
            
            valor_txt.setText(Integer.toString(lista.elemento(p)));
            posicao_txt.setText(null);
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
            java.util.logging.Logger.getLogger(ListaEncad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEncad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEncad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEncad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEncad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inserir_Bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton pesquisar_Bt;
    private javax.swing.JTextField posicao_txt;
    private javax.swing.JButton remover_Bt;
    private javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
