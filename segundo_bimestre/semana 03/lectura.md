# Divide y Vencerás

Es una técnica para diseñar algoritmos que consiste en **descomponer** el problema en subcasos más pequeños, **resolverlos recursivamente** y luego **combinar** sus soluciones para resolver el problema original.

## 🔍 Características
- 🧩 El problema se descompone en **subproblemas más pequeños** del mismo tipo.
- 🔁 Los subproblemas se **resuelven recursivamente**.
- 🧠 Las soluciones de los subproblemas se **integran** para formar la solución del problema original.

## 💡 Ejemplos
- 📉 **Búsqueda Binaria**: Compara el elemento buscado con el valor medio del arreglo ordenado y descarta la mitad en la que el elemento no puede estar.
  
- 🧮 **Multiplicación de Matrices (Algoritmo de Strassen)**: 
  - Divide las matrices en submatrices más pequeñas.
  - Realiza operaciones aritméticas entre ellas.
  - Combina los resultados para formar la matriz final.

## ✅ Ventajas
- ⚡ **Eficiente** para problemas grandes.
- 👨‍💻 **Fácil de implementar** recursivamente.

## ❌ Desventajas
- 💾 Puede **consumir mucha memoria** en problemas muy grandes debido a la recursión.

---

# 🔎 Búsqueda Binaria

La **búsqueda binaria** es un algoritmo eficiente para encontrar un elemento dentro de un **arreglo ordenado**.  
Funciona dividiendo repetidamente el rango de búsqueda a la mitad hasta encontrar el valor o determinar que no existe.

![Diagrama de algoritmo](https://programacionpython80889555.wordpress.com/wp-content/uploads/2021/12/ejemplo.png?w=641)

## 🧠 ¿Cómo funciona?
1. Se comparara el **elemento central** del arreglo con el elemento buscado.
2. Si es igual, se ha encontrado el valor.
3. Si el valor buscado es **menor**, se repite el proceso en la **mitad izquierda**.
4. Si es **mayor**, se repite en la **mitad derecha**.

## ✅ Ventajas:
- ⚡ Mucho más rápida que la búsqueda lineal en arreglos grandes.
- 💡 Eficiente: reduce el tiempo de búsqueda de **O(n)** a **O(log n)**.
- 📉 Ideal para estructuras de datos **ordenadas**.

## ❌ Desventajas:
- 🔢 Solo funciona si el **arreglo está ordenado previamente**.
- 🧮 Puede ser más compleja que la búsqueda lineal.


## 📊 Eficiencia
- ✅ **Mejor caso**: El elemento buscado está justo en el **centro** → solo una comparación.
- ❌ **Peor caso**: El elemento está en uno de los **extremos** → requiere varias divisiones del arreglo.
