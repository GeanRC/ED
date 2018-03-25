
package q3ed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * @author Gean RC
 */
public class Q3ED {
    
    static class No {
        //receber os valores na main
        private String antStr;
        private String conteudo;
        private String proxStr;
        
        //ordenar na lista
        private No antNo;
	private No proxNo;
        
        public No(){
            conteudo = null;
            antNo = null;
            proxNo = null;
        }
        
        public String getConteudo() {
                return conteudo;
        }

        public void setConteudo(String conteudo) {
                this.conteudo = conteudo;
        }

        public No getProxNo() {
                return proxNo;
        }

        public void setProxNo(No prox) {
                this.proxNo = prox;
        }

        public No getAntNo() {
                return antNo;
        }

        public void setAntNo(No ant) {
                this.antNo = ant;
        }
        
        public String getProxStr() {
                return proxStr;
        }

        public void setProxStr(String prox) {
                this.proxStr = prox;
        }

        public String getAntStr() {
                return antStr;
        }

        public void setAntStr(String ant) {
                this.antStr = ant;
        }
    }
    
    static class Lista{
        No inicio = null;
        protected int total = 0;
        
        public void insere(No n){
            if(total != 0){
                No aux = inicio;
                
                while(aux.getProxNo() != null){
                    aux = aux.getProxNo();
                }
                
                aux.setProxNo(n);
                n.setAntNo(aux);
                total++;
            }else{
                inicio = n;
                total++;
            }
        }
        
        public No elemento(int numb){
            No aux = inicio;
            
            if(numb > total){
                return null;
            }
            
            for(int i = 0; i < numb; i++){
                aux = aux.getProxNo();
            }
            
            return aux;
        }
    }
    
    public static void main(String[] args) throws IOException{
        try{
            String a;
            Lista lista = new Lista();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            while(true){          
                
                
                a = in.readLine();

                if(a.equals("")){
                    break;
                }
                else{
                No novoNo = new No();
                String[] partes = a.split(" ");
                novoNo.setConteudo(partes[0]);
                novoNo.setAntStr(partes[1]);
                novoNo.setProxStr(partes[2]);
                lista.insere(novoNo);
                }
                if(a.equals("")){
                    break;
                }
            }
            
            No inicio = lista.elemento(0);
            No fim = lista.elemento(1);

            boolean sano = true;
            int aux = 0;

            for(No n = inicio; n != fim; aux++){
                if(aux > lista.total){
                    sano = false;
                    break;
                }
                
                for(int i = 0; i < lista.total; i++){
                    if(n.getProxStr().equals(lista.elemento(i).getConteudo())){
                        
                        if(n.getConteudo().equals(lista.elemento(i).getAntStr())){
                            n = lista.elemento(i);
                            break;
                        }else{
                            sano = false;
                            break;
                        }
                    }
                }

                if(sano == false){
                    break;
                }
                
            }

            if(sano){
                System.out.println("sana");
            }else{
                System.out.println("insana");
            }
        }catch(Exception e){
            return;
        }
    }

}
