package modelo.estructurasdedatos;

public class Colas<T> {
  private Nodo frente;
  private Nodo finalCola;
  private int tamaño;

  private class Nodo {
    T dato;
    Nodo siguiente;

    public Nodo(T dato) {
      this.dato = dato;
      this.siguiente = null;
    }
  }

  public Colas() { // Constructor corregido
    this.frente = null;
    this.finalCola = null;
    this.tamaño = 0;
  }

  public void encolar(T dato) {
    Nodo nuevoNodo = new Nodo(dato);
    if (estaVacia()) {
      frente = finalCola = nuevoNodo;
    } else {
      finalCola.siguiente = nuevoNodo;
      finalCola = nuevoNodo;
    }
    tamaño++;
  }

  public T desencolar() {
    if (estaVacia()) throw new IllegalStateException("La cola está vacía.");
    T dato = frente.dato;
    frente = frente.siguiente;
    if (frente == null) finalCola = null;
    tamaño--;
    return dato;
  }

  public T verFrente() {
    if (estaVacia()) throw new IllegalStateException("La cola está vacía.");
    return frente.dato;
  }

  public boolean estaVacia() {
    return frente == null;
  }

  public int obtenerTamaño() {
    return tamaño;
  }
}
