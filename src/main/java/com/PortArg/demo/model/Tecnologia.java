
package com.PortArg.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String habilidad;
    private Float porcentaje;
}

