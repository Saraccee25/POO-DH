package Productos;

public class Caja extends Producto{

    //atributos

    private double longitud;
    private double ancho;
    private double altura;

    //metodos

    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {

        return longitud * ancho * altura;
    }
}
