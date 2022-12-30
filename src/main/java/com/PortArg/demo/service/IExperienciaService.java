
package com.PortArg.demo.service;

import com.PortArg.demo.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List <Experiencia> getExperiencia();
    
    public void saveExperiencia (Experiencia exp);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia findExperiencia (Long id);
}

