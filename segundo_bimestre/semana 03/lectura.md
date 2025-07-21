# Divide y Vencerás

Es una técnica para diseñar algoritmos que consiste en **descomponer** el problema en subcasos más pequeños, **resolverlos recursivamente** y luego **combinar** sus soluciones para resolver el problema original.

---

## 🔍 Características
- 🧩 El problema se descompone en **subproblemas más pequeños** del mismo tipo.
- 🔁 Los subproblemas se **resuelven recursivamente**.
- 🧠 Las soluciones de los subproblemas se **integran** para formar la solución del problema original.

---

## 💡 Ejemplos
- 📉 **Búsqueda Binaria**: Compara el elemento buscado con el valor medio del arreglo ordenado y descarta la mitad en la que el elemento no puede estar.
  
- 🧮 **Multiplicación de Matrices (Algoritmo de Strassen)**: 
  - Divide las matrices en submatrices más pequeñas.
  - Realiza operaciones aritméticas entre ellas.
  - Combina los resultados para formar la matriz final.

---

## ✅ Ventajas
- ⚡ **Eficiente** para problemas grandes.
- 👨‍💻 **Fácil de implementar** recursivamente.

## ❌ Desventajas
- 💾 Puede **consumir mucha memoria** en problemas muy grandes debido a la recursión.

---

# 🔎 Búsqueda Binaria

La **búsqueda binaria** es un algoritmo eficiente para buscar elementos en un arreglo **ordenado**, dividiendo el rango de búsqueda en cada paso.

---

## 📊 Eficiencia
- ✅ **Mejor caso**: El elemento buscado está justo en el **centro** → solo una comparación.
- ❌ **Peor caso**: El elemento está en uno de los **extremos** → requiere varias divisiones del arreglo.
