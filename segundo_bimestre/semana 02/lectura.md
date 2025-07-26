# Algoritmos Voraces

---

## 🔗 Grafos
Un **grafo** es un conjunto de nodos (también llamados **vértices**) que pueden estar conectados por **aristas** (o enlaces).  
Cada nodo está identificado por una **etiqueta única**.

---

 ## Grafos Dirigidos

Los **grafos dirigidos** toman decisiones paso a paso eligiendo la **opción localmente óptima** con el objetivo de llegar a una **solución globalmente óptima**.

👉 En los grafos dirigidos, **las aristas tienen dirección**, por lo tanto, el algoritmo debe tener en cuenta la **dirección del flujo** para encontrar rutas válidas.

![Diagrama de algoritmo](https://koketxt.wordpress.com/wp-content/uploads/2013/06/imagen5.png)

---

## 📌 ¿Cuándo se aplican?

- Cuando se necesita encontrar rutas, caminos mínimos o árboles dirigidos.
- Son útiles en problemas como:
  - Rutas más cortas
  - Enrutamiento de redes
  - Optimización de recursos dirigidos

---

## Ejemplo

### 🧭 Caminos Mínimos con Dijkstra

El **algoritmo de Dijkstra** es uno de los algoritmos voraces más conocidos aplicado a **grafos dirigidos con pesos no negativos**.

### 🧠 ¿De qué se trata?

- 📍 Parte desde un **nodo origen**.
- En cada paso, elige el **nodo con la menor distancia conocida** desde el origen (que aún no ha sido procesado).
- 📤 Actualiza las distancias a sus **vecinos alcanzables**, considerando la **dirección de las aristas**.
- Repite hasta haber calculado las **distancias mínimas desde el origen a todos los demás nodos**.
- El Objetivo es encontrar el **camino más corto** desde un nodo origen a todos los demás en un **grafo dirigido con pesos no negativos**.

### 🛠️ Características
- 🔍 Selecciona el nodo **no visitado** con la menor **distancia conocida**.
- ❌ **No funciona con pesos negativos** (usa Bellman-Ford en ese caso).

### 💡 Aplicaciones
- 📍 **GPS / Mapas**: Encontrar la ruta más rápida entre dos ubicaciones.
- 🌐 **Redes de comunicación**: Enrutamiento eficiente de paquetes de datos.
- 🤖 **Robótica**: Calcular trayectorias seguras y eficientes.
