package Proyecto;

public class Cuenta {
    private Cliente cliente;
    private TipoCuenta tipoCuenta;
    private Double saldo;

    public enum TipoCuenta {
        CUENTA_DE_AHORRO,
        CUENTA_DE_CHEQUES,
    }

    public Cuenta(Cliente cliente, TipoCuenta tipoCuenta, Double saldo) {
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
