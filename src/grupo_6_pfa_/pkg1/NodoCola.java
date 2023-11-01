package grupo_6_pfa_.pkg1;

public class NodoCola {
 
    private Clientes cliente;
    private NodoCola atras;

    public NodoCola(Clientes cliente) {
        this.cliente = cliente;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }
}
