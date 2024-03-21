package clases;

public class Yate extends Embarcacion{
    //atributos
    private int cantidadCamarotes;
    //constructor
    public Yate(Capitan capitan, int precioBase, int valorAdicional, double eslora, int anioFabricacion, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, eslora, anioFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @java.lang.Override
    public double calcularMontoAlquiler() {
        return 0;
    }
}
