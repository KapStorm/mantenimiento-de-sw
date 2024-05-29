package Proyecto.transacciones;

import Proyecto.entidades.Cliente;

import java.util.List;
import java.util.Scanner;

public class Retirar implements Transacciones {
    @Override
    public void transaccion(Cliente cliente, List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuanto deseas retirar: ");
        Double retiro = scanner.nextDouble();

        if (retiro <= 0) {
            System.out.println("Cantidad invalida.");
            return;
        }

        if (retiro > cliente.getCuenta().getSaldo()) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        Double saldo = cliente.getCuenta().getSaldo();
        cliente.getCuenta().setSaldo(saldo - retiro);

        System.out.println("====================================");
        System.out.println("=================" + cliente.getBanco() + "===============");
        System.out.println("=== " + cliente.getLocalizacion() + " ===");
        System.out.println("				Debito				");
        System.out.println("Se relalizo un retiro el " + java.time.LocalDate.now());
        System.out.println("Tu saldo actual es: " + cliente.getCuenta().getSaldo());
        System.out.println("====================================");
    }
}
