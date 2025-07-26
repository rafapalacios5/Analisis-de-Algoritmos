# Divide y Venceras

# 📊 Mediana

La **mediana** es una medida de tendencia central que representa el **valor central** de un conjunto de datos ordenado.  
Si hay un número impar de elementos, es el del medio.  
Si hay un número par, es el promedio de los dos valores centrales.

---

## ✅ Ventajas:
- 📉 **No se ve afectada por valores extremos** (outliers), a diferencia del promedio.
- 🔢 Es útil en distribuciones **asimétricas** o no normales.
- 📐 Fácil de interpretar para representar el centro de los datos.

## ❌ Desventajas:
- ⏳ **Requiere ordenar** los datos, lo que puede ser costoso en grandes volúmenes.
- 🔍 No aprovecha toda la información del conjunto (solo el orden).

---

## 🔍 Mejor caso:
- El conjunto ya está **ordenado** → se accede directamente al valor central → **O(1)** si ya conocemos la posición.

## 🕳️ Peor caso:
- Se debe **ordenar todo el conjunto** para encontrar la mediana → **O(n log n)** con algoritmos de ordenación.

---

# ✖️ Multiplicación de Matrices

La **multiplicación de matrices** es una operación algebraica donde dos matrices se combinan para formar una tercera, aplicando reglas específicas de productos y sumas de filas y columnas.

---

## ✅ Ventajas:
- 🔢 Fundamental en matemáticas, física, computación gráfica, inteligencia artificial, etc.
- 🚀 Con algoritmos avanzados (como Strassen o Coppersmith-Winograd), se puede lograr mayor **eficiencia** que con el método tradicional.
- 🧠 Base para operaciones complejas como transformaciones lineales, redes neuronales, etc.

## ❌ Desventajas:
- 🧮 El **método tradicional** tiene complejidad **O(n³)**, lo que lo hace costoso para grandes matrices.
- 💾 **Uso de memoria** elevado si se usan algoritmos recursivos o se trabaja con muchas matrices intermedias.
- ⚠️ **Errores numéricos** pueden acumularse en cálculos con flotantes.

## 🔍 Mejor caso:
- Con matrices con **muchos ceros** (matrices dispersas) o estructuras especiales → optimización significativa → complejidad **menor que O(n³)**.

## 🕳️ Peor caso:
- Multiplicación de dos matrices grandes y **densas** con el algoritmo tradicional → **O(n³)**.

## 🧠 Ejemplo Algoritmo: Strassen
- Divide cada matriz en **4 submatrices**.
- Aplica 7 multiplicaciones recursivas en lugar de 8.
- Combina los resultados de forma específica para formar la matriz final.


