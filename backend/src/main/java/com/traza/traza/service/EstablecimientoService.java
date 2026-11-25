
package com.traza.traza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traza.traza.entity.Establecimiento;
import com.traza.traza.repository.EstablecimientoRepository;

@Service
public class EstablecimientoService {

    private final EstablecimientoRepository establecimientoRepository;

    public EstablecimientoService(EstablecimientoRepository establecimientoRepository) {
        this.establecimientoRepository = establecimientoRepository;
    }

    public List<Establecimiento> listarEstablecimientos() {
        return establecimientoRepository.findAll();
    }

    public Establecimiento buscarEstablecimiento(Integer id) {
        return establecimientoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Establecimiento no encontrado"));
    }

    public Establecimiento guardarEstablecimiento(Establecimiento establecimiento) {
        return establecimientoRepository.save(establecimiento);
    }

    public void eliminarEstablecimiento(Integer id) {
        establecimientoRepository.deleteById(id);
    }
}
