package grupo_6_pfa_.pkg1;

import java.util.*;

public class ColaCircularPlatillos {

    NodoPlatillos cabeza;
    NodoPlatillos ultimo;

    Scanner scanner = new Scanner(System.in);

    public void insertarColaCircular(int idPlatillo, String nombrePlatillo, int gasto, int precio) {
        Platillos platillo = new Platillos(idPlatillo, nombrePlatillo, gasto, precio);

        if (cabeza == null) {
            cabeza = new NodoPlatillos(platillo);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
        } else {
            if (platillo.getIdPlatillo() < cabeza.getDato().getIdPlatillo()) {
                //Insertamos al inicio
                NodoPlatillos auxiliar = new NodoPlatillos(platillo);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            } else {
                if (ultimo.getDato().getIdPlatillo() < platillo.getIdPlatillo()) {
                    //Insertamos al final
                    NodoPlatillos auxiliar = new NodoPlatillos(platillo);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                } else {
                    //Insertamos en el medio de la lista
                    NodoPlatillos auxiliar = cabeza;
                    while (auxiliar.getSiguiente().getDato().getIdPlatillo() < platillo.getIdPlatillo()) {
                        auxiliar = auxiliar.getSiguiente();
                    }

                    NodoPlatillos temporal = new NodoPlatillos(platillo);
                    temporal.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(temporal);
                }
            }
        }
    }

    
    public String imprimirSiguienteDelUltimo() {
        return ultimo.getSiguiente().toString();
    }

    @Override
    public String toString() {
        String respuesta = "Menu circular: \n";

        NodoPlatillos auxiliar = cabeza;

        if (auxiliar != null) {
            //Para determinar que no está vacía
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            while (auxiliar != cabeza) {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }

}
