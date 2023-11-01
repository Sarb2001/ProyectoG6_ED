package grupo_6_pfa_.pkg1;

import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MenuPrincipal {
    private List<Empleados> listaEmpleados;

    public MenuPrincipal() {
        listaEmpleados = new ArrayList<>();
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("--------Menu Principal---------\n\n"
                    + "1 = Mostrar menu"
                    + "\n2 = Agregar Cliente"
                    + "\n3= Atender Cliente"
                    + "\n4 = Agregar Empleado"
                    + "\n5 = Despedir Empleado"
                    + "\n6 = Salir"
                    + "\nDigite una opcion..:");

            int opcionMenu = scan.nextInt();

            switch (opcionMenu) {
                case 1:
                    // Resto de la lógica para mostrar el menú (lista de platillos)
                    break;
                case 2:
                    // Resto de la lógica para agregar un cliente
                    break;
                case 3:
                    // Resto de la lógica para atender un cliente
                    break;
                case 4:
                    // Agregar un empleado
                    System.out.println("Ingrese el ID del empleado:");
                    int id = scan.nextInt();
                    scan.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scan.nextLine();
                    System.out.println("Ingrese el puesto del empleado:");
                    String puesto = scan.nextLine();

                    Empleados nuevoEmpleado = new Empleados(id, nombre, puesto);
                    listaEmpleados.add(nuevoEmpleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;
                case 5:
                    // Resto de la lógica para despedir un empleado
                    break;
                case 6:
                    continuar = false; // Salir del bucle y del programa
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
