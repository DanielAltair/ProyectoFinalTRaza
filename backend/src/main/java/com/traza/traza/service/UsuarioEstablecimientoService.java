
package com.traza.traza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traza.traza.entity.UsuarioEstablecimiento;
import com.traza.traza.entity.UsuarioEstablecimientoId;
import com.traza.traza.repository.UsuarioEstablecimientoRepository;

@Service
public class UsuarioEstablecimientoService {

    private final UsuarioEstablecimientoRepository usuarioEstablecimientoRepository;

    public UsuarioEstablecimientoService(
            UsuarioEstablecimientoRepository usuarioEstablecimientoRepository) {
        this.usuarioEstablecimientoRepository = usuarioEstablecimientoRepository;
    }

    public List<UsuarioEstablecimiento> listarRelaciones() {
        return usuarioEstablecimientoRepository.findAll();
    }

    public UsuarioEstablecimiento buscarRelacion(UsuarioEstablecimientoId id) {
        return usuarioEstablecimientoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Relacion no encontrada"));
    }

    public UsuarioEstablecimiento guardarRelacion(UsuarioEstablecimiento relacion) {
        return usuarioEstablecimientoRepository.save(relacion);
    }

    public void eliminarRelacion(UsuarioEstablecimientoId id) {
        usuarioEstablecimientoRepository.deleteById(id);
    }
}
