
package com.traza.traza.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traza.traza.entity.Establecimiento;
import com.traza.traza.service.EstablecimientoService;

@RestController
@RequestMapping("/api/establecimientos")
public class EstablecimientoController {

    private final EstablecimientoService establecimientoService;

    public EstablecimientoController(EstablecimientoService establecimientoService) {
        this.establecimientoService = establecimientoService;
    }

    // Listar todos los establecimientos
    @GetMapping
    public List<Establecimiento> listarEstablecimientos() {
        return establecimientoService.listarEstablecimientos();
    }

    // Buscar un establecimiento por ID
    @GetMapping("/{id}")
    public Establecimiento buscarEstablecimiento(@PathVariable Integer id) {
        return establecimientoService.buscarEstablecimiento(id);
    }
}
