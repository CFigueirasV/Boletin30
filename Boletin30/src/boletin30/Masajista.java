package boletin30;


public class Masajista extends SeleccionFutbol {
    
    private String titulacion;
    private Integer aniosExperiencia;

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja.");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista participa en el partido.");
    }
    
    @Override
    public void darMasaje() {
        System.out.println("El masajista da un masaje.");
    }

    public Masajista() {
    }

    public Masajista(String titulacion, Integer aniosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia;
    }
    
}