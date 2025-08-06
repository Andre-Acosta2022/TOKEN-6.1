package com.example.syscaso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.syscaso.entity.almacenes;
import com.example.syscaso.entity.proveedores;

public interface AlmacenesRepository extends JpaRepository< almacenes, Long>{

}
