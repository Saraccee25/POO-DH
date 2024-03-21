package Productos;

public class Pelota extends Producto{

    //atributos
    private double radio;

    //metodos

    public Pelota(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}
