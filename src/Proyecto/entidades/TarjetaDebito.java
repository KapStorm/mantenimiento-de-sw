package Proyecto.entidades;

public class TarjetaDebito {
    private String cuenta;
    private Cliente cliente;

    public TarjetaDebito(String cuenta, Cliente cliente) {
        this.cuenta = cuenta;
        this.cliente = cliente;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
