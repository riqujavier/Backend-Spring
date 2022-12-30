
package com.PortArg.demo.controller;

import com.PortArg.demo.model.Educacion;
import com.PortArg.demo.service.IEducacionService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public class EducacionController {
  @Autowired
    private IEducacionService interEdu;
    
    @GetMapping("/experiencia/traer")
    public List <Educacion> getEducacion(){
        return interEdu.getEducacion();
    }
    @PostMapping ("/domicilio/crear")
    public String createEducacion (@RequestBody Educacion domi){
        interEdu.saveEducacion(domi);
        
        return "La domicilio fue creada correctamente";
    }
    
    @DeleteMapping ("/domicilio/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id){
        interEdu.deleteEducacion(id);
        return "La domicilio fue eliminada correctamente.";
    }
    
    @PutMapping("/domicilio/editar/{id}")
    public Educacion editEducacion (@PathVariable Long id,
                                @RequestParam ("instituto") String nuevoInsti,
                                @RequestParam ("carrera") String nuevoCarrera,
                                @RequestParam ("ano_de_inicio") Date nuevoInicio,
                                @RequestParam ("ano_de_finalizacion") Date nuevoFin){
        
        Educacion edu = interEdu.findEducacion(id);
        
        edu.setInstituto(nuevoInsti);
        edu.setCarrera(nuevoCarrera);
        edu.setAno_de_inicio(nuevoInicio);
        edu.setAno_de_finalizacion(nuevoFin);
       
        
        return edu;
    }  
}
