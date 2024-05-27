package Proyecto;

public class Consulta
        extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Se relalizo una Proyecto.Consulta el 31/10/2023");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("====================================");
    }
}
