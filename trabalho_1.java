public class trabalho_1 {
    public static void main(String[] args) {
        int i = 109; // Mudamos para o valor de entrada escolhido
        System.out.println("Função 1: ");
        System.out.println("Cont_op: "+funcao1(i));
        System.out.println(" ");
        System.out.println("Função 2: ");
        System.out.println("Cont_op: "+funcao2(i));
        System.out.println(" ");
        System.out.println("Função 3: ");
        System.out.println("Cont_op: "+funcao3(i));
        System.out.println(" ");
        System.out.println("Função 4: ");
        System.out.println("Cont_op: "+funcao4(i));
        System.out.println(" ");
        System.out.println("Função 5: ");
        System.out.println("Cont_op: "+funcao5(i));
        

            
    }
        
        public static int funcao1(int n){
            double antes = System.currentTimeMillis();
            int i, j, k, res = 0;
            int cont_op = 0;
            for(i = n; i <= n+1; i += 1){
                for(j = n+1; j <= n+i; j += i){
                    for(k = 1; k <= i*i; k += i/2+1){
                        res = res + i;
                        cont_op++;
                    } 
                }
            }
            double depois = System.currentTimeMillis();
            System.out.println("Tempo de execução: " + (depois-antes));
            return cont_op;
        }
    
        public static int funcao2(int n){
            double antes = System.currentTimeMillis();
            int i, j, k, res = 0;
            int cont_op = 0;
            for(i = n; i <= n+1; i += 2){
                for(j = n+1; j <= n*n; j += 2){
                    for(k = i+1; k <= 2*n; k += 2){
                        res = res + n*k;
                        cont_op++;
                    } 
                }
            }
            double depois = System.currentTimeMillis();
            System.out.println("Tempo de execução: " + (depois-antes));
            return cont_op;
        }
    
        public static int funcao3(int n){
            double antes = System.currentTimeMillis();
            int i, j, k, res = 0;
            int cont_op = 0;
            for(i = n+1; i <= n+1; i += 1){
                for(j = n; j <= i+1; j += j/2+1){
                    for(k = j; k <= n*j; k += Math.abs(j-i)+1){
                        res = res + n*k;
                        cont_op++;

                    } 
                }
            }
            double depois = System.currentTimeMillis();
            System.out.println("Tempo de execução: " + (depois-antes));
            return cont_op;
        }
    
        public static int funcao4(int n){
            double antes = System.currentTimeMillis();
            int i, j, k, res = 0;
            int cont_op = 0;
            for(i = n/2; i <= n*n; i += 1){
                for(j = 1; j <= n*n; j += i/2+1){
                    for(k = 2; k <= i*j; k += j/2+1){
                        res = res + n-1;
                        cont_op++;
                    } 
                }
            }
            double depois = System.currentTimeMillis();
            System.out.println("Tempo de execução: " + (depois-antes));
            return cont_op;
        }
    
        public static int funcao5(int n){
            double antes = System.currentTimeMillis();
            int i, j, k, res = 0;
            int cont_op = 0;
            for(i = n/2; i <= n+1; i += 2){
                for(j = 1; j <= n*i; j += i/2+1){
                    for(k = i+1; k <= n*j; k += 1){
                        res = res + k*j;
                        cont_op++;
                    } 
                }
            }
            double depois = System.currentTimeMillis();
             System.out.println("Tempo de execução: " + (depois-antes));
            return cont_op;
        }
    
    
    

}
    

