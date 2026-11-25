
package com.traza.traza.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "establecimientos")
public class Establecimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_establecimiento")
    private Integer idEstablecimiento;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 255, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    public Establecimiento() {
    }

    public Integer getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(Integer idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
