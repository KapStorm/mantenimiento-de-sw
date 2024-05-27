package Proyecto.transacciones;

import Proyecto.entidades.Cliente;
import Proyecto.entidades.Cuenta;

import java.util.List;

public interface Transaccion {
    void transaccion(Cliente cliente, List<Cliente> clientes);
}
