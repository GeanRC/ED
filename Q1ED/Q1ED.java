
package q1ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */
public class Q1ED {
    
    public static void main(String[] args) {
        int Quantidade1, Quantidade2, Seq1, Seq2;
        int[]s = new int[100];
        int[]q = new int[100];
        Scanner sc = new Scanner(System.in);
        //variaveis e vetores
        Quantidade1 = sc.nextInt();
        for(Seq1=0;Seq1<Quantidade1;Seq1++)
            s[Seq1] = sc.nextInt();//Entrada da primeira sequencia 
        Quantidade2 = sc.nextInt();
        for(Seq2=0;Seq2<Quantidade2;Seq2++)
            q[Seq2] = sc.nextInt();//Entrada da segunda sequencia
        for(Seq1=0, Seq2=0; Seq1<Quantidade1 && Seq2<Quantidade2;){
            if(s[Seq1]-q[Seq2]<0){
                System.out.print(s[Seq1]+" ");
                Seq1++;
            }
            else if(s[Seq1]==q[Seq2])
                Seq1++;
            else
                Seq2++;
        }
        for(;Seq1<Quantidade1;Seq1++){
            System.out.print(s[Seq1]+" ");
        }//Comparacao e saida de dados :)
    }    
}
