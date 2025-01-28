package modelo;

public class Tarea {
  private int id;
  private String descripcion;
  private String fecha;

  public Tarea(int id, String descripcion, String fecha) {
    if (id <= 0) throw new IllegalArgumentException("El ID debe ser positivo.");
    if (descripcion == null || descripcion.trim().isEmpty()) throw new IllegalArgumentException("La descripción no puede estar vacía.");
    if (fecha == null || fecha.trim().isEmpty()) throw new IllegalArgumentException("La fecha no puede estar vacía.");

    this.id = id;
    this.descripcion = descripcion;
    this.fecha = fecha;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    if (id <= 0) throw new IllegalArgumentException("El ID debe ser positivo.");
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    if (descripcion == null || descripcion.trim().isEmpty()) throw new IllegalArgumentException("La descripción no puede estar vacía.");
    this.descripcion = descripcion;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    if (fecha == null || fecha.trim().isEmpty()) throw new IllegalArgumentException("La fecha no puede estar vacía.");
    this.fecha = fecha;
  }

  @Override
  public String toString() {
    return id + " | " + descripcion + " | " + fecha;
  }
}
