
package funciondevolver;
import java.util.*;

public class FuncionDevolver {

    // Lista de monedas disponibles (en centavos, por ejemplo)
    public static final int[] MONEDAS = {100, 50, 25, 10, 5, 1};

    /*
     Método que devuelve el conjunto de monedas para un valor dado n
     usando el menor número de monedas posibles (estrategia voraz).
    */
    
    public static List<Integer> devolverCambio(int n) {
        List<Integer> solucion = new ArrayList<>();
        int suma = 0;

        while (suma != n) {
            int x = -1;

            // Buscar la moneda más grande que no haga que la suma exceda a n
            for (int moneda : MONEDAS) {
                if (suma + moneda <= n) {
                    x = moneda;
                    break; // Tomamos la primera primera moneda más grande)
                }
            }

            // Si no se encontró una moneda válida, no hay solución
            if (x == -1) {
                System.out.println("No hay solución");
                return solucion;
            }

            // Agregar una moneda al conjunto solución
            solucion.add(x);
            suma += x;
        }

        return solucion;
    }

    public static void main(String[] args) {
        int n = 93; 

        System.out.println("Monto: " + n);
        List<Integer> resultado = devolverCambio(n);
        System.out.println("Monedas utilizadas: " + resultado);

        // PRUEBA DE ESCRITORIO
        // Tabla: Paso a paso del algoritmo con formato alineado
        System.out.println(" ");
        System.out.println("Prueba de Escritorio");
        System.out.printf("%-10s %-15s %-15s %-20s\n", "Paso", "Moneda elegida", "Suma actual", "Monedas en solución");

        int suma = 0;
        List<Integer> solucion = new ArrayList<>();
        int paso = 1;

        for (int moneda : resultado) {
            suma += moneda;
            solucion.add(moneda);

            System.out.printf("%-10d %-15d %-15d %-20s\n", paso++, moneda, suma, solucion);
        }
    }
    
}
