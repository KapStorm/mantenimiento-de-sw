package Proyecto;

public class Deposito
        extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("===================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("===================================");
    }

}