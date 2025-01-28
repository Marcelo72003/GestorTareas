package modelo;

public class PilaTarea {
  private Nodo cima;
  private int tamaño;

  private static class Nodo {
    Tarea tarea;
    Nodo siguiente;

    public Nodo(Tarea tarea) {
      this.tarea = tarea;
      this.siguiente = null;
    }
  }

  public PilaTarea() { // Constructor corregido
    this.cima = null;
    this.tamaño = 0;
  }

  public void apilar(Tarea tarea) {
    if (tarea == null) throw new IllegalArgumentException("La tarea no puede ser nula.");
    Nodo nuevoNodo = new Nodo(tarea);
    nuevoNodo.siguiente = cima;
    cima = nuevoNodo;
    tamaño++;
  }

  public Tarea desapilar() {
    if (estaVacia()) throw new IllegalStateException("La pila está vacía.");
    Tarea tarea = cima.tarea;
    cima = cima.siguiente;
    tamaño--;
    return tarea;
  }

  public Tarea verCima() {
    if (estaVacia()) throw new IllegalStateException("La pila está vacía.");
    return cima.tarea;
  }

  public boolean estaVacia() {
    return cima == null;
  }

  public int obtenerTamaño() {
    return tamaño;
  }

  public void mostrarTareas() {
    if (estaVacia()) {
      System.out.println("La pila está vacía.");
    } else {
      Nodo actual = cima;
      System.out.println("Tareas en la pila:");
      while (actual != null) {
        System.out.println(actual.tarea);
        actual = actual.siguiente;
      }
    }
  }
}
