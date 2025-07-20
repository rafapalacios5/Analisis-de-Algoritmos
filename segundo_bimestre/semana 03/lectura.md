# Divide y venceras
Es una tecnica para diseñar algoritmos que que conssite en descomponer el caso que haya que resolver en un cierto numero de subcasos más pequeños y combinar después las soluciones obtenidas para obtener la solución del caso original

## Caracteristicas
- El problema se descompone en subproblemas más pequeños del mismo tipo
- Los subproblemas se resuelven recursivamente
- Se combinan las soluciones de los subproblemas se integran para formar la solución del problema original

## Ejemplos
- Merge Sort (Ordenamiento por Mezcla): Divide la lista en dos mitades, ordena cada mitad recursivamente y mezcla las dos mitades ordenadas en una sola lista ordenada.

- Quick Sort (Ordenamiento Rápido): Se selecciona un "pivote" y particiona la lista en elementos menores y mayores que el pivote, ordena recursivamente las sublistas.

- Búsqueda Binaria: Compara el elemento buscado con el valor medio del arreglo ordenado, descarta la mitad donde el elemento no puede estar.

- Multiplicación de Matrices (Algoritmo de Strassen): Parte las matrices en submatrices más pequeñas, se realiza operaciones aritméticas en las submatrices y combina los resultados para obtener la matriz final.

## Ventajas
- Eficiencia en problemas grandes
- Fácil de implementar recursivamente

## Desventajas
- Puede consumir mucha memoria en problemas muy grandes
