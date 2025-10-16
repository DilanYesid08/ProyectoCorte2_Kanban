package com.mycompany.proyecto_kanban;

// Clase abstracta base para todas las tareas
public abstract class TareaBase {
    private String nombre;
    private String estado; // Pendiente, En progreso, Completada

    public TareaBase(String nombre) {
        this.nombre = nombre;
        this.estado = "Pendiente";
    }

    public abstract void mostrarDetalles();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
