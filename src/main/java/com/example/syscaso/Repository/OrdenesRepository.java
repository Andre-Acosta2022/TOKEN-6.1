package com.example.syscaso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.syscaso.entity.ordenes;
import com.example.syscaso.entity.proveedores;

public interface OrdenesRepository extends JpaRepository<ordenes, Long>{

}
