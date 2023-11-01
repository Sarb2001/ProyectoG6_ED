package grupo_6_pfa_.pkg1;

import java.util.ArrayList;

public class Clientes {
    
    private int numeroMesa;
    private ArrayList<Integer> platillosDeCliente;  
    
    public Clientes(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.platillosDeCliente = new ArrayList<>();
    }

    public Clientes(int numeroMesa, ArrayList<Integer> platillos) {
        this.numeroMesa = numeroMesa;
        this.platillosDeCliente = platillos;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public ArrayList<Integer> getPlatillos() {
        return platillosDeCliente;
    }

    public void setPlatillos(ArrayList<Integer> platillosDeCliente) {
        this.platillosDeCliente = platillosDeCliente;
    }
    
    public void agregarPlatillo(int platillo) {
        platillosDeCliente.add(platillo);
    }
}
