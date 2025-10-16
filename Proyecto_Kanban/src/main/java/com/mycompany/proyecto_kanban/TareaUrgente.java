package com.mycompany.proyecto_kanban;

// Subclase de TareaBase
public class TareaUrgente extends TareaBase implements Movible {
    private int prioridad;

    public TareaUrgente(String nombre, int prioridad) {
        super(nombre);
        this.prioridad = prioridad;
    }

    @Override
    public void moverEstado(String nuevoEstado) {
        setEstado(nuevoEstado);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[URGENTE] " + getNombre() + " - Prioridad: " + prioridad + " - Estado: " + getEstado());
    }
}
