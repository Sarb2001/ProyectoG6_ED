/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo_6_pfa_.pkg1;

/**
 *
 * @author kenda
 */
public class Empleados {
    
    private int idEmpleado;
    private String nombre;
    private String puesto;

    public Empleados(int idEmpleado, String nombre, String puesto) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    public Empleados(){
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


}
