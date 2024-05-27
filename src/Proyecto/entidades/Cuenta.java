package Proyecto.entidades;

public class Cuenta {
    private TipoCuenta tipoCuenta;
    private Double saldo;

    public enum TipoCuenta {
        CUENTA_DE_AHORRO,
        CUENTA_DE_CHEQUES,
    }

    public Cuenta(TipoCuenta tipoCuenta, Double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
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
