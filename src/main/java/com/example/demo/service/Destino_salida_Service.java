
package com.example.demo.service;

import com.example.demo.entity.Destino_salida;
import java.util.List;


public interface Destino_salida_Service {
    
    List<Destino_salida> findAll();
    
    Destino_salida add(Destino_salida c);
    
    Destino_salida update(Destino_salida c);
    
    Destino_salida delete(Destino_salida c);
    
}
