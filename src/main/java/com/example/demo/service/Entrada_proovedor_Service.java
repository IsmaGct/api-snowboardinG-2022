
package com.example.demo.service;

import com.example.demo.entity.Entrada_proovedor;
import java.util.List;


public interface Entrada_proovedor_Service {
    
    List<Entrada_proovedor> findAll();
    
    Entrada_proovedor add(Entrada_proovedor c);
    
    Entrada_proovedor update(Entrada_proovedor c);
    
    Entrada_proovedor delete(Entrada_proovedor c);
    
    
}
