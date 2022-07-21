
package com.example.demo.service;

import com.example.demo.entity.Detalle_salida;
import java.util.List;


public interface Detalle_salida_Service {
    
    List<Detalle_salida> findAll();
    
    Detalle_salida add(Detalle_salida c);
    
    Detalle_salida update(Detalle_salida c);
    
    Detalle_salida delete(Detalle_salida c);
    
}
