
package com.example.demo.service.impl;

import com.example.demo.entity.Salida_producto;
import com.example.demo.repository.Salida_producto_Repository;
import com.example.demo.service.Salida_producto_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Salida_producto_ServiceImpl implements Salida_producto_Service{

    @Autowired
    private Salida_producto_Repository salidaProducto;
    
    @Override
    public List<Salida_producto> findAll() {
        return salidaProducto.findAll();
    }

    @Override
    public Salida_producto add(Salida_producto p) {
        return salidaProducto.save(p);
    }

    @Override
    public Salida_producto update(Salida_producto p) {
        Salida_producto objdeSalidaProducto=salidaProducto.getById(p.getId_salida());
        BeanUtils.copyProperties(p, objdeSalidaProducto);
        return salidaProducto.save(objdeSalidaProducto);
    }

    @Override
    public Salida_producto delete(Salida_producto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
