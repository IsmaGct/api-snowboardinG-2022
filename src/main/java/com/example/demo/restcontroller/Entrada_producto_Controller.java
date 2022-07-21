
package com.example.demo.restcontroller;


import com.example.demo.entity.Entrada_producto;
import com.example.demo.service.Entrada_producto_Service;
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
@RequestMapping("/entradaproducto")

public class Entrada_producto_Controller {
    
    @Autowired
    private Entrada_producto_Service entradaProductoService;
    
    
    @GetMapping
    public List<Entrada_producto> findAll(){
        return entradaProductoService.findAll();
    }
    @PostMapping
    public Entrada_producto add(@RequestBody Entrada_producto c){
        return entradaProductoService.add(c);
    }
    
    @PutMapping("/{id}")
    public Entrada_producto update(@PathVariable Long id,@RequestBody Entrada_producto c){
        c.setId_entrada(id);
        return entradaProductoService.update(c);
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
