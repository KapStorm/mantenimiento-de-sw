package Proyecto;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:	(Catalina)");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese su Numero de cuenta:	(23140972)");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if (Nombre.equals("Catalina") && Num_cuenta.equals("23140972") && Nip == 8002) {
            System.out.println("===============================================");
            System.out.print(Nombre);
            Clase_Abstractaa mesajero = new Consulta();
            mesajero.setSaldo(1700);
            mesajero.Operaciones();
        } else {
            System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
            System.out.println("===============================================");

        }
    }

    public String getNombre() {
        return getNombre();
    }
}

