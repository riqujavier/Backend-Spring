
package com.PortArg.demo.controller;

import com.PortArg.demo.model.Tecnologia;
import com.PortArg.demo.service.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public class TecnologiaController {
    @Autowired
    private ITecnologiaService interTecno;
    
    @GetMapping("/tecnologia/traer")
    public List <Tecnologia> getTecnologia(){
        return interTecno.getTecnologias();
    }
    @PostMapping ("/tecnologia/crear")
    public String createTecnologia (@RequestBody Tecnologia tecno){
        interTecno.saveTecnologia(tecno);
        
        return "La tecnologia fue creada correctamente";
    }
    
    @DeleteMapping ("/tecnologia/borrar/{id}")
    public String deleteTecnologia (@PathVariable Long id){
        interTecno.deleteTecnologia(id);
        return "La tecnologia fue eliminada correctamente.";
    }
    
    @PutMapping("/tecnologia/editar/{id}")
    public Tecnologia editTecnologia (@PathVariable Long id,
                                @RequestParam ("habilidad") String nuevoSkill,
                                @RequestParam ("porcentaje") Float nuevoPorcent){
        
        Tecnologia tecno = interTecno.findTecnologia(id);
        
        tecno.setHabilidad(nuevoSkill);
        tecno.setPorcentaje(nuevoPorcent);
       
        
        return tecno;
    }
}

