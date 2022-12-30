
package com.PortArg.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String empresa;
    private Date fecha_de_ingreso;
    private Date fecha_de_finalizacion;
    private String localizacion;
    private String puesto;
    private String tipo_de_jornada;
    
}
