package Proyecto.entidades;

public class TarjetaDebito {
    private String cuenta;

    public TarjetaDebito(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
