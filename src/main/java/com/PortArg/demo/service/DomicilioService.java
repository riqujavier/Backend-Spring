/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PortArg.demo.service;


import com.PortArg.demo.Repository.DomicilioRepository;
import com.PortArg.demo.model.Domicilio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements IDomicilioService {
    @Autowired
    private DomicilioRepository domiRepo;
    
    @Override
    public List <Domicilio> getDomicilios(){
        List <Domicilio> listaPersonas= domiRepo.findAll();
        
        return listaPersonas;
    }
    
    @Override
    public void saveDomicilio(Domicilio perso){
        domiRepo.save(perso);
    }
    
    @Override
    public void deleteDomicilio(Long id){
        domiRepo.deleteById(id);
    }
    
    @Override
    public Domicilio findDomicilio(Long id){
        Domicilio perso = domiRepo.findById(id).orElse(null);
        return perso;
    }
    
}
