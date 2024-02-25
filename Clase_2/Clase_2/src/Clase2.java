import java.util.Scanner;
public class Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        String iniciales = inicialNombre + " " + inicialApellido;

        System.out.println("iniciales = " + iniciales);
    }
}
