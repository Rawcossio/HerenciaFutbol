package LigaFutbol;

public class Usuario {

    //Atributos
    private int IdUsuario,edad;
    private String nombre, posicion;

    //Metodos

    //Genero metodo constructor

    public Usuario(int idUsuario, int edad, String nombre, String posicion) {
        System.out.println("estamos ingresando los datos de un usuario");
        IdUsuario = idUsuario;
        this.edad = edad;
        this.nombre = nombre;
        this.posicion = posicion;
    }//se esta sobrecrgando el metodo constructor al darle comportamientos

    public String correr(){
        return "el usuario puede correr";
    }//Se esta sobreescribiendo el metodo en una clase diferente

    public String calentar(){
        return "el usuario puede calentar ";
    }


    //Genero getter and setter

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
