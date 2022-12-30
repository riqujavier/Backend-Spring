
package com.PortArg.demo.service;

import com.PortArg.demo.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List <Educacion> getEducacion();
    
    public void saveEducacion (Educacion edu);
    
    public void deleteEducacion (Long id);
    
    public Educacion findEducacion (Long id);
}

