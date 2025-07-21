# Argoritmos Probabilistas

# Tiempo Esperado

El **tiempo esperado** (o esperanza matemática del tiempo de ejecución) es una medida del **rendimiento promedio** de un algoritmo, considerando la **probabilidad de ocurrencia** de distintos casos de entrada.

En lugar de analizar solo el mejor o peor caso, se calcula una media ponderada sobre todos los posibles casos.

---

## ✅ Ventajas:
- 📊 Ofrece una **visión más realista** del comportamiento del algoritmo en situaciones prácticas.
- 🤖 Útil cuando el algoritmo depende de **aleatoriedad** (por ejemplo, algoritmos probabilísticos).
- 🔍 Ayuda a comparar algoritmos en **entornos reales** donde no siempre se presentan los casos extremos.

## ❌ Desventajas:
- 🧠 Puede ser **difícil de calcular** si la distribución de entrada no es conocida.
- 🧮 Requiere análisis **probabilístico**, lo cual puede ser complejo.
- ❌ No garantiza buen rendimiento en casos individuales.

---

## 🔍 Mejor caso:
- Cuando las entradas más probables generan un comportamiento rápido → el **tiempo esperado es bajo**, incluso si hay peores casos posibles.

## 🕳️ Peor caso:
- Si entradas poco frecuentes causan mucha demora, el tiempo esperado puede **subestimar** el impacto de esos casos extremos.

---

# Algoritmos Numéricos

Los **algoritmos numéricos** son procedimientos diseñados para resolver **problemas matemáticos** mediante aproximaciones numéricas, como resolver ecuaciones, integrar funciones, interpolar, derivar, etc.

Son fundamentales en campos como la ingeniería, física, economía, informática científica y simulaciones.

---

## ✅ Ventajas:
- 📐 Permiten resolver **problemas complejos** donde no existen soluciones analíticas exactas.
- 🤖 Son **escalables** y aplicables a datos reales, incluso con ruido o incertidumbre.
- 🧠 Pueden alcanzar **alta precisión** dependiendo del método usado (ej. métodos iterativos como Newton-Raphson, Gauss-Seidel, etc.)

## ❌ Desventajas:
- 🧮 Algunos algoritmos son **sensibles a errores de redondeo** o inestabilidad numérica.
- 💾 Requieren **mucha memoria** o poder de cómputo en problemas grandes.
- ⚠️ La **convergencia** no siempre está garantizada o puede ser muy lenta.

---

## 🔍 Mejor caso:
- Cuando el algoritmo **converge rápidamente** (pocos pasos) y la función o sistema es **bien condicionado** → resultado preciso y rápido.

## 🕳️ Peor caso:
- Cuando el problema es **mal condicionado**, hay **división por cero**, **oscilaciones**, o el algoritmo **no converge** → resultados erróneos o muy lentos.

