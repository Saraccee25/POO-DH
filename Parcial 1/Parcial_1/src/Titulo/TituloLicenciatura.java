package Titulo;
import java.util.Date;

public class TituloLicenciatura extends Titulo{

    //atributos
    private String temaTesis;
    private Date fechaEntregaTesis;
    private int cantidadTrabajosInvestigacion;

    public TituloLicenciatura(Persona persona, int cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selladoPorMinisterio, boolean selladoPorInstituto, String temaTesis, Date fechaEntregaTesis, int cantidadTrabajosInvestigacion) {
        super(persona, cantidadMaterias, fechaInicio, fechaFinalizacion, selladoPorMinisterio, selladoPorInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntregaTesis = fechaEntregaTesis;
        this.cantidadTrabajosInvestigacion = cantidadTrabajosInvestigacion;
    }

    public int getCantidadTrabajosInvestigacion() {
        return cantidadTrabajosInvestigacion;
    }

    public boolean sePuedeEjercer() {
        return super.sePuedeEjercer();
    }
    public int compareTo(TituloLicenciatura otroTitulo) {
        return Integer.compare(this.cantidadTrabajosInvestigacion, otroTitulo.cantidadTrabajosInvestigacion);
    }

}
