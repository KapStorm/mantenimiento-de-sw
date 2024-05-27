package Proyecto;

import Proyecto.entidades.Cliente;
import Proyecto.entidades.Cuenta;

import java.util.Scanner;

public class Menu {
    static Scanner entrada = new Scanner(System.in);

    public static void Operaciones(Cliente cliente) {
        int seleccion = 0;
        do {
            do {
                System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                System.out.println(" Hoy es 31/10/2023");
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
                Consulta.Transacciones(cliente);
            } else if (seleccion == 2) {
                Clase_Abstractaa mensajero = new Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                Clase_Abstractaa mensajero = new Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                Clase_Abstractaa mensajero = new Transferencia();
                mensajero.Transacciones();
            } else {
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                break;
            }
        } while (true);
    }
}
