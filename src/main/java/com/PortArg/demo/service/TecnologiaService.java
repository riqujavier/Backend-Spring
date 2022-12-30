
package com.PortArg.demo.service;

import com.PortArg.demo.Repository.TecnologiaRepository;
import com.PortArg.demo.model.Tecnologia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {
     @Autowired
    private TecnologiaRepository tecnoRepo;
     
     @Override
    public List <Tecnologia> getTecnologias(){
        List <Tecnologia> listaTecnologia= tecnoRepo.findAll();
        
        return listaTecnologia;
    }
    
    @Override
    public void saveTecnologia(Tecnologia tecno){
        tecnoRepo.save(tecno);
    }
    
    @Override
    public void deleteTecnologia(Long id){
        tecnoRepo.deleteById(id);
    }
    
    @Override
    public Tecnologia findTecnologia(Long id){
        Tecnologia perso = tecnoRepo.findById(id).orElse(null);
        return perso;
    }
}