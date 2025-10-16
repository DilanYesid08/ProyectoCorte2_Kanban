package com.mycompany.proyecto_kanban;

// Clase principal: controla el flujo y prueba las funciones básicas
import java.util.Scanner;

public class Proyecto_Kanban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Proyecto proyecto = new Proyecto("Proyecto Kanban");

        int opcion;
        do {
            System.out.println("\n===== SISTEMA KANBAN =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    TareaNormal tarea = new TareaNormal(nombre);
                    proyecto.agregarTarea(tarea);
                    System.out.println("Tarea agregada correctamente.");
                    break;
                case 2:
                    proyecto.mostrarTareas();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}
