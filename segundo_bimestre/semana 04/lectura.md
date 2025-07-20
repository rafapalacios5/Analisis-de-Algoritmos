# Divide y Venceras 

## Ordenación

- Merge Sort (Ordenamiento por Mezcla): Divide la lista en dos mitades, ordena cada mitad recursivamente y mezcla las dos mitades ordenadas en una sola lista ordenada.

- Quick Sort (Ordenamiento Rápido): Se selecciona un "pivote" y particiona la lista en elementos menores y mayores que el pivote, ordena recursivamente las sublistas.

---
# Merge Sort
## Ventajas:

- Eficiencia: tiene una complejidad temporal de O(n log n), lo que lo hace eficiente para grandes conjuntos de datos. 

- Al usar recursividad permite una fácil implementación en sistemas paralelos. 

## Desventajas:
- Requiere memoria adicional para almacenar las sublistas temporales. 

- Puede ser menos eficiente en casos de listas pequeñas.

--- 
# Quick Sort

## Ventajas:

- Tiene una complejidad promedio de O(n log n), lo que lo hace rápido para grandes conjuntos de datos. 

- En el lugar (in-place): No requiere memoria adicional significativa para el ordenamiento. 

## Desventajas:

- En el peor caso (cuando el pivote siempre es el elemento más pequeño o más grande), su complejidad puede ser O(n^2). 

- La elección del pivote puede afectar significativamente el rendimiento. Estrategias como la elección aleatoria pueden ayudar a mitigar este problema. 
