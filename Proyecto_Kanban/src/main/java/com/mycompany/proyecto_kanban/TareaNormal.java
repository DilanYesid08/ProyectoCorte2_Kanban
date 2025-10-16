package com.mycompany.proyecto_kanban;

// Subclase concreta de TareaBase
public class TareaNormal extends TareaBase implements Movible {

    public TareaNormal(String nombre) {
        super(nombre);
    }

    @Override
    public void moverEstado(String nuevoEstado) {
        setEstado(nuevoEstado);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[NORMAL] " + getNombre() + " - Estado: " + getEstado());
    }
}
