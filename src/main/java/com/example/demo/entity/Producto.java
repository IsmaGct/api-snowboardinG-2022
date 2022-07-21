
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

@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data


@Entity(name ="Producto")

@Table(name ="producto")


public class Producto implements Serializable{
    
    private static final long serialVersion=1L;
    @Id
    @Column(name="Id_producto")
    private long id_producto;
    @Column(name="Nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name ="Id_detalleE", nullable = false)
    private Detalle_entrada id_detalleE;
    @ManyToOne
    @JoinColumn(name ="Id_detalleS", nullable = false)
    private Detalle_salida id_detalleS;
    
}
