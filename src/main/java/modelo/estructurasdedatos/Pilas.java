package modelo.estructurasdedatos;

public class Pilas<T> {
  private Nodo cima;
  private int tamaño;

  private class Nodo {
    T dato;
    Nodo siguiente;

    public Nodo(T dato) {
      this.dato = dato;
      this.siguiente = null;
    }
  }

  public Pilas() { // Constructor corregido
    this.cima = null;
    this.tamaño = 0;
  }

  public void apilar(T dato) {
    Nodo nuevoNodo = new Nodo(dato);
    nuevoNodo.siguiente = cima;
    cima = nuevoNodo;
    tamaño++;
  }

  public T desapilar() {
    if (estaVacia()) throw new IllegalStateException("La pila está vacía.");
    T dato = cima.dato;
    cima = cima.siguiente;
    tamaño--;
    return dato;
  }

  public T verCima() {
    if (estaVacia()) throw new IllegalStateException("La pila está vacía.");
    return cima.dato;
  }

  public boolean estaVacia() {
    return cima == null;
  }

  public int obtenerTamaño() {
    return tamaño;
  }
}
