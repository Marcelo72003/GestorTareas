package vista;

import controlador.ControladorTareas;
import modelo.Tarea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsolaVista {
  private ControladorTareas controlador;

  public ConsolaVista() {
    this.controlador = new ControladorTareas();
  }

  public void iniciar() {
    Scanner scanner = new Scanner(System.in);
    int opcion = -1;

    do {
      System.out.println("\n--- Menú de Gestión de Tareas ---");
      System.out.println("1. Agregar tarea");
      System.out.println("2. Completar tarea");
      System.out.println("3. Eliminar tarea");
      System.out.println("4. Ver tareas pendientes");
      System.out.println("5. Ver próxima tarea");
      System.out.println("6. Ver tareas completadas");
      System.out.println("0. Salir");
      System.out.print("Seleccione una opción: ");

      opcion = leerEntero("Seleccione una opción: ", scanner);

      switch (opcion) {
        case 1:
          agregarTarea(scanner);
          break;
        case 2:
          controlador.completarTarea();
          break;
        case 3:
          eliminarTarea(scanner);
          break;
        case 4:
          controlador.mostrarTareasPendientes();
          break;
        case 5:
          controlador.verProximaTarea();
          break;
        case 6:
          controlador.mostrarTareasCompletadas();
          break;
        case 0:
          System.out.println("Saliendo del sistema...");
          break;
        default:
          System.out.println("Opción no válida. Por favor, ingrese un número entre 0 y 6.");
          break;
      }
    } while (opcion != 0);
  }

  private int leerEntero(String mensaje, Scanner scanner) {
    int numero = -1;
    boolean entradaValida = false;

    while (!entradaValida) {
      try {
        System.out.print(mensaje);
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        entradaValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
        scanner.nextLine(); // Limpiar el buffer
      }
    }

    return numero;
  }

  private void agregarTarea(Scanner scanner) {
    try {
      int id = leerEntero("Ingrese el ID de la tarea: ", scanner);
      System.out.print("Ingrese la descripción de la tarea: ");
      String descripcion = scanner.nextLine();
      System.out.print("Ingrese la fecha de la tarea (YYYY-MM-DD): ");
      String fecha = scanner.nextLine();
      controlador.agregarTarea(new Tarea(id, descripcion, fecha));
    } catch (Exception e) {
      System.out.println("Ocurrió un error al agregar la tarea. Inténtelo de nuevo.");
    }
  }

  private void eliminarTarea(Scanner scanner) {
    int idEliminar = leerEntero("Ingrese el ID de la tarea a eliminar: ", scanner);
    controlador.eliminarTarea(idEliminar);
  }
}
