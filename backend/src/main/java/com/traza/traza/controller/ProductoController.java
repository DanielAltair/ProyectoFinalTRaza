
package com.traza.traza.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traza.traza.dto.DisponibilidadDTO;
import com.traza.traza.dto.ProductoDTO;
import com.traza.traza.entity.Categoria;
import com.traza.traza.entity.Producto;
import com.traza.traza.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Listar todos los productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }
    
    // Buscar un producto por ID
    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable Integer id) {
        return productoService.buscarProducto(id);
    }
    
    // Crear un producto
    @PostMapping
    public Producto crearProducto(@RequestBody ProductoDTO productoDTO) {

        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());

        Categoria categoria = new Categoria();
        categoria.setIdCategoria(productoDTO.getIdCategoria());

        producto.setCategoria(categoria);

        return productoService.guardarProducto(producto);
    }

    // Modificar un producto
    @PutMapping("/{id}")
    public Producto modificarProducto(
            @PathVariable Integer id,
            @RequestBody ProductoDTO productoDTO) {

        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());

        Categoria categoria = new Categoria();
        categoria.setIdCategoria(productoDTO.getIdCategoria());

        producto.setCategoria(categoria);

        return productoService.modificarProducto(id, producto);
    }

    // Cambiar la disponibilidad de un producto
    @PatchMapping("/{id}/disponibilidad")
    public Producto cambiarDisponibilidad(
            @PathVariable Integer id,
            @RequestBody DisponibilidadDTO disponibilidadDTO) {

        return productoService.cambiarDisponibilidad(
                id,
                disponibilidadDTO.getDisponible()
        );
    }
}
