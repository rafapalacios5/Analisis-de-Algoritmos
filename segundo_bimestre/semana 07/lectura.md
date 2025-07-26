# 🎲 Argoritmos Probabilistas
---

## Algoritmos de Monte Carlo

Los **algoritmos de Monte Carlo** son algoritmos **probabilísticos** que utilizan **números aleatorios** para resolver problemas computacionales que pueden ser **deterministas** o **probabilísticos** por naturaleza. 

En lugar de ofrecer siempre una respuesta exacta, proporcionan una **solución aproximada** con alta probabilidad de éxito. Son útiles cuando los métodos deterministas son muy costosos o complejos.


### 📌 Aplicaciones

- Simulación de fenómenos físicos (difusión, radioactividad).
- Integración numérica en espacios de muchas dimensiones.
- Estimación de probabilidades.
- Optimización en grandes espacios de búsqueda.
- Juegos y sistemas aleatorios (ruletas, cartas, sorteos).

### ✅ Ventajas

- Útiles cuando no hay una solución determinista práctica.
- Fáciles de implementar.
- Flexibles para distintos tipos de problemas.
- Permiten manejar incertidumbre y variabilidad.

### ❌ Desventajas

- No garantizan una solución exacta.
- Pueden requerir muchas repeticiones para alcanzar alta precisión.
- Dependientes de la calidad del generador de números aleatorios.

---

### 📉 Ejemplo: Estimación de π

Este ejemplo usa puntos aleatorios en un cuadrado para estimar el valor de π:

```java
import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        int totalPuntos = 1000000;
        int puntosDentro = 0;
        Random random = new Random();

        for (int i = 0; i < totalPuntos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) {
                puntosDentro++;
            }
        }

        double piAproximado = 4.0 * puntosDentro / totalPuntos;
        System.out.println("Valor aproximado de pi: " + piAproximado);
    }
}

