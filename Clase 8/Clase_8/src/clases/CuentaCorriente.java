package clases;

import clases.Cuenta;

public class CuentaCorriente extends Cuenta {
    private double montoAutorizadoDescubierto;

    public CuentaCorriente(Cliente cliente, double montoAutorizadoDescubierto) {
        super(cliente);
        this.montoAutorizadoDescubierto = montoAutorizadoDescubierto;
    }

    @java.lang.Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @java.lang.Override
    public void extraer(double cantidad) {
        if (cantidad <= saldo + montoAutorizadoDescubierto) {
            saldo -= cantidad;
        }
    }
}
