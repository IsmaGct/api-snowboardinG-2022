
package com.example.demo.service;

import com.example.demo.entity.Salida_producto;
import java.util.List;


public interface Salida_producto_Service {
    
    List<Salida_producto> findAll();
    
    Salida_producto add(Salida_producto p);
    
    Salida_producto update(Salida_producto p);
    
    Salida_producto delete(Salida_producto p);
    
}
