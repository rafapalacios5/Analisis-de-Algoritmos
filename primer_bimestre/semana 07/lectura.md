# Análisis del Caso Medio

Este analisis calcula el tiempo esperado de ejecución considerando todas las posibles entradas con sus respectivas probabilidades. Es más complejo de calcular que el caso peor, da una mejor estimación del rendimiento real.

## Pasos para el analisis del caso medio 
1. Identificar todas las entradas posibles
2. Asignar probabilidades a cada entrada
3. Calcular el tiempo para cada entrada
4. Calcular el promedio ponderado

# Análisis amortizado

El análisis amortizado estudia el costo promedio por operación en una secuencia de operaciones, considerando que algunas operaciones costosas se "amortizan" con muchas operaciones baratas.
- Ejemplo: array dinámico 

## Tipos de Análisis Amortizado

1. Método Agregado
    - Calcular el costo total de n operaciones
    - Se divide entre n para obtener el costo amortizado

2. Método Contable
    - Asignar "créditos" a operaciones baratas
    - Usar créditos para pagar operaciones costosas

3. Método Potencial
    - Definir una función potencial
    - El costo amortizado incluye el cambio de potencial

# Recurrencias
Las recurrencias son ecuaciones que expresan el tiempo de ejecución de un algoritmo en términos de su tiempo de ejecución en entradas más pequeñas. Se usan para analizar algoritmos recursivos.
- Ejemplo: mergeSort

## Tipos de Resolución 

1. Método de Sustitución
    - Verificar por inducción matemática

2. Método del Árbol de Recursión
    - Dibujar el árbol de llamadas recursivas
    - Sumar el trabajo en cada nivel
