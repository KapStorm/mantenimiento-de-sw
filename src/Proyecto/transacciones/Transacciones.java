package Proyecto.transacciones;

import Proyecto.entidades.Cliente;

import java.util.List;

public interface Transacciones {
    void transaccion(Cliente cliente, List<Cliente> clientes);
}
