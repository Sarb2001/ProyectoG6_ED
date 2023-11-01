
package grupo_6_pfa_.pkg1;

public class Platillos {
    
    private int idPlatillo;
    private String nombrePlatillo;
    private int gasto;
    private int precio;

    public Platillos(int idPlatillo, String nombrePlatillo, int gasto, int precio) {
        this.idPlatillo = idPlatillo;
        this.nombrePlatillo = nombrePlatillo;
        this.gasto = gasto;
        this.precio = precio;
    }
    
    public Platillos(){
        
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
        @Override
    public String toString() {
        return "Platillo: #" + idPlatillo + ", Nombre: " + nombrePlatillo + ", Gasto: " + gasto + ", Precio: " + precio;
    }
}
