package Proyecto.transacciones;

import Proyecto.entidades.Cliente;

import java.util.List;
import java.util.Scanner;

public class Depositar implements Transacciones {
    @Override
    public void transaccion(Cliente cliente, List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuanto deseas depositar: ");
        Double deposito = scanner.nextDouble();

        if (deposito <= 0) {
            System.out.println("Cantidad invalida.");
            return;
        }

        Double saldo = cliente.getCuenta().getSaldo();
        cliente.getCuenta().setSaldo(saldo + deposito);

        System.out.println("====================================");
        System.out.println("=================" + cliente.getBanco() + "===============");
        System.out.println("=== " + cliente.getLocalizacion() + " ===");
        System.out.println("				Deposito				");
        System.out.println("Se relalizo un deposito el " + java.time.LocalDate.now());
        System.out.println("Tu saldo actual es: " + cliente.getCuenta().getSaldo());
        System.out.println("====================================");
    }
}
