package boletin30;


public class Futbolista extends SeleccionFutbol {
    
    private Integer dorsal;
    private String demarcacion;

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja.");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista se entrena.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido.");
    }
    
    @Override
    public void entrevista() {
        System.out.println("El futbolista es entrevistado.");
    }

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +  ", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }
    
}