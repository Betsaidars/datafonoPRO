public class Titular {

    private String dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;

    //Constuctor

    public Titular(String dni, String nombre, String apellido, int telefono, String mail){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //toString

    @Override
    public String toString() {
        return "Titular{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", mail='" + mail + '\'' +
                '}';
    }
}
