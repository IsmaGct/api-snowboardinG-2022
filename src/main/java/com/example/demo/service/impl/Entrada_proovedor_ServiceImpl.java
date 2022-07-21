
package com.example.demo.service.impl;

import com.example.demo.entity.Entrada_proovedor;
import com.example.demo.repository.Entrada_proovedor_Repository;
import com.example.demo.service.Entrada_proovedor_Service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Entrada_proovedor_ServiceImpl implements Entrada_proovedor_Service{

    @Autowired
    private Entrada_proovedor_Repository entradaProovedor;
    
    @Override
    public List<Entrada_proovedor> findAll() {
        return entradaProovedor.findAll();
    }

    @Override
    public Entrada_proovedor add(Entrada_proovedor c) {
        return entradaProovedor.save(c);
    }

    @Override
    public Entrada_proovedor update(Entrada_proovedor c) {
        Entrada_proovedor objdeEntradaProovedor = entradaProovedor.getById(c.getId_entradap());
        BeanUtils.copyProperties(c, objdeEntradaProovedor);
        return entradaProovedor.save(objdeEntradaProovedor);
    }

    @Override
    public Entrada_proovedor delete(Entrada_proovedor c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
