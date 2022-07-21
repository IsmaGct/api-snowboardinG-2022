
package com.example.demo.service;

import com.example.demo.entity.Entrada_producto;
import java.util.List;


public interface Entrada_producto_Service {
    
    
    List<Entrada_producto> findAll();
    
    Entrada_producto add(Entrada_producto c);
    
    Entrada_producto update(Entrada_producto c);
    
    Entrada_producto delete(Entrada_producto c);
}
