package boletin30;


public class Seleccionador extends SeleccionFutbol {

    @Override
    public void concentrarse() {
        System.out.println("El seleccionador se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador viaja.");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador se entrena.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador participa en un partido.");
    }
    
    @Override
    public void seleccionarJugador() {
        System.out.println("El seleccionador selecciona un jugador.");
    }

    public Seleccionador() {
    }

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}