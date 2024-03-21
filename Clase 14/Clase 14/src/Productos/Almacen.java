package Productos;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productos;
    public Almacen() {
        this.productos = new ArrayList<>();
    }
    public double calcularEspacioNecesario() {
        double espacioTotal = 0;
        for (Producto producto : productos) {
            espacioTotal += producto.calcularEspacio();
        }
        return espacioTotal;
    }
    public void agregarProducto(Producto item){
        productos.add(item);
    }
}
