import org.w3c.dom.html.HTMLImageElement;

import java.util.IllegalFormatCodePointException;

public class TarjetaCredito {

    private Entidad entidad;
    private String entidadBancaria;
    private int numeroTarjeta;
    private double saldoDisponible;
    private Titular titular;

    enum Entidad{
        Minicard,
        Maxicard
    }

    //Constructor

    public TarjetaCredito(Entidad entidad, String entidadBancaria, int numeroTarjeta, double saldoDisponible, Titular titular){
        this.entidad = entidad;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
        System.out.println(this);
        System.out.println(this.titular);
    }

    public void setSaldoDisponible(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public boolean comprobarSaldo(double importe){
        if (importe > saldoDisponible){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "entidad=" + entidad +
                ", entidadBancaria='" + entidadBancaria + '\'' +
                ", numeroTarjeta=" + numeroTarjeta +
                ", saldoDisponible=" + saldoDisponible +
                '}';
    }
}
