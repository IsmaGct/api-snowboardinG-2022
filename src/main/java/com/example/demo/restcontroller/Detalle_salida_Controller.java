
package com.example.demo.restcontroller;

import com.example.demo.entity.Detalle_salida;
import com.example.demo.service.Detalle_salida_Service;
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
@RequestMapping("/detallesalida")
public class Detalle_salida_Controller {
    
    @Autowired
    private Detalle_salida_Service detalleSalidaService;
    
    
    @GetMapping
    public List<Detalle_salida> findAll(){
        return detalleSalidaService.findAll();
    }
    @PostMapping
    public Detalle_salida add(@RequestBody Detalle_salida c){
        return detalleSalidaService.add(c);
    }
    
    @PutMapping("/{id}")
    public Detalle_salida update(@PathVariable Long id,@RequestBody Detalle_salida c){
        c.setId_detalleS(id);
        return detalleSalidaService.update(c);
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
