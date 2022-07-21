
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

@Entity(name ="DetalleEntrada")

@Table(name ="detalle_entrada")

public class Detalle_entrada implements Serializable{
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "Id_detalleE")
    private long id_detalleE;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Tipo")
    private String tipo;
    @Column(name = "Quimico")
    private String quimico;
    @Column(name = "Cantidad")
    private String cantidad;
    @ManyToOne
    @JoinColumn(name ="Id_entrada", nullable = false)
    private Entrada_producto id_entrada;
    
    
}
