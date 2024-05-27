package Proyecto.transacciones;

import Proyecto.entidades.Cliente;
import Proyecto.entidades.Cuenta;

import java.util.List;
import java.util.Scanner;

public class Retirar implements Transaccion {
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
    }
}
