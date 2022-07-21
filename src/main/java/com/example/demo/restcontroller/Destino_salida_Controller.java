
package com.example.demo.restcontroller;

import com.example.demo.entity.Destino_salida;
import com.example.demo.service.Destino_salida_Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destinosalida")
public class Destino_salida_Controller {
    
    @Autowired
    private Destino_salida_Service destinoSalidaService;
    
    
    @GetMapping
    public List<Destino_salida> findAll(){
        return destinoSalidaService.findAll();
    }
    @PostMapping
    public Destino_salida add(@RequestBody Destino_salida c){
        return destinoSalidaService.add(c);
    }
    
    @PutMapping("/{id}")
    public Destino_salida update(@PathVariable Long id,@RequestBody Destino_salida c){
        c.setId_destino(id);
        return destinoSalidaService.update(c);
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
