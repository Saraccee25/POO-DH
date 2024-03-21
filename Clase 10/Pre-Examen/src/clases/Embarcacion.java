package clases;

public abstract class Embarcacion {
    //atributos
    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private double eslora;
    protected int anioFabricacion;

    //constructor


    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, double eslora, int anioFabricacion) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    //metodos
    public abstract double calcularMontoAlquiler();

    @java.lang.Override
    public String toString(){
        return "Embarcacion{" +
                "nombreCapitan='" + nombreCapitan + '\'' +
                ", apellidoCapitan='" + apellidoCapitan + '\'' +
                ", matriculaCapitan='" + matriculaCapitan + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioFabricacion=" + anioFabricacion +
                ", eslora=" + eslora +
                '}';
    }


}
