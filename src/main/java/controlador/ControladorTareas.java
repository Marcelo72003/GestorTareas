package controlador;

import modelo.Tarea;
import modelo.PilaTarea;
import modelo.ColaTareas;

public class ControladorTareas {
  private PilaTarea tareasPendientes; // Pila para tareas pendientes
  private ColaTareas tareasCompletadas; // Cola para tareas completadas

  public ControladorTareas() {
    this.tareasPendientes = new PilaTarea();
    this.tareasCompletadas = new ColaTareas();
  }

  // 1. Agregar tarea
  public void agregarTarea(Tarea tarea) {
    tareasPendientes.apilar(tarea);
    System.out.println("Tarea agregada: " + tarea);
  }

  // 2. Completar tarea
  public void completarTarea() {
    if (tareasPendientes.estaVacia()) {
      System.out.println("No hay tareas pendientes.");
    } else {
      Tarea tareaCompletada = tareasPendientes.desapilar();
      tareasCompletadas.encolar(tareaCompletada);
      System.out.println("Tarea completada: " + tareaCompletada);
    }
  }

  // 3. Eliminar tarea
  public void eliminarTarea(int idTarea) {
    if (tareasPendientes.estaVacia()) {
      System.out.println("No hay tareas pendientes para eliminar.");
    } else {
      PilaTarea nuevaPila = new PilaTarea(); // Pila auxiliar
      boolean encontrada = false;

      // Recorrer la pila para buscar y eliminar la tarea
      while (!tareasPendientes.estaVacia()) {
        Tarea tarea = tareasPendientes.desapilar();
        if (tarea.getId() == idTarea) {
          encontrada = true;
          System.out.println("Tarea eliminada: " + tarea);
        } else {
          nuevaPila.apilar(tarea);
        }
      }

      // Restaurar las tareas a la pila principal
      while (!nuevaPila.estaVacia()) {
        tareasPendientes.apilar(nuevaPila.desapilar());
      }

      if (!encontrada) {
        System.out.println("No se encontró ninguna tarea con el ID proporcionado.");
      }
    }
  }

  // 4. Ver tareas pendientes
  public void mostrarTareasPendientes() {
    System.out.println("\nTareas pendientes:");
    tareasPendientes.mostrarTareas();
  }

  // 5. Ver próxima tarea
  public void verProximaTarea() {
    if (tareasPendientes.estaVacia()) {
      System.out.println("No hay tareas pendientes.");
    } else {
      System.out.println("Próxima tarea: " + tareasPendientes.verCima());
    }
  }

  // Ver tareas completadas
  public void mostrarTareasCompletadas() {
    System.out.println("\nTareas completadas:");
    tareasCompletadas.mostrarTareas();
  }
}

