package boletin30;

public class Boletin30 {


    public static void main(String[] args) {
       
        SeleccionFutbol f1 = new Futbolista(7,"Delantero",127,"Leo","Messi",35);
        Futbolista f2 = new Futbolista();
        System.out.println(f1.toString());
        f1.entrevista();
        f1.entrenar();
        f2.viajar();
        SeleccionFutbol s1 = new Seleccionador(21,"Jorge","Valverde",58);
        s1.seleccionarJugador();
        s1.concentrarse();
        System.out.println(s1.toString());
        Entrenador e1 = new Entrenador();
        e1.planificarEntrenamiento();
}
    
}
