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
| **Dijkstra** 🛣️   | Camino más corto en grafos (sin pesos negativos) | GPS, redes de routing.           |  
| **Kruskal** 🌳    | Árbol de expansión mínima               | Diseño de redes eléctricas.       |  
| **Prim** 🌐       | Árbol de expansión mínima            | Conectar ciudades con fibra óptica.|  

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
