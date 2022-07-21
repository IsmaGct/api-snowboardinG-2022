
package com.example.demo.service;

import com.example.demo.entity.Detalle_entrada;
import java.util.List;


public interface Detalle_entrada_Service {
    
    List<Detalle_entrada> findAll();
    
    Detalle_entrada add(Detalle_entrada c);
    
    Detalle_entrada update(Detalle_entrada c);
    
    Detalle_entrada delete(Detalle_entrada c);
    
}
