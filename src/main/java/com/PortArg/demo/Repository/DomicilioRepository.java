
package com.PortArg.demo.Repository;

import com.PortArg.demo.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio, Long>{
    
}
