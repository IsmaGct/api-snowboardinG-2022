
package com.example.demo.service.impl;

import com.example.demo.entity.Producto;
import com.example.demo.repository.Producto_Repository;
import com.example.demo.service.Producto_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producto_ServiceImpl implements Producto_Service{

    
    @Autowired
    private Producto_Repository producto;
    
    @Override
    public List<Producto> findAll() {
        return producto.findAll();
    }

    @Override
    public Producto add(Producto p) {
        return producto.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objdeProducto= producto.getById(p.getId_producto());
        BeanUtils.copyProperties(p, objdeProducto);
        return producto.save(objdeProducto);
    }

    @Override
    public Producto delete(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
