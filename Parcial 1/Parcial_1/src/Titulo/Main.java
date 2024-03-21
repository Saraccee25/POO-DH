package Titulo;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Sara", "Castaneda", 1033177077, 19);
        Date fechaInicio = new Date();
        Date fechaFinalizacion = new Date();


        TituloLicenciatura tituloLicenciatura1 = new TituloLicenciatura(persona, 15, fechaInicio, fechaFinalizacion, true, true, "Tema de tesis", fechaFinalizacion, 5);
        TituloLicenciatura tituloLicenciatura2 = new TituloLicenciatura(persona, 15, fechaInicio, fechaFinalizacion, true, false, "Tema de tesis", fechaFinalizacion, 3);

        if(tituloLicenciatura1.sePuedeEjercer()) {
            System.out.println("Se puede ejercer con el primer título de licenciatura");
        }else{
            System.out.println("No se puede ejercer el titulo ingresado");
        }
        if(tituloLicenciatura2.sePuedeEjercer()) {
            System.out.println("Se puede ejercer con el segundo título de licenciatura");
        }else{
            System.out.println("No se puede ejercer el titulo ingresado");
        }
        System.out.println("¿Cuál licenciatura tiene más trabajos de investigación?");
        int comparacion = tituloLicenciatura1.compareTo(tituloLicenciatura2);
        if (comparacion > 0) {
            System.out.println("El primer título de licenciatura tiene más trabajos de investigación.");
        } else if (comparacion < 0) {
            System.out.println("El segundo título de licenciatura tiene más trabajos de investigación.");
        } else {
            System.out.println("Ambos títulos de licenciatura tienen la misma cantidad de trabajos de investigación.");
        }

        TituloTerciario tituloTerciario1 = new TituloTerciario(persona, 12, fechaInicio, fechaFinalizacion, true, true, "NACIONAL");
        TituloTerciario tituloTerciario2 = new TituloTerciario(persona, 12, fechaInicio, fechaFinalizacion, true, true, "PROVINCIAL");
        if(tituloTerciario1.esValidoNacionalmente()){
            System.out.println("El primer título terciario es válido a nivel nacional " );
        }
        else{
            System.out.println("El primer título terciario no es válido a nivel nacional " );
        }
        if(tituloTerciario2.esValidoNacionalmente()){
            System.out.println("El segundo título terciario es válido a nivel nacional " );
        }
        else{
            System.out.println("El segundo título terciario no es válido a nivel nacional " );
        }


    }

}

