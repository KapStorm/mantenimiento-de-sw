package Proyecto;

import Proyecto.entidades.Cliente;
import Proyecto.transacciones.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner entrada = new Scanner(System.in);

    public static void Operaciones(Cliente cliente, List<Cliente> clientes) {
        int seleccion = 0;
        Transacciones transaccion = null;
        do {
            do {
                System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                System.out.println(" Tipo de cuenta: " + cliente.getCuenta().getTipoCuenta().toString());
                System.out.println(" Hoy es " + LocalDate.now());
                System.out.println(" Porfavor seleccione una opción:");
                System.out.println("    1. Proyecto.Consulta de saldo.");
                System.out.println("    2. Proyecto.Retiro de efectivo.");
                System.out.println("    3. Proyecto.Deposito de efectivo.");
                System.out.println("    4. Hacer una transferencia");
                System.out.println("    5. Salir.");
                seleccion = entrada.nextInt();

                if (!(seleccion >= 1 && seleccion <= 5)) {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================");
                } else {
                    break;
                }
            } while (true);

            if (seleccion == 1) {
                transaccion = new Consultar();
            } else if (seleccion == 2) {
                transaccion = new Retirar();
            } else if (seleccion == 3) {
                transaccion = new Depositar();
            } else if (seleccion == 4) {
                transaccion = new Transferir();
            } else {
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                break;
            }

            transaccion.transaccion(cliente, clientes);
        } while (true);
    }
}
