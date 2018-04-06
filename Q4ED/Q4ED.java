
package q4ed;

import java.util.Scanner;
/*
 * @author Gean RC
 */
public class Q4ED {
    
    private static char dados[]; // Vetor que contem os dados da lista 
    private static int topo; 
    private static int tamMax;
    
    public Q4ED(){
        tamMax = 100;
    	dados = new char[tamMax];    		
    	topo = -1;
    }
    
    public Q4ED(int n){
    	tamMax = n;
    	dados = new char[tamMax];    		
    	topo = -1;
    }
    
    // Verifica se a Pilha esta vazia
    public static boolean vazia(){ 
        if (topo == -1)
            return true;
        else
            return false;
    }
    
    // Verifica se a Pilha esta cheia
    public static boolean cheia(){  
        if (topo == (tamMax-1))
            return true;
        else
            return false;
    }
    
    // obtem o tamanho da Pilha
    public static int tamanho(){ 
		return topo+1;
    }
    
    // Consulta o elemento do topo da Pilha. Retorna -1 se a pilha estiver vazia, se nao retorna o valor do topo
    public static char top (){ 
        if (vazia())
            return (char) -1; // pilha vazia
        return dados[topo];
    }
    
    // Insere um elemento no topo da pilha. Retorna false se a pilha estiver cheia.  Caso contrario retorna true
    public static boolean push (char valor){
        if (cheia())
            return false;  // erro: pilha cheia
        topo++;
        dados[topo] = valor;
        return true;
    }
    
    // Retira o elemento do topo da pilha. Retorna -1 se a pilha estiver vazia
    public static char pop(){
        if (vazia())
            return (char) -1; // Pilha vazia
        char valor = dados[topo];
        topo--;
        return valor;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	String	expressoes; //numero de expressoes
	int Quantidade; // Quantidade de expressoes
        Q4ED pilha = new Q4ED();
	Quantidade = sc.nextInt();	
	while(Quantidade>0){
            expressoes = sc.next();
            String Saida = new String(); 
            int z = expressoes.length();
            char y;
            for(int i=0;i<z;i++){
                y = expressoes.charAt(i);
                switch(y){
                    case '(':
                    break;
                    case '+': pilha.push(y);
                    break;
                    case '-': pilha.push(y);
                    break;
                    case '*': pilha.push(y);
                    break; 
                    case '/': pilha.push(y);
                    break;
                    case '^': pilha.push(y);
                    break;
                    case ')': Saida = Saida + pilha.pop();
                    break;
                    default : Saida = Saida + y; // saida 
                    break;
                }
            }
            System.out.println(Saida);
            Quantidade--;
        }
    }
}
