package com.mycompany.proyecto_kanban;

// Representa un proyecto que contiene varias tareas (Agregación)
import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<TareaBase> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(TareaBase tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (TareaBase t : tareas) {
                t.mostrarDetalles();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}
