package Panels;

import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */
public class validar {
    
    public boolean soValor(String valor){
        if(valor.isEmpty()){
            //Verifica se tem campo vazio
            JOptionPane.showMessageDialog(null, "Campo vazio! Por favor preencha!", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
  
    public boolean validarValor(String valor){
        if(valor.isEmpty()){
            //Verifica se tem campo vazio
            JOptionPane.showMessageDialog(null, "Campo vazio! Por favor preencha!", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
                //verifica se foram colocados valores errados
            try {
                Integer.parseInt(valor);
            }catch (NumberFormatException e){
                //Exibe a mensagem de erro caso digitem errado
                JOptionPane.showMessageDialog(null, "Entrada invalida! Apenas numeros", "Invalido!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public boolean validarPosicao(String posicao){
        if(posicao.isEmpty()){
            //Verifica se tem campo vazio
            JOptionPane.showMessageDialog(null, "Campo vazio! Por favor preencha!", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
                //verifica se foram colocados valores errados
            try {
                Integer.parseInt(posicao);
            }catch (NumberFormatException e){
                //Exibe a mensagem de erro caso digitem errado
                JOptionPane.showMessageDialog(null, "Entrada invalida! Apenas numeros", "Invalido!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
}
