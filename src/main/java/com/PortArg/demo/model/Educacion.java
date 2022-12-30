
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
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String instituto;
    private String carrera;
    private Date ano_de_inicio;
    private Date ano_de_finalizacion;
}
