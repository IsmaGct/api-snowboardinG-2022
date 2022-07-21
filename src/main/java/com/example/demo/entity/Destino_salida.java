
package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //Contruccion
@NoArgsConstructor //metodo constructor sin parametros
@AllArgsConstructor //metodo constructor con parametros
@Data

@Entity(name="DestinoSalida")
@Table(name="destino_salida")


public class Destino_salida implements Serializable{
    
    private static final long serialVersion=1L;
    
    @Id
    @Column(name="Id_destino")
    private long id_destino;
    @Column(name="Descripcion")
    private String descripcion;
    @Column(name="Areas")
    private String area;
    @ManyToOne
    @JoinColumn(name ="Id_salida", nullable = false)
    private Salida_producto id_salida;
    
    
    
    
}
