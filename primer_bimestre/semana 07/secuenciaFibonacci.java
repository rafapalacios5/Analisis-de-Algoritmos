
package secuenciafibonacci;

public class secuenciaFibonacci {
 
    public static void main(String[] args) {
        int [] fib = new int[11];
        
        for (int i = 1; i <= 10; i++) {
            fib[i] = fibonacci(i);
            
        } 
        System.out.println("La serie de Fibonacci es: ");
        for (int i = 1; i <=10; i++) {
            System.out.print(fib[i] + " ");
        }
               
    }
    public static int fibonacci(int fib) {
        // Caso base
            if (fib == 1 || fib == 2) {
                return 1;
            }else {
                return fibonacci(fib - 1) + fibonacci(fib - 2);
            } 
    }
    
}
