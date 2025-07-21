## 🔗 Grafos
Un **grafo** es un conjunto de nodos (también llamados **vértices**) que pueden estar conectados por **aristas** (o enlaces).  
Cada nodo está identificado por una **etiqueta única**.

---

## 🧭 Caminos Mínimos con Dijkstra

El algoritmo de **Dijkstra** es una técnica voraz que se utiliza para encontrar el **camino más corto** desde un nodo origen a todos los demás nodos en un grafo **con pesos no negativos**.

### 🛠️ Características
- 🔍 Selecciona el nodo **no visitado** con la menor **distancia conocida**.
- ❌ **No funciona con pesos negativos** (usa Bellman-Ford en ese caso).

### 💡 Aplicaciones
- 📍 **GPS / Mapas**: Encontrar la ruta más rápida entre dos ubicaciones.
- 🌐 **Redes de comunicación**: Enrutamiento eficiente de paquetes de datos.
- 🤖 **Robótica**: Calcular trayectorias seguras y eficientes.
