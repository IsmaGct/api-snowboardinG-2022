
package com.example.demo.restcontroller;

import com.example.demo.entity.Salida_producto;
import com.example.demo.service.Salida_producto_Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salidaproducto")
public class Salida_producto_Controller {
    
    @Autowired
    private Salida_producto_Service salidaProductoService;
    
    
    @GetMapping
    public List<Salida_producto> findAll(){
        return salidaProductoService.findAll();
    }
    @PostMapping
    public Salida_producto add(@RequestBody Salida_producto p){
        return salidaProductoService.add(p);
    }
    
    @PutMapping("/{id}")
    public Salida_producto update(@PathVariable Long id,@RequestBody Salida_producto p){
        p.setId_salida(id);
        return salidaProductoService.update(p);
    }
    /* 
    @DeleteMapping("/{id}")
    public Destino_salida delete(@PathVariable Long id){
        Destino_salida objdesSalida=new Destino_salida();
        objdesSalida.setId_destino(id);
        return destinoSalidaService.delete(objdesSalida);
    } 
*/
    
}
