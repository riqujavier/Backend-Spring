
package com.PortArg.demo.Repository;

import com.PortArg.demo.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia,Long> {
    
}
