package Titulo;

import java.time.LocalDate;
import java.util.Date;

public abstract class  Titulo {
    //atributos
    protected Persona Persona;
    protected int cantMaterias;
    protected Date fechaInicio;
    protected Date fechafin;
    protected boolean selladoMinisterio;
    protected boolean selladoInstituto;

    //constructor


    public Titulo(Persona persona, int cantMaterias, Date fechaInicio, Date fechafin, boolean selladoMinisterio, boolean selladoInstituto) {
        Persona = persona;
        this.cantMaterias = cantMaterias;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
    }

    //metodos
    public boolean sePuedeEjercer() {
        return selladoMinisterio && selladoInstituto;
    }
}
