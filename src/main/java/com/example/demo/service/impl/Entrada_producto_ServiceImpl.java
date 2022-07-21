
package com.example.demo.service.impl;

import com.example.demo.entity.Entrada_producto;
import com.example.demo.repository.Entrada_producto_Repository;
import com.example.demo.service.Entrada_producto_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Entrada_producto_ServiceImpl implements Entrada_producto_Service {
    
    
    @Autowired
    private Entrada_producto_Repository entradaProducto;

    @Override
    public List<Entrada_producto> findAll() {
        return entradaProducto.findAll();
    }

    @Override
    public Entrada_producto add(Entrada_producto c) {
        return entradaProducto.save(c);
    }

    @Override
    public Entrada_producto update(Entrada_producto c) {
        Entrada_producto objdeEntradaProducto=entradaProducto.getById(c.getId_entrada());
        BeanUtils.copyProperties(c, objdeEntradaProducto);
        return entradaProducto.save(objdeEntradaProducto);
    }

    @Override
    public Entrada_producto delete(Entrada_producto c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
