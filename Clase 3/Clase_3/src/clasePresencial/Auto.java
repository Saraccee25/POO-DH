package clasePresencial;

public class Auto {
    //atributos
    private String modelo;
    private String tipo;
    private double cilindrada;
    private int anioFabricacion;
    private int capacidadTanque;

    //contructor
    public Auto(String modelo, String tipo, double cilindrada, int anio, int capacidad){
        this.modelo = modelo;
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.anioFabricacion = anio;
        this.capacidadTanque = capacidad;
    }

    public Auto() {

    }

    //metodos
    public String arrancar(){
        return "El auto " +  modelo + " "+ tipo + " esta arrancando";
    }

    public String acelerar(int rpm){
        return "El auto \" +  modelo + \" \"+ tipo + \" esta acelerando a " + "rpm";
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
