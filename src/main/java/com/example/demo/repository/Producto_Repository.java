
package com.example.demo.repository;

import com.example.demo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Producto_Repository extends JpaRepository<Producto, Long>{
    
}
