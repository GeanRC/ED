

package q6ed;

import java.util.Scanner;

/*
 * @author Gean RC
 */

public class Q6ED {public static class ArvBin {   
    
    public static class Arv{
        
        public static int count = 0;
        
        public class No{
            private int object;
            private No esq;
            private No dir;
            
            public No(){
                esq = null;
                dir = null;
            }
            public int getObject() {
                return object;
            }
            public void setObject(int object) {
                this.object = object;
            }

            public No getEsq() {
                return esq;
            }
            public void setEsq(No esq) {
                this.esq = esq;
            }

            public No getDir() {
                return dir;
            }

            public void setDir(No dir) {
                this.dir = dir;
            }    
        }
        
        private No raiz;
        
        public Arv(){
            raiz = null;
        }
        
        public No gearArvB(int[] pre, int[] in, int inStart, int inEnd){
            
            if (inStart > inEnd){
                return null;
            }
            
            No no = new No();
            no.setObject(pre[count++]);
            if(inStart == inEnd){
                return no;
            }
            
            int value = inEnd;
            for (int i = inStart; i <= inEnd; i++){
                if(in[i] == no.getObject()){
                    value = i;
                    break;
                }
            }
            no.setEsq(gearArvB(pre, in, inStart, value - 1));
            no.setDir(gearArvB(pre, in, value + 1, inEnd));
            return no;
        }
        
        private String createPosOrder(No T){
            String aux = "";
            try{
                if(T == null){
                    return null;
                }
                if(T.getEsq() != null){
                    aux = aux + createPosOrder(T.getEsq());
                }
                if(T.getDir() != null){
                    aux = aux + createPosOrder(T.getDir());
                }
            }catch(Exception e){
            }
            return String.valueOf(aux + " " + T.getObject());
        }
        
        public String createPosOrder(){
            return createPosOrder(raiz);
        }
        
        public void setRaiz(No novaRaiz){
            this.raiz = novaRaiz;
        }
    }
    
    public static void main(String[] args){ 
        try{
            Arv arvB = new Arv();
            Scanner sc = new Scanner(System.in);
            String originalInputPosOrder;
            String[] pre, pos, in;
            int sizeInputLine; 
            int[] InputPre, InputIn;
            sizeInputLine = Integer.parseInt(sc.nextLine());
            InputPre = new int[sizeInputLine];
            InputIn = new int[sizeInputLine];
            pre = sc.nextLine().split(" ");
            originalInputPosOrder = sc.nextLine();
            pos = originalInputPosOrder.split(" ");
            in = sc.nextLine().split(" ");
            
            for(int i = 0; i < sizeInputLine; i++){
                InputPre[i] = Integer.parseInt(pre[i]);
                InputIn[i]  = Integer.parseInt(in[i]);
            }
            arvB.setRaiz(arvB.gearArvB(InputPre, InputIn, 0, sizeInputLine - 1));
            String arvBPos = arvB.createPosOrder();
            
            if(arvBPos.equals(" " + originalInputPosOrder)){
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }catch(Exception e){}
    }
}
}