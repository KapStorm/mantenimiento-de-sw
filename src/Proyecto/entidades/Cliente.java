package Proyecto.entidades;

import java.util.UUID;

public class Cliente {
    private Integer identificador;
    private String nombre;
    private String banco;
    private String localizacion;

    public Cliente(Integer identificador, String nombre, String banco, String localizacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.banco = banco;
        this.localizacion = localizacion;
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
}
