package com.mycompany.proyecto_kanban;

// Representa un usuario asociado a proyectos (Asociación)
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Proyecto> proyectos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto p) {
        proyectos.add(p);
    }

    public String getNombre() {
        return nombre;
    }
}
