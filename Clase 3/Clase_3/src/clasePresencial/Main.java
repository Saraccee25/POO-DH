package clasePresencial;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("corolla", "sedan", 1.6, 2019, 1200);
        System.out.println(auto1.arrancar());
        System.out.println(auto1.acelerar(2000));

    }
}
