package clases;

public class Velero extends Embarcacion{
    private int cantidadMastiles;

    //constructor

    public Velero(Capitan capitan, int precioBase, int valorAdicional, double eslora, int anioFabricacion, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, eslora, anioFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @java.lang.Override
    public double calcularMontoAlquiler() {
        return 0;
    }
}
