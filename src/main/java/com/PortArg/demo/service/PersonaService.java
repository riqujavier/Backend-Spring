
package com.PortArg.demo.service;

import com.PortArg.demo.Repository.PersonaRepository;
import com.PortArg.demo.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository persoRepo;
    
    @Override
    public List <Persona> getPersonas(){
        List <Persona> listaPersonas= persoRepo.findAll();
        
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona perso){
        persoRepo.save(perso);
    }
    
    @Override
    public void deletePersona(Long id){
        persoRepo.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id){
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
}