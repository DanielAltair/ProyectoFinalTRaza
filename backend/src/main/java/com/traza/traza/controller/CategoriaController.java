
package com.traza.traza.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traza.traza.entity.Categoria;
import com.traza.traza.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // Listar todas las categorías
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    // Buscar una categoría por ID
    @GetMapping("/{id}")
    public Categoria buscarCategoria(@PathVariable Integer id) {
        return categoriaService.buscarCategoria(id);
    }
}
