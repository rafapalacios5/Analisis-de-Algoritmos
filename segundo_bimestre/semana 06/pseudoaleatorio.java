
package pseudoaleatorios;

public class pseudoaleatorio {
    public static void main(String[] args) {
        long semilla = 12345;  // Semilla inicial
        int cantidad = 100;    // Cantidad de números a generar
        
        double[] numeros = generarPseudoaleatorios(semilla, cantidad);

        // Mostrar los primeros 10 valores
        System.out.println("Primeros 10 números pseudoaleatorios normalizados:");
        System.out.println(" ");
        for (int i = 0; i < 10 && i < numeros.length; i++) {
            System.out.println((i + 1) + ": " + numeros[i]);
        }
        System.out.println(" ");
        
        // Mostrar los primeros 10 en forma de tabla
        System.out.println("Prueba de escritorio con los Primeros 10 números:");
        System.out.printf("%-5s %-15s %-20s%n", "i", "Xn", "Xn_normalizado");
        System.out.println("--------------------------------------------------");
        
        long xn = semilla;
        int a = 1664525;
        int c = 1013904223;
        long m = (long) Math.pow(2, 32);

        for (int i = 0; i < 10; i++) {
            xn = (a * xn + c) % m;
            double normalizado = (double) xn / m;
            System.out.printf("%-5d %-15d %-20.10f%n", i + 1, xn, normalizado);
        }
    }

    public static double[] generarPseudoaleatorios(long semilla, int cantidad) {
        // Parámetros del generador
        int a = 1664525;
        int c = 1013904223;
        long m = (long) Math.pow(2, 32);

        double[] resultados = new double[cantidad];
        long x = semilla;

        for (int i = 0; i < cantidad; i++) {
            x = (a * x + c) % m;
            resultados[i] = (double) x / m; // Normalizar en [0,1)
        }

        return resultados;
    }
    
}
