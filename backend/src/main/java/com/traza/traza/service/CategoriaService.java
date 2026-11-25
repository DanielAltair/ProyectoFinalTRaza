
package com.traza.traza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traza.traza.entity.Categoria;
import com.traza.traza.repository.CategoriaRepository;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarCategoria(Integer id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
    }

    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void eliminarCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
