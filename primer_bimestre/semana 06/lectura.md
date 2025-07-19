# Análisis de las estructuras de control

El análisis de algoritmos se realiza de manera sistemática, comenzando por evaluar el tiempo de ejecución de las instrucciones individuales, que generalmente está acotado por una constante. Luego, estos tiempos se combinan según las estructuras de control del programa. Algunas estructuras, como la composición secuencial (instrucciones en orden), son sencillas de analizar, mientras que otras, como los bucles mientras, requieren un enfoque más detallado. 

## Secuencias
la regla de la composición secuencial se refiere al análisis del tiempo de ejecución de un algoritmo cuando las instrucciones se ejecutan una después de otra (en secuencia).
- Fórmula: Si una instrucción toma tiempo T1​ y la siguiente T2, el tiempo total es la suma T1 + T2

## Bucles Para (Desde)
El tiempo de un bucle depende del número de iteraciones y del tiempo de cada iteración.
- Ejemplo: para  i <- 1 hasta m hacer p(i)

## Bucles "mientras" (While) y repetir (repeat)

Los bucles mientras se ejecutan un bloque de código mientras una condición sea verdadera.
- La condición se evalúa antes de cada iteración.
- Si la condición es falsa desde el inicio, el bloque no se ejecuta.
- Ejemplo: 
mientras i ≤ m  hacer     
                p(i)                
                i <- i + 1
---
Los bulces repetir se ejecutan un bloque de código al menos una vez y luego repite hasta que una condición sea verdadera.
- La condición se evalúa después de cada iteración.
- Siempre se ejecuta al menos una vez, incluso si la condición es falsa inicialmente.
- Ejemplo:
          i ← 0                  
          repetir  
              escribir("Iteración ", i)  
               i ← i + 1          
          hasta que (i ≥ 5)      
