
package com.PortArg.demo.Repository;

import com.PortArg.demo.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia,Long> {
    
}
