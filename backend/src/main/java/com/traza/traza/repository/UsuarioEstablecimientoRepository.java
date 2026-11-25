
package com.traza.traza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.traza.traza.entity.UsuarioEstablecimiento;
import com.traza.traza.entity.UsuarioEstablecimientoId;

public interface UsuarioEstablecimientoRepository extends JpaRepository<UsuarioEstablecimiento, UsuarioEstablecimientoId> {

}
