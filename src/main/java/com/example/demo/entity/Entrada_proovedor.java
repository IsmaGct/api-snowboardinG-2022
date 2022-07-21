
package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;


@Entity(name="EntradaProovedor")
@Table(name="entrada_proovedor")

@Builder
public class Entrada_proovedor implements Serializable{
    
    private static final long serialVersion=1L;
    
    @Id
    @Column(name="Id_entradaP")
    private long id_entradap;
    @Column(name="Descripcion")
    private String descripcion;

    public Entrada_proovedor() {
    }

    public Entrada_proovedor(long id_entradap, String descripcion) {
        this.id_entradap = id_entradap;
        this.descripcion = descripcion;
    }

    public long getId_entradap() {
        return id_entradap;
    }

    public void setId_entradap(long id_entradap) {
        this.id_entradap = id_entradap;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
    
    
}
