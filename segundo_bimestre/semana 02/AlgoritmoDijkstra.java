
package algoritmodijkstra;
import java.util.*;

public class AlgoritmoDijkstra {
    static final int N = 5;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // Matriz de adyacencia que representa el grafo ponderado
        int[][] L = {
            {0, 10, INF, 30, 100},  // Nodo 1
            {INF, 0, 50, INF, INF}, // Nodo 2
            {INF, INF, 0, INF, 10}, // Nodo 3
            {INF, INF, 20, 0, 60},  // Nodo 4
            {INF, INF, INF, INF, 0} // Nodo 5
        };

        int[] D = new int[N];
        boolean[] nodoVisitado = new boolean[N];
        int inicio = 0;

        for (int i = 0; i < N; i++) {
            D[i] = L[inicio][i];
        }
        nodoVisitado[inicio] = true;
        
        System.out.println("\nResultado final (distancias mínimas desde el nodo 1):");
        for (int i = 0; i < N; i++) {
            System.out.println("Nodo 1 -> Nodo " + (i + 1) + " = " + (D[i] == INF ? "∞" : D[i]));
        }
        System.out.println(" ");

        System.out.println("Prueba de escritorio");
        System.out.printf("%-6s | %-20s | %-15s | %-30s\n", "Paso", "C (no visitados)", "S (visitados)", "Distancias D");
        System.out.println("----------------------------------------------------------------------------------------------");
        mostrarTabla(0, D, nodoVisitado);

        for (int paso = 1; paso < N; paso++) {
            // nodo no visitado con la distancia mínima actual
            int v = -1;
            int minDist = INF;

            for (int i = 0; i < N; i++) {
                if (!nodoVisitado[i] && D[i] < minDist) {
                    v = i;
                    minDist = D[i];
                }
            }

            if (v == -1) break;
            nodoVisitado[v] = true;
            
            // verificar si pasando por v se obtiene un camino más corto para cada nodo no visitado w
            for (int w = 0; w < N; w++) {
                if (!nodoVisitado[w] && L[v][w] != INF) {
                    if (D[w] > D[v] + L[v][w]) {
                        D[w] = D[v] + L[v][w];
                    }
                }
            }

            mostrarTabla(paso, D, nodoVisitado);
        }

    }

    static void mostrarTabla(int paso, int[] D, boolean[] visitado) {
        // Ponemos los nodos no visitados (C) y visitados (S) en listas
        List<Integer> C = new ArrayList<>();
        List<Integer> S = new ArrayList<>();
        
        // Clasificamos nodos en visitados y no visitados
        for (int i = 0; i < D.length; i++) {
            if (visitado[i]) {
                S.add(i + 1);
            } else {
                C.add(i + 1);
            }
        }
        
        // Distancias actuales
        System.out.printf("%-6d | %-20s | %-15s | ", paso, C.toString(), S.toString());
        for (int i = 0; i < D.length; i++) {
            if (D[i] == INF) {
                System.out.printf("%-4s", "∞");
            } else {
                System.out.printf("%-4d", D[i]);
            }
        }
        System.out.println();
    }
}
