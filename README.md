# Práctica de Laboratorio N° 3: ConstraintLayout en Jetpack Compose

Este repositorio contiene la implementación en **Kotlin** y **Jetpack Compose** para la **Práctica de Laboratorio N° 3**, centrada en el diseño de interfaces complejas mediante el uso de `ConstraintLayout` y referencias cruzadas (`createRefs()`).

---

## 📌 Descripción del Proyecto

El proyecto se encuentra dentro del paquete `com.example.bloom.components` y resuelve tres ejercicios con diferentes grados de dificultad técnica:

1. **`ConstraintPractica1`**: Posicionamiento en forma de X o cruz alrededor de un contenedor central (`boxRed`).
2. **`ConstraintPractica2`**: Extensión vertical y horizontal con cajas alineadas y referenciadas en múltiples niveles.
3. **`ConstraintPractica3`**: Distribución principal con una escalera diagonal de elementos de menor tamaño intercalados.

---

## 🛠️ Ejercicios Implementados

### 1. Práctica 1 (3 Puntos)
- **Componentes:** 5 cajas (`Box`) de 100 dp (Rojo, Azul, Magenta, Amarillo, Verde).
- **Lógica:** 
  - La caja roja se centra en la pantalla mediante `parent`.
  - Las cajas restantes se conectan a las esquinas del bloque rojo usando relaciones `linkTo()`.

### 2. Práctica 2 (8 Puntos)
- **Componentes:** 7 cajas de 100 dp (Rojo, Azul, Amarillo, Magenta, Cyan, Verde, Negro).
- **Lógica:** 
  - Estructura central en cruz acompañada de bloques superior e inferior (Verde y Negro) alineados horizontalmente al centro de la caja roja.

### 3. Práctica 3 (9 Puntos)
- **Componentes:** 5 cajas principales de 90 dp y 3 cajas pequeñas de 30 dp (Cyan y 2 de color Negro).
- **Lógica:** 
  - Implementación de un patrón en "escalera" entre las cajas principales utilizando pequeños bloques vinculados secuencialmente desde sus bordes `start` y `bottom`.

---

## 💻 Tecnologías Utilizadas

- **Lenguaje:** Kotlin
- **Framework:** Jetpack Compose
- **Librería de Diseño:** `androidx.constraintlayout.compose.ConstraintLayout`
- **IDE:** Android Studio

---

## 📁 Estructura del Código

```kotlin
package com.example.bloom.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

// Composables:
// - ConstraintPractica1()
// - ConstraintPractica2()
// - ConstraintPractica3()
