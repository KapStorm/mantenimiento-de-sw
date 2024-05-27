package Proyecto.transacciones;

import Proyecto.entidades.Cliente;
import Proyecto.entidades.Cuenta;

import java.util.List;
import java.util.Scanner;

public class Depositar implements Transaccion {
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
    }
}
