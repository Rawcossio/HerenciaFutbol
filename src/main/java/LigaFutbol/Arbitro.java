package LigaFutbol;

public class Arbitro extends Usuario{
    //Atributos
    private int aniosExp;
    private double salario;

    //Metodos-genero el constructor

    public Arbitro(int idUsuario, int edad, String nombre, String posicion, int aniosExp, double salario) {
        super(idUsuario, edad, nombre, posicion);
        this.aniosExp = aniosExp;
        this.salario = salario;
    }

    public String pitar(){
        return "El arbitro"+getNombre()+" puede pitar ";
    }
    public String sancionar(){
        return "El arbitro"+getNombre()+" puede sancionar";
    }
    //Genero getter and setter

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
