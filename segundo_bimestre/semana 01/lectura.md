# 🎯 Algoritmos Voraces 

Los algoritmos voraces son estrategias de resolución de problemas de optimización **paso a paso**, seleccionando en cada etapa la opción que parece **óptima en ese momento** (sin mirar consecuencias futuras).  

---

## 🧩 Características Principales  

- ✅ **Elección voraz (Greedy Choice):**  
  En cada paso, elige **la mejor opción local disponible** (sin arrepentimiento).  
- ⚡ **Eficiencia:**  
  Suelen ser **rápidos** (complejidad a menudo lineal o logarítmica).  
- 🚫 **No siempre óptimos:**  
  No garantizan la solución global óptima para todos los problemas.  
- 📌 **Dos conjuntos clave:**  
  - **Seleccionados:** Candidatos ya elegidos.  
  - **Rechazados:** Candidatos descartados.  

---

## 📌 Ejemplos Clásicos  

| Algoritmo          | Problema Resuelto                          | Ejemplo de Uso                     |  
|--------------------|-------------------------------------------|-----------------------------------|  
| **Dijkstra**    | Camino más corto en grafos (sin pesos negativos) | GPS, redes de routing.           |  
| **Kruskal**     | Árbol de expansión mínima               | Diseño de redes eléctricas.       |  
| **Prim**        | Árbol de expansión mínima            | Conectar ciudades con fibra óptica.|  

---

## 👍 Ventajas  

- 🚀 **Simplicidad:** Fáciles de diseñar e implementar.  
- ⏱️ **Rapidez:** Más eficientes que otros métodos (ej: programación dinámica).  

---

## 👎 Desventajas  

- ❌ **Optimalidad no garantizada:**  
  La solución puede ser **localmente óptima** pero no globalmente (ej: problema del cambio con monedas [1, 3, 4] y cambio `6`).  
- 🔍 **Dependencia de la función de selección:**  
  La elección del criterio voraz afecta drásticamente el resultado.  

---

### 💡 **Conclusión**  
Usa algoritmos voraces cuando:  
- **La elección local lleva a una solución global óptima** (ej: Dijkstra en grafos sin pesos negativos).  
- **Necesitas eficiencia** (tiempos de ejecución bajos).

--- 

# 🔗 Grafos No Dirigidos

Un grafo no dirigido es una estructura de datos que consiste en un conjunto de vértices (nodos) y aristas (conexiones) en las que no existe dirección.

👉 Si hay una arista entre el nodo A y el nodo B, entonces se puede ir tanto de A a B como de B a A.

![Diagrama de algoritmo](https://koketxt.wordpress.com/wp-content/uploads/2013/06/g3.png)
---

## 📌 Características principales

- 🔄 Las aristas **no tienen dirección definida** por lo que pueden irse a cualquier dirección
- 👥 Puede tener **ciclos**, **componentes conexas** o **subgrafos**.

---

## ✅ Ventajas

- 📉 Suele requerir **menos espacio** para representación en ciertas aplicaciones.
- 👨‍👨‍👧‍👦 Muy útil para análisis de **conectividad** entre nodos.

---

## ❌ Desventajas

- 🚫 No apto para modelar relaciones **asimétricas** (como flujo, rutas de tráfico o herencia).
- 🔍 Algunas operaciones (como búsquedas específicas de dirección) no se pueden hacer directamente.
- 🧭 Puede ser más limitado en cuanto a análisis direccional (no hay flujo de información definido).

---

## Ejemplo

### Algoritmo de Prim

El **algoritmo de Prim** es un algoritmo voraz que se utiliza para encontrar el **árbol de expansión mínima** en un grafo no dirigido con pesos en sus aristas.

### 🧠 ¿De qué se trata?

- Comienza en un nodo cualquiera.
- En cada paso, agrega la **arista de menor peso** que conecta un **nodo ya visitado con uno no visitado**.
- Se repite hasta que todos los nodos estén conectados sin formar ciclos.
- El objetivo es construir un **subgrafo con el menor peso total posible** que conecte todos los nodos.

