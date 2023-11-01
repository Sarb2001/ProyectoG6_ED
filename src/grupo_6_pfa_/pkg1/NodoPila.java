/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo_6_pfa_.pkg1;

/**
 *
 * @author kenda
 */
public class NodoPila {
    
        private Empleados elemento;
    private NodoPila siguiente;
    
    
    public NodoPila(){
        this.siguiente=null;
    }

    public Empleados getElemento() {
        return elemento;
    }

    public void setElemento(Empleados elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
