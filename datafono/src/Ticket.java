public class Ticket {

    private String nombre;
    private String apellido;
    private double importeTotal;
    private double cuota;

    public Ticket(String nombre, String apellido, double importeTotal, double cuota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.importeTotal = importeTotal;
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", importeTotal=" + importeTotal +
                ", cuota=" + cuota +
                '}';
    }
}
