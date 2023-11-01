package grupo_6_pfa_.pkg1;

import java.util.*;

public class ColaDeClientes {

    private NodoCola frente;
    private NodoCola ultimo;

    public ColaDeClientes() {
        frente = null;
        ultimo = null;
    }

    Scanner scanner = new Scanner(System.in);

    public void agregarCliente() {
        System.out.print("Ingrese el numero de mesa: ");
        int numeroMesa = scanner.nextInt();
        scanner.nextLine();

        Clientes cliente = new Clientes(numeroMesa);

        System.out.print("Ingrese el numero de platillos que desea pedir: ");
        int numPlatillos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPlatillos; i++) {
            System.out.print("Ingrese el platillo " + (i + 1) + ": ");
            int platillo = scanner.nextInt();
            System.out.println();
            cliente.agregarPlatillo(platillo);
        }
        encolar(cliente);
        System.out.println("Cliente agregado a la cola.");
    }

    public void encolar(Clientes cliente) {
        NodoCola nuevoNodo = new NodoCola(cliente);
        if (estaVacia()) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public NodoCola atender() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia, presione Enter para continuar...");
            scanner.nextLine();
            return null;
        } else {
            NodoCola aux = frente;
            Clientes clienteAtendido = frente.getCliente();
            frente = frente.getAtras();

            if (frente == null) {
                ultimo = null;
            }

            if (clienteAtendido != null) {
                System.out.println("Numero de mesa= " + clienteAtendido.getNumeroMesa());

                int precioTotal = imprimirClientePlatillos(clienteAtendido.getPlatillos(), 0, 0);
    System.out.println("El precio a pagar es de: " + precioTotal);
                
                System.out.println("Cliente atendido. Presione Enter para continuar...");
                scanner.nextLine();
            }
            return aux;
        }
    }

private int imprimirClientePlatillos(ArrayList<Integer> platillos, int index, int prec) {
    if (index < platillos.size()) {
        int precioPlatillo = obtenerPrecioPlatilloPorID(platillos.get(index));
        prec += precioPlatillo;

        System.out.println("Platillo= " + platillos.get(index) + ", Precio= " + precioPlatillo);

        return imprimirClientePlatillos(platillos, index + 1, prec);
    } else {
        return prec;
    }
}


    private int obtenerPrecioPlatilloPorID(int platilloID) {
        switch (platilloID) {
            case 0:
                return 4000;
            case 1:
                return 6000;
            case 2:
                return 6500;
            case 3:
                return 4500;
            case 4:
                return 5500;
            default:
                return 0; 
        }
    }
}