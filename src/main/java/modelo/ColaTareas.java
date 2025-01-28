package modelo;

public class ColaTareas {
  private Nodo frente;
  private Nodo finalCola;
  private int tamaño;

  private static class Nodo {
    Tarea tarea;
    Nodo siguiente;

    public Nodo(Tarea tarea) {
      this.tarea = tarea;
      this.siguiente = null;
    }
  }

  public ColaTareas() {
    this.frente = null;
    this.finalCola = null;
    this.tamaño = 0;
  }

  public void encolar(Tarea tarea) {
    if (tarea == null) throw new IllegalArgumentException("La tarea no puede ser nula.");
    Nodo nuevoNodo = new Nodo(tarea);
    if (estaVacia()) {
      frente = finalCola = nuevoNodo;
    } else {
      finalCola.siguiente = nuevoNodo;
      finalCola = nuevoNodo;
    }
    tamaño++;
  }

  public Tarea desencolar() {
    if (estaVacia()) throw new IllegalStateException("La cola está vacía.");
    Tarea tarea = frente.tarea;
    frente = frente.siguiente;
    if (frente == null) finalCola = null;
    tamaño--;
    return tarea;
  }

  public Tarea verFrente() {
    if (estaVacia()) throw new IllegalStateException("La cola está vacía.");
    return frente.tarea;
  }

  public boolean estaVacia() {
    return frente == null;
  }

  public int obtenerTamaño() {
    return tamaño;
  }

  public void mostrarTareas() {
    if (estaVacia()) {
      System.out.println("La cola está vacía.");
    } else {
      Nodo actual = frente;
      System.out.println("Tareas en la cola:");
      while (actual != null) {
        System.out.println(actual.tarea);
        actual = actual.siguiente;
      }
    }
  }
}
