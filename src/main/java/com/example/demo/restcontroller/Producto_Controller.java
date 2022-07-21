
package com.example.demo.restcontroller;

import com.example.demo.entity.Producto;
import com.example.demo.service.Producto_Service;
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
@RequestMapping("/producto")
public class Producto_Controller {
    @Autowired
    private Producto_Service productoService;
    
    
    @GetMapping
    public List<Producto> findAll(){
        return productoService.findAll();
    }
    @PostMapping
    public Producto add(@RequestBody Producto p){
        return productoService.add(p);
    }
    
    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id,@RequestBody Producto p){
        p.setId_producto(id);
        return productoService.update(p);
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
