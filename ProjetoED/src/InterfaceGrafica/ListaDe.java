
package InterfaceGrafica;

import Implementacoes.ListaDE;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class ListaDe extends javax.swing.JFrame {

    public ListaDe() {
        initComponents();
        createBufferStrategy(1);
        setLocationRelativeTo(null);
    }
    
    Graphics l;    
    ListaDE lista = new ListaDE();
    //eixo em destaque X
    int x = 20;
    String v = new String();    
    int valor, posicao;
    int elementos = 0;
    
    public boolean validarValor(){
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
        valor_lb = new javax.swing.JLabel();
        posicao_lb = new javax.swing.JLabel();
        elementos_lb = new javax.swing.JLabel();
        elementos_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista DE");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
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
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserir_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_BtActionPerformed
        l = getBufferStrategy().getDrawGraphics();
        if(validarValor() && validarPosicao()){
            //pega os valores digitados e coloca na lista
            valor = Integer.parseInt(valor_txt.getText());
            posicao = Integer.parseInt(posicao_txt.getText());
            lista.insere(posicao, valor); 
            //informa o numero de elementos na lista
            elementos++;
            elementos_txt.setText(Integer.toString(elementos));                
            //insere em lista vazia
            if(lista.vazia()){                
                //quadrado
                l.drawRect(x,200,40 ,20);
                //string com os valores
                l.drawString(valor_txt.getText(),x+10, 210);
                //linha vertical
                l.drawLine(x+5, 200, x+5, 220);
                l.drawLine(x+35, 200, x+35, 220);
                x = x+45;
                l.dispose();
                getBufferStrategy().show();                   
            }            
            //insere no fim
            else if (Integer.parseInt(posicao_txt.getText())== elementos+1){ 
                //quadrado
                l.drawRect(x,200,40 ,20);
                //string com os valores
                l.drawString(valor_txt.getText(),x+10, 210);
                //linha vertical
                l.drawLine(x+5, 200, x+5, 220);
                l.drawLine(x+35, 200, x+35, 220);
                //linha horizontal
                l.drawLine(x-5, 215, x, 215);            
                x = x+45;
                l.dispose();           
                getBufferStrategy().show();                
            }
            //insere no meio ou no inicio
            else if(0<Integer.parseInt(posicao_txt.getText()) && Integer.parseInt(posicao_txt.getText())<elementos+1){
                if(Integer.parseInt(posicao_txt.getText()) ==1){
                    //limpa
                    l.clearRect(20, 190,500, 20);                   
                    x = 20;
                    //quadrado
                    l.drawRect(x,200,40 ,20);
                    //string com os valores
                    l.drawString(valor_txt.getText(),x+10, 210);
                    //linha vertical
                    l.drawLine(x+5, 200, x+5, 220);
                    l.drawLine(x+35, 200, x+35, 220);
                    x = x+45;
                    //desloca o desenho
                }
                else{  
                    x = 20;
                    //quadrado
                    l.drawRect(x,200,40 ,20);
                    x = x+45;
                    //limpa
                    l.clearRect(x, 190,500, 20);
                }
                for(int k = 2; k<=elementos; k++){
                    //quadrado
                    l.drawRect(x,200,40 ,20);
                    //string com os valores
                    v = Integer.toString(lista.elemento(k));
                    l.drawString(v,x+10, 210);
                    //linha vertical
                    l.drawLine(x+5, 200, x+5, 220);
                    l.drawLine(x+35, 200, x+35, 220);
                    //linha horizontal                    
                    l.drawLine(x-5, 210, x, 210);
                    x = x+45;  
                }
            }
        }
        //limpa os valores
        valor_txt.setText(null);
        posicao_txt.setText(null); 
    }//GEN-LAST:event_inserir_BtActionPerformed

    private void remover_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_BtActionPerformed
        l = getBufferStrategy().getDrawGraphics();
        if(lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "LISTA VAZIA", "ERRO", HEIGHT);
        }
        else if(validarPosicao()){
            if(Integer.parseInt(posicao_txt.getText())<=elementos && validarPosicao()){
                int p = Integer.parseInt(posicao_txt.getText());
                //limpa
                l.clearRect(0, 190,x+100, 500);
                lista.remove(p);
                x = 20;
                //reescreve 
                for (int k = 1; k<elementos; k++){
                    if(k==1){
                        //quadrado
                        l.drawRect(x,200,40 ,20);
                        //linhas verticais
                        l.drawLine(x+5, 200, x+5, 220);
                        l.drawLine(x+35, 200, x+35, 220);
                        //string com os valores
                        v = Integer.toString(lista.elemento(k));                        
                        l.drawString(v,x+10, 210);
                        x = x+45;
                        posicao_txt.setText(null);
                    }
                    //se nao for 1 desenha a ligacao
                    else{
                        //quadrado
                        l.drawRect(x, 200, 40, 20);
                        //linhas verticais
                        l.drawLine(x+5, 200, x+5, 220);
                        l.drawLine(x+35, 200, x+35, 220);
                        //string com os valores
                        v = Integer.toString(lista.elemento(k));  
                        l.drawString(v,x+10, 210);
                        //horizontal
                        l.drawLine(x-5, 210, x, 210); 
                        x = x+45;
                    }
                }
                l.dispose();
                getBufferStrategy().show();
                //informa o numero de elementos na lista
                elementos--; 
                elementos_txt.setText(Integer.toString(elementos));
            }
        }
    }//GEN-LAST:event_remover_BtActionPerformed
    private void pesquisar_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_BtActionPerformed
        if(lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Lista Vazia!", "ERRO", HEIGHT);
        }
        else if(validarPosicao()){
            posicao = Integer.parseInt(posicao_txt.getText());
            posicao_txt.setText(null);
            valor_txt.setText(Integer.toString(lista.elemento(posicao)));
                }
        else if(validarPosicao()){
            valor = Integer.parseInt(valor_txt.getText());
            posicao_txt.setText(null);
            valor_txt.setText(Integer.toString(lista.posicao(valor)));
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
            java.util.logging.Logger.getLogger(ListaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementos_lb;
    private javax.swing.JLabel elementos_txt;
    private javax.swing.JButton inserir_Bt;
    private javax.swing.JButton pesquisar_Bt;
    private javax.swing.JLabel posicao_lb;
    private javax.swing.JTextField posicao_txt;
    private javax.swing.JButton remover_Bt;
    private javax.swing.JLabel valor_lb;
    private javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
