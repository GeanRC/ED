
package Panels;

import Panels.validar;
import Implementacoes.ListaSE;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class ListaSeTESTEZIKA extends javax.swing.JFrame {
    validar validar = new validar();
    
    public ListaSeTESTEZIKA() {
        initComponents();
        createBufferStrategy(1);
        setLocationRelativeTo(null);
    }
    
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
        l = getBufferStrategy().getDrawGraphics();
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
    
    public void reload(){
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
        setTitle("Lista SE");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(posicao_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserir_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_BtActionPerformed
        l = getBufferStrategy().getDrawGraphics();
        if(validar.validarValor(valor_txt.getText()) & validar.validarPosicao(posicao_txt.getText())){
                inserir(valor_txt.getText(), posicao_txt.getText());
                reload();
        }
    }//GEN-LAST:event_inserir_BtActionPerformed

    private void remover_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_BtActionPerformed
        if(lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "LISTA VAZIA", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else if(validar.validarPosicao(posicao_txt.getText())){
            remover(posicao_txt.getText());
            reload();
        }        
    }//GEN-LAST:event_remover_BtActionPerformed
    private void pesquisar_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_BtActionPerformed
        if(lista.vazia()){
            JOptionPane.showMessageDialog(rootPane, "ERRO: Lista Vazia!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(validar.validarPosicao(posicao_txt.getText())){
            posicao = Integer.parseInt(posicao_txt.getText());
            posicao_txt.setText(null);
            valor_txt.setText(Integer.toString(lista.elemento(posicao)));
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
            java.util.logging.Logger.getLogger(ListaSeTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSeTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSeTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSeTESTEZIKA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSeTESTEZIKA().setVisible(true);
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
