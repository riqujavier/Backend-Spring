
package com.PortArg.demo.service;

import com.PortArg.demo.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
     public List <Tecnologia> getTecnologias();
    
    public void saveTecnologia (Tecnologia perso);
    
    public void deleteTecnologia (Long id);
    
    public Tecnologia findTecnologia (Long id);
    
}

