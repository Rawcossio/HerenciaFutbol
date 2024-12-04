package LigaFutbol;

public class Jugador extends Usuario{

    //Atributos
    private int numeroJugador;
    private String equipo;

    //Metodos-Genero el constructor

    public Jugador(int idUsuario, int edad, String nombre, String posicion, int numeroJugador, String equipo) {
        super(idUsuario, edad, nombre, posicion);
        this.numeroJugador = numeroJugador;
        this.equipo = equipo;
    }

    public String calentar(){
        return "el jugador "+getNombre()+" puede calentar";
    }

    //Se generan los metodos
    public String entrenar(){
        return "El jugador "+getNombre()+ " puede entrenar";
    }
    public String anotar(){
        return  "El jugador "+getNombre()+" puede anotar";
    }
    public String asistir(){
        return "el jugador"+getNombre()+" puede asistir";
    }

    //Genero getter and setter

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
