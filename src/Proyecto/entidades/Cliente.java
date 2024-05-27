package Proyecto.entidades;

public class Cliente {
    private String nombre;
    private String banco;
    private String localizacion;

    public Cliente(String nombre, String banco, String localizacion) {
        this.nombre = nombre;
        this.banco = banco;
        this.localizacion = localizacion;
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
