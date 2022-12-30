
package com.PortArg.demo.controller;

import com.PortArg.demo.model.Persona;
import com.PortArg.demo.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService interPerso;
    
    @GetMapping("/personas/traer")
    public List <Persona> getPersonas(){
        return interPerso.getPersonas();
    }
    @PostMapping ("/personas/crear")
    public String createPerson (@RequestBody Persona perso){
        interPerso.savePersona(perso);
        
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPerso.deletePersona(id);
        return "La persona fue eliminada correctamente.";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("correo") String nuevoCorreo,
                                @RequestParam ("profesion") String nuevoProfesion){
        
        Persona perso = interPerso.findPersona(id);
        
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setCorreo(nuevoCorreo);
        perso.setProfesion(nuevoProfesion);
       
        
        return perso;
    }
}