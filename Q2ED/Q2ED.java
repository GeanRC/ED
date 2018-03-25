
package q2ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */
public class Q2ED {
    
    public static class No{
        private String conteudo;
        private No prox;
        
        public No(){
		setProx(null);
	}

	public String getConteudo(){
		return conteudo;
	}

	public void setConteudo(String conteudo){
		this.conteudo = conteudo;
	}

	public No getProx(){
		return prox;
	}

	public void setProx(No prox){
		this.prox = prox;
	}
    }
    private static No ini;
    private static int nEle;
    private static Scanner sc;
    
    public Q2ED(){
        ini = null;
        nEle = 0;
    }
    
    public static boolean vazia(){
        if(nEle == 0){
            return true;
        }
        return false;
    }

    private static boolean insere(String dado){
        No aux = ini;
        No no = new No();
        no.setConteudo(dado);
        if(vazia())
            ini = no;
        else{
            while(aux.getProx() != null)
                aux = aux.getProx();
            no.setProx(null);
            aux.setProx(no);
        }
        nEle++;
        return true;
    }
    
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int nPala, nPre;
        No aux, aux2;
        nPala = sc.nextInt();
        nPre = sc.nextInt();
        for(int i = 0; i<nPala+nPre; i++)
            insere(sc.next());
        aux = ini;
        for(int i = nPala; i>0; i--)
            aux = aux.getProx();
        aux2 = aux;
        int contador;
        for(int i = nPre; i>0; i--){
            aux = ini;
            contador = 0;
            for(int j = nPala; j>0; j--){
                if(aux.getConteudo().startsWith(aux2.getConteudo(), 0)){
                   contador++;
                }
                aux = aux.getProx();
            }
            System.out.print(contador+" ");
            aux2 = aux2.getProx();
        }
    }    
}