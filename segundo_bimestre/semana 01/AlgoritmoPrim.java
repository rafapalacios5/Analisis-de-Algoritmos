
package algoritmoprim;
import java.util.*;

class Conexion {
    int nodoOrigen, nodoDestino, costo;

    Conexion(int nodoOrigen, int nodoDestino, int costo) {
        this.nodoOrigen = nodoOrigen;
        this.nodoDestino = nodoDestino;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "{" + (nodoOrigen + 1) + "," + (nodoDestino + 1) + "}";
    }
}

public class AlgoritmoPrim {
    static int numNodos = 6;
    static List<List<Conexion>> listaAdyacencia = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < numNodos; i++) {
            listaAdyacencia.add(new ArrayList<>());
        }

        // Definición del grafo (nodos del 0 al 5)
        añadirConexion(0, 1, 6);
        añadirConexion(0, 2, 1);
        añadirConexion(0, 3, 5);
        añadirConexion(1, 2, 5);
        añadirConexion(1, 4, 3);
        añadirConexion(2, 4, 6);
        añadirConexion(2, 5, 4);
        añadirConexion(2, 3, 5);
        añadirConexion(3, 5, 2);
        añadirConexion(4, 5, 6);

        ejecutarPrim();
    }

    // Agrega una conexión (arista) bidireccional
    static void añadirConexion(int desde, int hasta, int costo) {
        listaAdyacencia.get(desde).add(new Conexion(desde, hasta, costo));
        listaAdyacencia.get(hasta).add(new Conexion(hasta, desde, costo));
    }

    static void ejecutarPrim() {
        boolean[] yaVisitado = new boolean[numNodos];
        PriorityQueue<Conexion> colaPrioridad = new PriorityQueue<>(Comparator.comparingInt(c -> c.costo));
        List<Conexion> arbolRecubrimiento = new ArrayList<>();
        Set<Integer> conjuntoVisitado = new HashSet<>();

        yaVisitado[0] = true;
        conjuntoVisitado.add(0);
        colaPrioridad.addAll(listaAdyacencia.get(0));

        // Encabezado de tabla de la prueba de escritorio
        System.out.println("\n╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║  %-35s │ %-15s │ %-15s │ %-10s │ %-5s ║\n",
                "T (Árbol Parcial)", "B (Visitados)", "N/B (No Visitados)", "e = {u,v}", "Costo");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");

        while (arbolRecubrimiento.size() < numNodos - 1) {
            Conexion actual = colaPrioridad.poll();

            if (!yaVisitado[actual.nodoDestino]) {
                yaVisitado[actual.nodoDestino] = true;
                arbolRecubrimiento.add(actual);
                conjuntoVisitado.add(actual.nodoDestino);
                colaPrioridad.addAll(listaAdyacencia.get(actual.nodoDestino));

                // Crear conjunto de nodos no visitados
                Set<Integer> noVisitados = new HashSet<>();
                for (int i = 0; i < numNodos; i++) {
                    if (!yaVisitado[i]) noVisitados.add(i);
                }

                // Mostrar paso a paso
                System.out.printf("║  %-35s │ %-15s │ %-15s │ %-10s │ %-5d ║\n",
                        arbolRecubrimiento.toString(),
                        mostrarConjunto(conjuntoVisitado),
                        mostrarConjunto(noVisitados),
                        actual.toString(),
                        actual.costo
                );
            }
        }

        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        // Mostrar árbol final
        System.out.println("\nÁrbol de Recubrimiento Mínimo Final:");
        for (Conexion conexion : arbolRecubrimiento) {
            System.out.printf("• %d — %d : %d\n", conexion.nodoOrigen + 1, conexion.nodoDestino + 1, conexion.costo);
        }
    }

    // Convertir un conjunto de índices en lista legible
    static String mostrarConjunto(Set<Integer> conjunto) {
        List<Integer> nodos = new ArrayList<>();
        for (int nodo : conjunto) nodos.add(nodo + 1);
        return nodos.toString();
    }
}
