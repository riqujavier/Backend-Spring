
package com.PortArg.demo.service;

import com.PortArg.demo.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List <Persona> getPersonas();
    
    public void savePersona (Persona perso);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
}