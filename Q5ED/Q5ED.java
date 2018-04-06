
package q5ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */

public class Q5ED {
    
    public static class No{
        private No ant;
        private int conteudo;
        private No proximo;
        
        public No(){
            ant = null;
            proximo = null;
        }
        
        public int getConteudo(){
            return conteudo;
        }
        
        public void setConteudo(int c){
            conteudo = c;
        }
        
        public No getAnterior(){
            return ant;
        }
        
        public void setAnterior(No a){
            ant = a;
        }
        
        public No getProximo(){
            return proximo;
        }
        
        public void setProximo(No p){
            proximo = p;
        }
    }
    
    public static class Lista{
        private No inicio;
        private No fim;
        private int tamanho;
        private boolean isReversed = false;
        
        public Lista(){
            inicio = null;
            fim = null;
            tamanho = 0;
        }
        
        //verifica se a lista esta vazia
        public boolean vazia(){
            if(tamanho == 0)
                return true;
            else return false;
        }
        
        //retorna o tamanho da lista        
        public int tamanho(){
            return tamanho;
        }
        
        private void insereInicioLista(String valor){
            int n = Integer.parseInt(valor);
            if (isReversed){
                String aux = Integer.toString(n); 
                reverse();
                insereFimLista(aux);
                reverse();
            }
            else{
            // Aloca memoria para um novo no
            No novoNo = new No();
            // Insere novo elemento na cabeca da lista
            novoNo.setConteudo(n);
            novoNo.setAnterior(null);
            if (vazia()){
                novoNo.setProximo(null);
                inicio = novoNo;
                fim = novoNo;                
            }
            else{
                novoNo.setProximo(inicio);
                inicio.setAnterior(novoNo);
                inicio = novoNo;
            }
            tamanho++;
            }
        }
        
        private void insereFimLista(String valor){
            int n = Integer.parseInt(valor);
            if (isReversed){
                String aux = Integer.toString(n);
                reverse();
                insereInicioLista(aux);
                reverse();
            }
            else{
            // Aloca memoria para um novo no */
            No novoNo = new No();
            // Insere novo elemento na cabeca da lista
            novoNo.setConteudo(n);
            novoNo.setProximo(null);
            if (vazia()){
                novoNo.setAnterior(null);
                inicio = novoNo;
                fim = novoNo;
            }
            else{
                novoNo.setAnterior(fim);
                fim.setProximo(novoNo);
                fim = novoNo;
            }
            tamanho++;
            }
        }
        
 
        public void removeInicioLista() throws Exception {
        
        
        if (isReversed) {
            reverse();
            removeFimLista();
            reverse();
        }
        
       
        else{
            if(tamanho == 0){
                    System.out.println("No job for Ada?");
            }else{
            int aux2 = inicio.getConteudo();
            if (tamanho == 1) {
                inicio = null;
                fim = null;
            } else {
                No aux = inicio;
                inicio = inicio.getProximo();
                inicio.setAnterior(null);
                aux = null;
                
            }
            
            tamanho--;
            System.out.println(aux2);
        }
        }
    }
        public void removeFimLista() throws Exception {
            if (isReversed){
                reverse();
                removeInicioLista();
                reverse();
            }
            else{
                if(tamanho == 0){
                    System.out.println("No job for Ada?");
                }
                else{
                    int aux3 = fim.getConteudo();
                    if (tamanho == 1){
                        fim = null;
                        inicio = null;
                    } 
                    else {
                        No aux = fim;
                        fim = fim.getAnterior();
                        fim.setProximo(null);
                        aux = null;
                    }
                    tamanho--;
                    System.out.println(aux3);
                }
            }
        }
        public void reverse(){
            if(tamanho == 0){
                return;
            }
            No aux = inicio;
            inicio = fim;
            fim = aux;
            isReversed = !isReversed;
        }
    }
    
    public static void main(String[] args) throws Exception{
        
        Lista l = new Lista();
        Scanner s = new Scanner(System.in);
        String a = new String();
        int n = Integer.parseInt(s.nextLine());
        for(int i = 0;i<n;i++){
            a = s.nextLine();
            String[] string  = a.split(" ");
            if(a.equals("back")){
                l.removeFimLista();
            }
            if(a.equals("front")){
                l.removeInicioLista();
            }
            if(string[0].equals("push_back")){
                l.insereFimLista(string[1]);
            }
            if(string[0].equals("toFront")){
                l.insereInicioLista(string[1]);
            }
            if(a.equals("reverse")){
                l.reverse();
            }
        }
    }
}
