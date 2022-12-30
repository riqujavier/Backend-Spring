
package com.PortArg.demo.Repository;


import com.PortArg.demo.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long>{
    Optional<Rol> findByName(String name);
}
