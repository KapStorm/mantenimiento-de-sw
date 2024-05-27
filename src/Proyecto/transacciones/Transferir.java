package Proyecto.transacciones;

import Proyecto.entidades.Cliente;
import Proyecto.entidades.Cuenta;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Transferir implements Transaccion {
    @Override
    public void transaccion(Cliente cliente, List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A que cliente deseas transferir: ");
        Integer id = scanner.nextInt();

        if (cliente.getIdentificador().equals(id)) {
            System.out.println("No puedes transferir a la misma cuenta.");
            return;
        }

        Optional<Cliente> destinoMaybe = clientes.stream()
                                                 .filter(c -> c.getIdentificador().equals(id))
                                                 .findFirst();
        if (destinoMaybe.isEmpty()) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        Cliente destino = destinoMaybe.get();

        System.out.print("Cuanto deseas transferir: ");
        Double cantidad = scanner.nextDouble();

        if (cantidad <= 0) {
            System.out.println("Cantidad invalida.");
            return;
        }

        if (cantidad > cliente.getCuenta().getSaldo()) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        Cuenta cuentaOrigen = cliente.getCuenta();
        Cuenta cuentaDestino = destino.getCuenta();

        cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - cantidad);
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);
    }
}
