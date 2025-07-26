# Divide y Vencerás

## Ordenación

- 🔀 **Merge Sort (Ordenamiento por Mezcla)**: Divide la lista en dos mitades, ordena cada mitad recursivamente y **mezcla** las dos mitades ordenadas en una sola lista ordenada.

- ⚡ **Quick Sort (Ordenamiento Rápido)**: Se selecciona un **pivote**, se **particiona** la lista en elementos menores y mayores que el pivote, y se ordenan recursivamente las sublistas.

---

# 🔁 Merge Sort

### 🧠 ¿Cómo funciona?
1. Divide el arreglo en **dos mitades** recursivamente hasta que cada subarreglo tenga un solo elemento.
2. Luego, **mezcla** (merge) esas mitades de forma ordenada hasta reconstruir el arreglo completo.

## ✅ Ventajas:

- ⚡ **Eficiencia**: Tiene una complejidad temporal de **O(n log n)**, lo que lo hace eficiente para grandes conjuntos de datos.
- 🤖 Al usar **recursividad**, permite una fácil implementación en **sistemas paralelos**.

## ❌ Desventajas:

- 💾 Requiere **memoria adicional** para almacenar las sublistas temporales.
- 🐢 Puede ser **menos eficiente** en listas pequeñas.

## Se una **Merge Sort** cuando:
  - Se trabaja con **listas enlazadas** o procesamiento paralelo.
  - El rendimiento es más importante que el consumo de memoria.

---

# ⚡ Quick Sort

### 🧠 ¿Cómo funciona?
1. Selecciona un **pivote** del arreglo.
2. Particiona el arreglo en dos partes: una con elementos **menores** que el pivote y otra con **mayores**.
3. Aplica recursivamente el mismo proceso a cada parte.

## ✅ Ventajas:

- 🚀 Tiene una complejidad **promedio de O(n log n)**, lo que lo hace muy **rápido** para grandes conjuntos de datos.
- 💡 **In-place**: No requiere memoria adicional significativa para el ordenamiento.

## ❌ Desventajas:

- 🕳️ En el **peor caso** (cuando el pivote es el más pequeño o más grande), la complejidad puede ser **O(n²)**.
- 🎯 La **elección del pivote** puede afectar significativamente el rendimiento. Estrategias como la **elección aleatoria** ayudan a mejorar la eficiencia.

## Se usa **Quick Sort** cuando:
  - Se quieras velocidad **en la mayoría de los casos**.
  - Se puede controlar la selección del **pivote**.
  - La memoria adicional sea una limitación.

