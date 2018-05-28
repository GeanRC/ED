
package q10ed;

/*
 * @author Gean RC
 */

import java.util.Scanner;

public class Q10ED {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        //T = numero de casos
        while(T-- > 0) {
            String[] tabela = new String[101];
            int contador = 0;
            int operacoes = s.nextInt();
            while(operacoes-- > 0) {
                String op = s.next();
                String val = op.substring(4);
                int hash = hash(val);
                if(op.charAt(0) == 'A') {
                    boolean duplicate = false;
                    for(int i = 0 ; i < tabela.length ; i++)
                        if(tabela[i] != null && tabela[i].equals(val)) {
                            duplicate = true;
                        }
                    if(duplicate)
                        continue;
                    int tries = 0;
                    while(tries < 20) {
                        int newHash = (int)(hash + Math.pow(tries, 2) + 23*tries) % 101;
                        if(tabela[newHash] == null || tabela[newHash].equals(val)) {
                            if(tabela[newHash] == null)
                                contador++;
                            tabela[newHash] = val;
                            break;
                        }
                        tries++;
                    }
                }else{
                    int tries = 0;
                    while(tries < 20) {
                        int newHash = (int)(hash + Math.pow(tries, 2) + 23*tries) % 101;
                        if(tabela[newHash] != null && tabela[newHash].equals(val)) {
                            contador--;
                            tabela[newHash] = null;
                            break;
                        }
                        tries++;
                    }
                }
            }
            System.out.println(contador);
            for(int i = 0 ; i < tabela.length ; i++)
                if(tabela[i] != null)
                    System.out.println(i+":"+tabela[i]);
        }
    }
    static int hash(String key) {
        return h(key) % 101;
    }
    static int h(String key) {
        int h = 0;
        for(int i = 0 ; i < key.length() ; i++)
            h+=key.charAt(i)*(i+1);
        return 19*h;
    }
}
