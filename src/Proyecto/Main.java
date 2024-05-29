package Proyecto;

import Proyecto.entidades.Cliente;
import Proyecto.entidades.Cuenta;
import Proyecto.entidades.TarjetaDebito;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static List<Cliente> clientes = List.of(new Cliente(
            1,
            "Catalina",
            "BBVA",
            "Culiacan",
            new Cuenta(Cuenta.TipoCuenta.CUENTA_DE_AHORRO, 232.23),
            new TarjetaDebito("123"),
            "8002"), new Cliente(
            2,
            "Juan",
            "Banorte",
            "Culiacan",
            new Cuenta(Cuenta.TipoCuenta.CUENTA_DE_CHEQUES, 123.23),
            new TarjetaDebito("456"),
            "8003"));

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
//        System.out.println("Ingrese su Nombre:	(Catalina)");
//        String Nombre = entrada.nextLine();
//        System.out.println("Ingrese su Identificador:	(1)");
//        String Num_cuenta = entrada.nextLine();
//        System.out.println("Ingrese su Nip:		(8002)");
//        String Nip = entrada.nextLine();
        String Nombre = "Catalina";
        Integer Num_cuenta = 1;
        String Nip = "8002";
        Optional<Cliente> clienteOptional = clientes.stream()
                                                    .filter(cliente -> cliente.getNombre()
                                                                              .equals(Nombre) && cliente.getNip()
                                                                                                        .equals(Nip) && Objects.equals(cliente.getIdentificador(),
                                                            Num_cuenta))
                                                    .findFirst();
        System.out.println("----------------------------------------------------");
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            System.out.println("===============================================");
            System.out.print(cliente.getNombre());
            Menu.Operaciones(cliente, clientes);
        } else {
            System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
            System.out.println("===============================================");

        }
    }
}

