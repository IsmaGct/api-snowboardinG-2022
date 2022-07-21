
package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;


@Entity(name="DetalleSalida")
@Table(name="detalle_salida")
@Builder


public class Detalle_salida implements Serializable{
    
    private static final long serialVersion=1L;
    
    @Id
    @Column(name="Id_detalleS")
    private long id_detalleS;
    @Column(name="Tipo")
    private String tipo;
    @Column(name="Proceso")
    private String proceso;
    @Column(name="Quimico")
    private String quimico;
    @Column(name="Cantidad")
    private String cantidad;

    public Detalle_salida() {
    }

    public Detalle_salida(long id_detalleS, String tipo, String proceso, String quimico, String cantidad) {
        this.id_detalleS = id_detalleS;
        this.tipo = tipo;
        this.proceso = proceso;
        this.quimico = quimico;
        this.cantidad = cantidad;
    }

    public long getId_detalleS() {
        return id_detalleS;
    }

    public void setId_detalleS(long id_detalleS) {
        this.id_detalleS = id_detalleS;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getQuimico() {
        return quimico;
    }

    public void setQuimico(String quimico) {
        this.quimico = quimico;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
}
