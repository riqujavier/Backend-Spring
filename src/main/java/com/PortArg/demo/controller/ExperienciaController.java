
package com.PortArg.demo.controller;

import com.PortArg.demo.model.Experiencia;
import com.PortArg.demo.service.IExperienciaService;
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


public class ExperienciaController {
    @Autowired
    private IExperienciaService interExp;
    
    @GetMapping("/experiencia/traer")
    public List <Experiencia> getExperiencia(){
        return interExp.getExperiencia();
    }
    @PostMapping ("/experiencia/crear")
    public String createExperiencia (@RequestBody Experiencia perso){
        interExp.saveExperiencia(perso);
        
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        interExp.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente.";
    }
    
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia (@PathVariable Long id,
                                @RequestParam ("empresa") String nuevoEmpresa,
                                @RequestParam ("fecha_de_ingreso") Date nuevoIngreso,
                                @RequestParam ("fecha_de_finalizacion") Date nuevoEgreso,
                                @RequestParam ("localizacion") String nuevoLocali,
                                @RequestParam ("puesto") String nuevoPuesto,
                                @RequestParam ("tipo_de_jornada") String nuevoJornada){
        
        Experiencia exp = interExp.findExperiencia(id);
        
        exp.setEmpresa(nuevoEmpresa);
        exp.setFecha_de_ingreso(nuevoIngreso);
        exp.setFecha_de_finalizacion(nuevoEgreso);
        exp.setLocalizacion(nuevoLocali);
        exp.setPuesto(nuevoPuesto);
        exp.setTipo_de_jornada(nuevoJornada);
       
        
        return exp;
    }
}
