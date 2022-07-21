
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

@Entity(name ="SalidaProducto")

@Table(name ="salida_producto")

public class Salida_producto implements Serializable{

    private static final long serialVersion=1L;
    @Id
    @Column(name = "Id_salida")
    private long id_salida;
    @Column(name = "Descripcion")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name ="Id_detalleS", nullable = false)
    private Detalle_salida id_detalleS;
    
    
}
