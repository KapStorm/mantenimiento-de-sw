package Proyecto;

import java.util.Scanner;

public abstract class Clase_Abstractaa {
    private static int saldo;
    protected int transacciones, retiro, deposito, transferencia;
    String numero_cuenta;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        String Nombre = "";
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

                if (seleccion >= 1 && seleccion <= 5) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                Clase_Abstractaa mensajero = new Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                Clase_Abstractaa mensajero = new Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                Clase_Abstractaa mensajero = new Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                Clase_Abstractaa mensajero = new Transferencia();
                mensajero.Transacciones();
            } else if (seleccion == 5) {
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    public void Numero_cuenta() {
        numero_cuenta = entrada.nextLine();
    }

    public void Retiro() {
        retiro = entrada.nextInt();
    }

    public void Deposito() {
        deposito = entrada.nextInt();
    }

    public void Transferencia() {
        transferencia = entrada.nextInt();
    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        Clase_Abstractaa.saldo = saldo;
    }

}
