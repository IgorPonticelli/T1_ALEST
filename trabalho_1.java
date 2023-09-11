public class trabalho_1 {
    public static void main(String[] args) {

        System.out.println("i |Cont_op F1 |Cont_op F2 |Cont_op F3 |Cont_op F4 |Cont_op F5");
         System.out.print("\n");
        
        for(int i = 1; i <= 1000; i++){
            System.out.print(i);
            System.out.print("   ");

            double antes = System.currentTimeMillis();
            funcao1(i);
            double depois = System.currentTimeMillis();
            System.out.print((int)(depois-antes)); System.out.print("   ");

            antes = System.currentTimeMillis();
            funcao2(i);
            depois = System.currentTimeMillis();
            System.out.print((int)(depois-antes)); System.out.print("   ");

            antes = System.currentTimeMillis();
            funcao3(i);
            depois = System.currentTimeMillis();
            System.out.print((int)(depois-antes)); System.out.print("   ");

            antes = System.currentTimeMillis();
            funcao4(i);
            depois = System.currentTimeMillis();
            System.out.print((int)(depois-antes)); System.out.print("   ");

            antes = System.currentTimeMillis();
            funcao5(i);
            depois = System.currentTimeMillis();
            System.out.println((int)(depois-antes)); System.out.print("   ");
        }

    }
    
        
        public static int funcao1(int n){
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
            return cont_op;
        }
    
        public static int funcao2(int n){
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
            return cont_op;
        }
    
        public static int funcao3(int n){
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
            return cont_op;
        }
    
        public static int funcao4(int n){
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
            return cont_op;
        }
    
        public static int funcao5(int n){
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
            return cont_op;
        }
    
    
    

}
    

