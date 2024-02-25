import java.util.Scanner;

public class Ejercitacion {
    public static void main(String[] args) {
        //Ejercicio 1
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        number = input.nextInt();
        if(esPrimo(number)){
            System.out.println("El número: " + number +" " +"es primo");
        }else{
            System.out.println("El número: " + number + " "+"no es primo");
        }

        //Ejercicio2
        System.out.println("Ingrese un número: ");
        Integer num1 = input.nextInt();
        System.out.println("Ingrese otro número: ");
        Integer num2 = input.nextInt();
        System.out.println("Ingrese un último número: ");
        Integer num3 = input.nextInt();

        System.out.println("El numero mayor es: " +  maximoEntreTresNumeros(num1, num2, num3));

        String texto1 = "Hola";
        String texto2 = "Hola";
        String texto3 = "Adiós";

        System.out.println("¿Las cadenas '" + texto1 + "' y '" + texto2 + "' son distintas? " + cadenasDeTextoDistintas(texto1, texto2));
        System.out.println("¿Las cadenas '" + texto1 + "' y '" + texto3 + "' son distintas? " + cadenasDeTextoDistintas(texto1, texto3));

    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        return Math.max(Math.max(unNumeroA, unNumeroB), unNumeroC);
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !unTextoA.equals(unTextoB);
    }
}
