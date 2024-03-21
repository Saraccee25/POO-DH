package Titulo;

import java.time.LocalDate;
import java.util.Date;

public class TituloTerciario extends Titulo{

    //atributos
    private String validacion;

    //constructor


    public TituloTerciario(Persona persona, int cantMaterias, Date fechaInicio, Date fechafin, boolean selladoMinisterio, boolean selladoInstituto, String validacion) {
        super(persona, cantMaterias, fechaInicio, fechafin, selladoMinisterio, selladoInstituto);
        this.validacion = validacion;
    }

    //metodos
    public boolean esValidoNacionalmente() {
        return validacion.equals("NACIONAL");
    }
}
