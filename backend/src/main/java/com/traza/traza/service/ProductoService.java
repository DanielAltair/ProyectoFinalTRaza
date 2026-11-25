
package com.traza.traza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traza.traza.entity.Categoria;
import com.traza.traza.entity.Producto;
import com.traza.traza.repository.CategoriaRepository;
import com.traza.traza.repository.ProductoRepository;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProductoService(ProductoRepository productoRepository,
                           CategoriaRepository categoriaRepository) {
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarProducto(Integer id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public Producto guardarProducto(Producto producto) {

        Integer idCategoria = producto.getCategoria().getIdCategoria();

        Categoria categoria = categoriaRepository.findById(idCategoria)
                .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));

        producto.setCategoria(categoria);

        return productoRepository.save(producto);
    }

    public Producto modificarProducto(Integer id, Producto datosProducto) {

        Producto producto = buscarProducto(id);

        producto.setNombre(datosProducto.getNombre());
        producto.setPrecio(datosProducto.getPrecio());

        Integer idCategoria = datosProducto.getCategoria().getIdCategoria();

        Categoria categoria = categoriaRepository.findById(idCategoria)
                .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));

        producto.setCategoria(categoria);

        return productoRepository.save(producto);
    }

    public Producto cambiarDisponibilidad(Integer id, Boolean disponible) {

        Producto producto = buscarProducto(id);

        producto.setDisponible(disponible);

        return productoRepository.save(producto);
    }

    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
