package LigaFutbol;

public class Main {
    public static void main(String[] args) {
        Jugador jugador=new Jugador(1,22,"Alex","defensor",4,"union magdalena");
        Arbitro arbitro=new Arbitro(2,39,"Wilmar","linea",5,10000000);

        System.out.println("El jugador "+jugador.getNombre()+
                "\n juega en la posicion "+jugador.getPosicion()+
                "\n para el equipo "+jugador.getEquipo()+
                "\n puede hacer las siguientes acciones "+
                "\n"+jugador.entrenar()+
                "\n"+jugador.calentar()+
                "\n"+jugador.correr()+
                "\n"+jugador.anotar()+
                "\n"+jugador.asistir());
    }
}
