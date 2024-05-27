package Proyecto.entidades;

import java.util.List;
import java.util.UUID;

public class Cliente {
    private Integer identificador;
    private String nombre;
    private String banco;
    private String localizacion;
    private Cuenta cuenta;
    private TarjetaDebito tarjetaDebito;
    private String nip;
    private List<Transaccion> transaccion;

    public Cliente(
            Integer identificador,
            String nombre,
            String banco,
            String localizacion,
            Cuenta cuenta,
            TarjetaDebito tarjetaDebito,
            String nip) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.banco = banco;
        this.localizacion = localizacion;
        this.cuenta = cuenta;
        this.tarjetaDebito = tarjetaDebito;
        this.nip = nip;
        this.transaccion = List.of();
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public List<Transaccion> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(List<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }
}
