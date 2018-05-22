
package q9ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */
public class Q9ED {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a-1+b-1+2*(a-1)*(b-1));
        }
    }
}
