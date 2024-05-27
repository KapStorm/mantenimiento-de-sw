package Proyecto;

import Proyecto.entidades.Cliente;

import java.time.LocalDate;

public class Consulta {

//    @Override
    public static void Transacciones(Cliente cliente) {
        System.out.println("====================================");
        System.out.println("=================" + cliente.getBanco() + "===============");
        System.out.println("=== " + cliente.getLocalizacion() + " ===");
        System.out.println("				Debito				");
        System.out.println("Se relalizo una Proyecto.Consulta el " + LocalDate.now());
        System.out.println("Tu saldo actual es: " + cliente.getCuenta()
                                                           .getSaldo());
        System.out.println("====================================");
    }
}
