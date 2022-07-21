
package com.example.demo.restcontroller;


import com.example.demo.entity.Detalle_entrada;
import com.example.demo.service.Detalle_entrada_Service;
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
@RequestMapping("/detalleentrada")
public class Detalle_entrada_Controller {
    
    @Autowired
    private Detalle_entrada_Service detalleEntradaService;
    
    @GetMapping
    public List<Detalle_entrada> findAll(){
        return detalleEntradaService.findAll();
    }
    @PostMapping
    public Detalle_entrada add(@RequestBody Detalle_entrada c){
        return detalleEntradaService.add(c);
    }
    
    @PutMapping("/{id}")
    public Detalle_entrada update(@PathVariable Long id,@RequestBody Detalle_entrada c){
        c.setId_detalleE(id);
        return detalleEntradaService.update(c);
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
