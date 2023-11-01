package grupo_6_pfa_.pkg1;

public class NodoPlatillos {

    NodoPlatillos siguiente;
    Platillos dato;

    public NodoPlatillos(Platillos dato) {
        this.dato = dato;
    }

    public NodoPlatillos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPlatillos siguiente) {
        this.siguiente = siguiente;
    }

    public Platillos getDato() {
        return dato;
    }

    public void setDato(Platillos dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato+"";
    }

}
