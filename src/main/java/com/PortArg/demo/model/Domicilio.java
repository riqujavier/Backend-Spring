
package com.PortArg.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String  pais;
    private String ciudad;
    private String direccion;
    
    @OneToMany(cascade= CascadeType.ALL)
     @JoinColumn(name="id_domicilio")
     private List <Persona> personas;
}
