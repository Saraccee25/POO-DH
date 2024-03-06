package clases;

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(Cliente cliente, double tasaDeInteres) {
        super(cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    @java.lang.Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @java.lang.Override
    public void extraer(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public void cobrarInteres() {
        saldo *= (1 + tasaDeInteres);
    }
}
