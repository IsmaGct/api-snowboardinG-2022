
package com.example.demo.service.impl;

import com.example.demo.entity.Detalle_salida;
import com.example.demo.repository.Detalle_salida_Repository;
import com.example.demo.service.Detalle_salida_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Detalle_salida_ServiceImpl implements Detalle_salida_Service{
    
    @Autowired
    private Detalle_salida_Repository detalleSalida;

    @Override
    public List<Detalle_salida> findAll() {
        return detalleSalida.findAll();
    }

    @Override
    public Detalle_salida add(Detalle_salida c) {
        return detalleSalida.save(c);
        
    }

    @Override
    public Detalle_salida update(Detalle_salida c) {
        Detalle_salida objdeDetalleSalida=detalleSalida.getById(c.getId_detalleS());
        BeanUtils.copyProperties(c, objdeDetalleSalida);
        return detalleSalida.save(objdeDetalleSalida);
    }

    @Override
    public Detalle_salida delete(Detalle_salida c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
