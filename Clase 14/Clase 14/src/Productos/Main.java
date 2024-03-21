package Productos;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = ProductoFactory.crearProducto("CAJA10X10");
        System.out.println("Espacio que ocupa: " + producto1.calcularEspacio());
        Producto producto2= ProductoFactory.crearProducto("PELOTAFUTBOL");
        System.out.println("Espacio que ocupa: " + producto2.calcularEspacio());
        Producto producto3 = ProductoFactory.crearProducto("PELOTATENIS");
        System.out.println("Espacio que ocupa: " + producto3.calcularEspacio());

        Almacen todoA5Mil = new Almacen();
        todoA5Mil.agregarProducto(producto1);
        todoA5Mil.agregarProducto(producto2);
        todoA5Mil.agregarProducto(producto3);

        System.out.println("Espacio necesario: " + todoA5Mil.calcularEspacioNecesario());

    }

}
