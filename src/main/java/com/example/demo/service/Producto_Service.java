
package com.example.demo.service;

import com.example.demo.entity.Producto;
import java.util.List;


public interface Producto_Service {
    
    List<Producto> findAll();
    
    Producto add(Producto p);
    
    Producto update(Producto p);
    
    Producto delete(Producto p);
    
}
