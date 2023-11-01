package grupo_6_pfa_.pkg1;

import java.util.*;
import javax.swing.JOptionPane;

public class MenuPrincipal {

    public void menu() {
        ColaDeClientes colaClientes = new ColaDeClientes();
        ColaCircularPlatillos platillos = new ColaCircularPlatillos();
        PilaDeEmpleados pilaEmpleados = new PilaDeEmpleados();

        platillos.insertarColaCircular(0, "Arroz con pollo", 3000, 4000);
        platillos.insertarColaCircular(3, "Enchiladas", 3200, 4500);
        platillos.insertarColaCircular(4, "Tacos de Carnitas", 3800, 5500);
        platillos.insertarColaCircular(1, "Carnita Roja", 4000, 6000);
        platillos.insertarColaCircular(2, "cantones", 4500, 6500);

        Scanner scan = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("--------Menu Principal---------\n\n"
                    + "1 = Mostrar menu"
                    + "\n2 = Agregar Cliente"
                    + "\n3= Atender Cliente"
                    + "\n4 = Agregar Empleado"
                    + "\n5 = Despedir Empleado"
                    + "\n6 = Imprimir Empleados y Platillos"
                    + "\n7 = Salir"
                    + "\nDigite una opcion..:");

            int opcionMenu = scan.nextInt();

            switch (opcionMenu) {
                case 1:

                    System.out.println(platillos.toString());
                    System.out.println("Si desea ordenar algo presione Enter...");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 2:
                    colaClientes.agregarCliente();
                    break;
                case 3:
                    colaClientes.atender();
                    System.out.println("Para volver al menu digite Enter...");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 4:
                    pilaEmpleados.agregarEmpleado();
                    System.out.println("Para volver al menu digite Enter...");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 5:

                    pilaEmpleados.despedir();
                    System.out.println("Para volver al menu digite Enter...");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 6:
                    colaClientes.imprimirClientesYPlatillos();
                    pilaEmpleados.imprimirEmpleadosOrdenadosPorID();
                    System.out.println("Presione enter para salir");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 7:
                    System.out.println("Hasta Pronto");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
