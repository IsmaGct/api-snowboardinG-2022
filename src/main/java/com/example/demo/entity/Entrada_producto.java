
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

@Entity(name ="EntradaProducto")

@Table(name ="entrada_producto")


public class Entrada_producto implements Serializable {
    
    private static final long serialVersion=1L;
    
    @Id
    @Column(name="Id_entrada")
    private long id_entrada;
    @Column(name="Descripcion")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name ="Id_entradaP", nullable = false)
    private Entrada_proovedor id_entradap;
    
    
    
}
