package Proyecto.entidades;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class Transaccion {
    public enum TipoTransaccion {
        RETIRO,
        TRANSFERENCIA
    }

    private UUID id;
    private LocalDateTime fecha;
    private TipoTransaccion tipoTransaccion;
    private Optional<Cuenta> cuentaDestino;
    private Double monto;

    public Transaccion(Double monto) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.tipoTransaccion = TipoTransaccion.RETIRO;
        this.cuentaDestino = Optional.empty();
    }

    public Transaccion(Double monto, Cuenta cuentaDestino) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.tipoTransaccion = TipoTransaccion.TRANSFERENCIA;
        this.cuentaDestino = Optional.of(cuentaDestino);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Optional<Cuenta> getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Optional<Cuenta> cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
