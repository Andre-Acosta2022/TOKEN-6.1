package com.example.syscaso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.syscaso.entity.proveedores;
import com.example.syscaso.entity.tipoorden;

public interface TipoOrdenRepository extends JpaRepository<tipoorden, Long>{

}
