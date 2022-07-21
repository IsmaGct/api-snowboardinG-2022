
package com.example.demo.service.impl;

import com.example.demo.entity.Destino_salida;
import com.example.demo.repository.Destino_salida_Repository;
import com.example.demo.service.Destino_salida_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Destino_salida_ServiceImpl implements Destino_salida_Service {

    @Autowired
    private Destino_salida_Repository destinoSalida;
    
    @Override
    public List<Destino_salida> findAll() {
        return destinoSalida.findAll();
    }

    @Override
    public Destino_salida add(Destino_salida c) {
        return destinoSalida.save(c);
    }

    @Override
    public Destino_salida update(Destino_salida c) {
        Destino_salida objdeDestinoSalida=destinoSalida.getById(c.getId_destino());
        BeanUtils.copyProperties(c, objdeDestinoSalida);
        return destinoSalida.save(objdeDestinoSalida);
    }

    @Override
    public Destino_salida delete(Destino_salida c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 
    }
    
}
