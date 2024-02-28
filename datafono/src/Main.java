//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Titular titular = new Titular("4234234hj", "ndnsaknd" ,"jdj", 3435, "kds@fj");
        TarjetaCredito tarjeta = new TarjetaCredito(TarjetaCredito.Entidad.Maxicard, "bankia", 1234, 1200, titular);
        Datafono datafono = new Datafono(tarjeta, 1000, 4);

        System.out.println(datafono.efectuarPago());

        System.out.println(tarjeta.getSaldoDisponible());

    }
}