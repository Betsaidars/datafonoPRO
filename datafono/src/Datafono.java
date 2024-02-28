import javax.xml.crypto.Data;

public class Datafono {

    private TarjetaCredito tarjeta;
    private double importe;
    private int cuotas;

    public Datafono(TarjetaCredito tarjeta, double importe, int cuotas){
        this.tarjeta = tarjeta;
        this.importe = importe;

        if (cuotas < 1){
            this.cuotas = 1;
        } else if (cuotas > 6){
            this.cuotas = 6;
        } else {
            this.cuotas = cuotas;
        }

    }

    public Ticket efectuarPago(){
        double importeTotal = this.importe;
        double porcentaje = 1;
        double importeCuotas;

        if (cuotas == 1){
            importeTotal *= porcentaje;
        } else if (cuotas >= 2 && cuotas <= 6){
            for (int i = 2; i <= cuotas; i++){
                porcentaje += 0.03;
            }
            importeTotal *= porcentaje;
        } else {
            System.out.println("No se puede pagar en esas cuotas");
        }

        importeCuotas = importeTotal / this.cuotas;

        if (tarjeta.comprobarSaldo(importeTotal)){
            tarjeta.setSaldoDisponible(tarjeta.getSaldoDisponible() - importeTotal);
            Ticket ticket = new Ticket(tarjeta.getTitular().getNombre(), tarjeta.getTitular().getApellido(), importeTotal, importeCuotas);
            return ticket;
        }
            return null;
    }
}
