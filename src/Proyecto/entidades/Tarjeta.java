package Proyecto.entidades;

public abstract class Tarjeta {
    private String cuenta;

    public Tarjeta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
