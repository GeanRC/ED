
package q8ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */

public class Q8ED {
    
    public static class ABP {
        
        static class No {
            private int conteudo;
            private No esq;
            private No dir;
            
            public No(){
                esq = null;
                dir = null;
            }
            
            public int getConteudo(){
                return conteudo;
            }
            
            public void setConteudo(int conteudo){
                this.conteudo = conteudo;
            }
            
            public No getEsq(){
                return esq;
            }
            
            public void setEsq(No esq){
                this.esq = esq;
            }
            
            public No getDir(){
                return dir;
            }
            
            public void setDir(No dir){
                this.dir = dir;
            }
        }
    
        private No raiz;
        private int saida;
        
        public ABP(){
            saida = 0;
            raiz = null;
        }
        
        public int get_saida(){
            return saida;
        }
        
        public boolean vazia(){
            return (raiz == null);
        }
        
        private No busca(No T, int valor){
            if(T == null)
                return null;
            if(T.getConteudo() == valor)
                return T;
            if(valor < T.getConteudo())
                return busca(T.getEsq(), valor);
            else
                return busca(T.getDir(), valor);
        }
        
        public No busca(int valor){  
            if(raiz != null) 
                return busca(raiz, valor);
            return null;
        }
        
        private void exibe(No T){
            if(T != null){
                exibe(T.getEsq());
                System.out.print(" " + T.getConteudo());
                exibe(T.getDir());
            }
        }
        
        public void exibe(){
            if(raiz == null)
                System.out.println("Arvore vazia");
            else
                exibe(raiz);
        }
        
        public boolean insere(int valor){
            No novoNo = new No();
            novoNo.setConteudo(valor);
            novoNo.setEsq(null);
            novoNo.setDir(null);
            if(raiz == null){
                raiz = novoNo;
                return true;
            }
            No aux = raiz;
            No p = null;
            while(aux != null) {
                p = aux;
                if(valor < aux.getConteudo()){
                    aux = aux.getEsq();
                    saida++;
                }else{
                    aux = aux.getDir();
                    saida++;
                }
            }
            if(valor < p.getConteudo()){
                p.setEsq(novoNo);
            }else{
                p.setDir(novoNo);
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ABP arvore = new ABP();
        int valor, nElementos;
        nElementos = Integer.parseInt(scan.nextLine());
        if(nElementos > 300000) return;
        for(int i = 0; i < nElementos; i++){
            valor = Integer.parseInt(scan.nextLine());
            arvore.insere(valor);
            System.out.println(arvore.get_saida());
        }
    }
}
