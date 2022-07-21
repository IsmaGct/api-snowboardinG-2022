
package com.example.demo.service.impl;

import com.example.demo.entity.Detalle_entrada;
import com.example.demo.repository.Detalle_entrada_Repository;
import com.example.demo.service.Detalle_entrada_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Detalle_entrada_ServiceImpl implements Detalle_entrada_Service{
    
    @Autowired
    private Detalle_entrada_Repository detalleEntrada;

    @Override
    public List<Detalle_entrada> findAll() {
        return detalleEntrada.findAll();
    }

    @Override
    public Detalle_entrada add(Detalle_entrada c) {
        return detalleEntrada.save(c);
    }

    @Override
    public Detalle_entrada update(Detalle_entrada c) {
        Detalle_entrada objdeDetalleEntrada=detalleEntrada.getById(c.getId_detalleE());
        BeanUtils.copyProperties(c, objdeDetalleEntrada);
        return detalleEntrada.save(objdeDetalleEntrada);
    }   

    @Override
    public Detalle_entrada delete(Detalle_entrada c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
