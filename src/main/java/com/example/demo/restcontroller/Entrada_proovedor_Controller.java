
package com.example.demo.restcontroller;

import com.example.demo.entity.Entrada_proovedor;
import com.example.demo.service.Entrada_proovedor_Service;
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
@RequestMapping("/entradaproovedor")
public class Entrada_proovedor_Controller {
    @Autowired
    private Entrada_proovedor_Service destinoSalidaService;
    
    
    @GetMapping
    public List<Entrada_proovedor> findAll(){
        return destinoSalidaService.findAll();
    }
    @PostMapping
    public Entrada_proovedor add(@RequestBody Entrada_proovedor c){
        return destinoSalidaService.add(c);
    }
    
    @PutMapping("/{id}")
    public Entrada_proovedor update(@PathVariable Long id,@RequestBody Entrada_proovedor c){
        c.setId_entradap(id);
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
