# Notación Omega
La notación Omega (Ω) en algoritmos se utiliza para establecer un límite inferior  en el crecimiento del tiempo de ejecución o uso de recursos de un algoritmo

- Ω(g(n)) indica el mejor caso asintótico o el rendimiento mínimo del algoritmo.
- Se usa para afirmar que ninguna implementación puede ser más eficiente que cierto límite.
### Ejemplos
- Ω(1) → El algoritmo requiere al menos tiempo constante (acceder a un elemento en un arreglo).
- Ω(log n) → Cotas inferiores en búsquedas en estructuras ordenadas (búsqueda binaria).
- Ω(n) → Algoritmos que deben procesar todos los elementos de la entrada (encontrar el máximo en una lista no ordenada).
- Ω(n log n) → Límite inferior para algoritmos de ordenamiento basados en comparaciones (Merge Sort, Heap Sort).
---

# Notación Theta
La notación Theta (Θ) se utiliza para describir un límite ajustado (tight bound) en el crecimiento del tiempo de ejecución o uso de recursos de un algoritmo. A diferencia de Big-O (O) (que da una cota superior) y Omega (Ω) (que da una cota inferior), la notación Theta combina ambas para indicar que el crecimiento del algoritmo es exactamente proporcional a una función dada.
### Ejemplos 
- Θ(1) → Operaciones de tiempo constante (acceder a un elemento en un arreglo).
- Θ(n) → Recorrer una lista de tamaño nn (requiere nn pasos).
- Θ(n log n) → Algoritmos óptimos de ordenamiento basados en comparaciones (Merge Sort).
- Θ(n²) → Algoritmos con bucles anidados sobre la misma entrada (Bubble Sort en el peor caso).
---

# Notación asintótica condicional
La notación asintótica condicional es el estudio del comportamiento de un algoritmo bajo ciertas restricciones o supuestos en la entrada, lo que afecta su complejidad temporal. Este enfoque introduce condiciones específicas que modifican la cota asintótica.
