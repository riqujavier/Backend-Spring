/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PortArg.demo.service;

import com.PortArg.demo.model.Domicilio;
import java.util.List;


public interface IDomicilioService {
    public List <Domicilio> getDomicilios();
    
    public void saveDomicilio (Domicilio perso);
    
    public void deleteDomicilio (Long id);
    
    public Domicilio findDomicilio (Long id);
}
