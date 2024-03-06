package clases;

public abstract class Cuenta {
    protected Cliente cliente;
    protected double saldo;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }


    public abstract void depositar(double cantidad);


    public abstract void extraer(double cantidad);


    public double getSaldo() {
        return saldo;
    }
}
