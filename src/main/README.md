# **Gestor de Tareas**

## **Descripción del Proyecto**
El **Gestor de Tareas** es una aplicación en consola diseñada para gestionar tareas pendientes y completadas, utilizando estructuras de datos personalizadas (pilas y colas) creadas desde cero. Este proyecto sigue un enfoque didáctico para comprender los conceptos fundamentales de Programación Orientada a Objetos (POO) y estructuras de datos.

## **Funciones del Sistema**
El sistema permite realizar las siguientes operaciones:
1. **Agregar tarea:** Añade una nueva tarea pendiente a la pila.
2. **Completar tarea:** Mueve la tarea más antigua (al fondo de la pila) a la cola de tareas completadas.
3. **Eliminar tarea:** Permite eliminar una tarea pendiente utilizando su ID.
4. **Ver tareas pendientes:** Muestra todas las tareas pendientes en orden cronológico.
5. **Ver próxima tarea:** Muestra la primera tarea a realizar.
6. **Ver tareas completadas:** Muestra todas las tareas que ya han sido completadas.

---

## **Guía de Uso**

A continuación, se describe un ejemplo práctico con las siguientes tareas:
1. **Estudiar Unidad 2: Algoritmo y estructura de datos**.
2. **Realizar aplicación: Gestor de Tareas**.
3. **Presentar tarea**.

### **1. Agregar tareas al sistema**
- Selecciona la opción `1. Agregar tarea` en el menú.
- Ingresa los datos de cada tarea:
  - **ID:** 1
  - **Descripción:** Estudiar Unidad 2: Algoritmo y estructura de datos
  - **Fecha:** 2025-01-12
- Repite el proceso para las siguientes tareas:
  - **ID:** 2, **Descripción:** Realizar aplicación: Gestor de Tareas, **Fecha:** 2025-01-13
  - **ID:** 3, **Descripción:** Presentar tarea, **Fecha:** 2025-01-14
- El sistema confirmará cada tarea añadida.

### **2. Ver tareas pendientes**
- Selecciona la opción `4. Ver tareas pendientes`.
- El sistema mostrará las tareas en orden cronológico:
  ```plaintext
  Tareas pendientes en orden cronológico:
  1 | Estudiar Unidad 2: Algoritmo y estructura de datos | 2025-01-12
  2 | Realizar aplicación: Gestor de Tareas | 2025-01-13
  3 | Presentar tarea | 2025-01-14
### **3. Completar una tarea**
- Selecciona la opción `2. Completar tarea`.
- La tarea más reciente (**Estudiar Unidad 2: Algoritmo y estructura de datos**) se moverá a la cola de tareas completadas.
### **4. Ver tareas completadas**
- Selecciona la opción `6. Ver tareas completadas`.
- El sistema mostrará:
  ```plaintext
  Tareas completadas:
  1 | Estudiar Unidad 2:Algoritmo y estructura de datos | 2025-01-12

### **5. Eliminar una tarea específica**
- Selecciona la opción `3. Eliminar tarea`.
- Ingresa el ID de la tarea que deseas eliminar (por ejemplo, `2`).
- El sistema confirmará que la tarea ha sido eliminada.

### **6. Ver la próxima tarea**
- Selecciona la opción `5. Ver próxima tarea`.
- El sistema mostrará la tarea más cercana a realizar:
  ```plaintext
  Próxima tarea: 2 | Realizar aplicación: Gestor de Tareas | 2025-01-13

### **7. Salir del sistema**
- Selecciona la opción `0. Salir`.
- El sistema finalizará con un mensaje de despedida:
```plaintext
Saliendo del sistema...
¡Gracias por usar el Gestor de Tareas!
