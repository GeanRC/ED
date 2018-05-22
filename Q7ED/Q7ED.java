
package q7ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */

public class Q7ED {
    
    
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        int profAux, quantArv;
        int prof;
        char[] Nos;
        boolean[] chec;

        quantArv = Integer.parseInt (scan.nextLine());
        for(; quantArv >= 1; quantArv--){
            String no = scan.nextLine();
            if (no.equals("l")){
                prof = 0;
                System.out.println(prof);
            }else{
                profAux = 0;
                prof = 0;
                chec = new boolean [no.length()];
                chec[0] = true;
                Nos = new char[no.length()];
                for(int i = 0; i < no.length(); i++){
                    Nos[i] = no.charAt(i);
                }
                for (int i = 0; i < Nos.length; i++){
                    if(Nos[i] == 'n'){
                        profAux++;
                        chec[profAux] = true;
                    }else{
                        while(chec[profAux] != true){
                            profAux--;
                        }
                        chec[profAux] = false;
                    }
                    if(profAux > prof){
                        prof = profAux;
                    }                    
                }                
                System.out.println(prof);                
            }            
        }
    }    
}
