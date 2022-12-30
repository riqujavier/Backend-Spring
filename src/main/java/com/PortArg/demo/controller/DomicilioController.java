
package com.PortArg.demo.controller;



import com.PortArg.demo.model.Domicilio;
import com.PortArg.demo.service.IDomicilioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public class DomicilioController {
    @Autowired
    private IDomicilioService interDomi;
    
    @GetMapping("/experiencia/traer")
    public List <Domicilio> getDomicilio(){
        return interDomi.getDomicilios();
    }
    @PostMapping ("/domicilio/crear")
    public String createDomicilio (@RequestBody Domicilio domi){
        interDomi.saveDomicilio(domi);
        
        return "La domicilio fue creada correctamente";
    }
    
    @DeleteMapping ("/domicilio/borrar/{id}")
    public String deleteDomicilio (@PathVariable Long id){
        interDomi.deleteDomicilio(id);
        return "La domicilio fue eliminada correctamente.";
    }
    
    @PutMapping("/domicilio/editar/{id}")
    public Domicilio editDomicilio (@PathVariable Long id,
                                @RequestParam ("pais") String nuevoPais,
                                @RequestParam ("ciudad") String nuevoCiudad,
                                @RequestParam ("domicilio") String nuevoDomi){
        
        Domicilio exp = interDomi.findDomicilio(id);
        
        exp.setPais(nuevoPais);
        exp.setCiudad(nuevoCiudad);
        exp.setDireccion(nuevoDomi);
        
       
        
        return exp;
    }
}
