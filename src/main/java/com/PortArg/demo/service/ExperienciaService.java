
package com.PortArg.demo.service;
import com.PortArg.demo.Repository.ExperienciaRepository;
import com.PortArg.demo.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
   @Autowired
   private ExperienciaRepository expRepo;
   @Override
    public List <Experiencia> getExperiencia(){
        List <Experiencia> listaPersonas= expRepo.findAll();
        
        return listaPersonas;
    }
    
    @Override
    public void saveExperiencia (Experiencia exp){
        expRepo.save(exp);
    }
    
    @Override
    public void deleteExperiencia(Long id){
        expRepo.deleteById(id);
    }
    
    @Override
    public Experiencia findExperiencia(Long id){
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
}