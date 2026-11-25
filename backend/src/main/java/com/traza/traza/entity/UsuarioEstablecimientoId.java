
package com.traza.traza.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UsuarioEstablecimientoId implements Serializable {

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_establecimiento")
    private Integer idEstablecimiento;

    public UsuarioEstablecimientoId() {
    }

    public UsuarioEstablecimientoId(Integer idUsuario, Integer idEstablecimiento) {
        this.idUsuario = idUsuario;
        this.idEstablecimiento = idEstablecimiento;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(Integer idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEstablecimientoId)) return false;
        UsuarioEstablecimientoId that = (UsuarioEstablecimientoId) o;
        return Objects.equals(idUsuario, that.idUsuario)
                && Objects.equals(idEstablecimiento, that.idEstablecimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idEstablecimiento);
    }
}
