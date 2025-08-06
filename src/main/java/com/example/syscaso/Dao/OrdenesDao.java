package com.example.syscaso.Dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.ordenes;
import com.example.syscaso.entity.proveedores;



public interface OrdenesDao {

ordenes create (ordenes or);
ordenes update (ordenes or);
void delete (Long id);
Optional<ordenes>read(Long ID);
List<ordenes>readAll();
}
