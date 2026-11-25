
package com.traza.traza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.traza.traza.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
