package Proyecto.transacciones;

import Proyecto.entidades.Cliente;

import java.time.LocalDate;
import java.util.List;

public class Consultar implements Transacciones {
    @Override
    public void transaccion(Cliente cliente, List<Cliente> clientes) {
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
