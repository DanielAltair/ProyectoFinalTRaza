
package com.traza.traza.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_establecimiento")
public class UsuarioEstablecimiento {

    @EmbeddedId
    private UsuarioEstablecimientoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idEstablecimiento")
    @JoinColumn(name = "id_establecimiento", nullable = false)
    private Establecimiento establecimiento;

    public UsuarioEstablecimiento() {
    }

    public UsuarioEstablecimientoId getId() {
        return id;
    }

    public void setId(UsuarioEstablecimientoId id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
}
