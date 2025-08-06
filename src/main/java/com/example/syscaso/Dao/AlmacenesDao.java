package com.example.syscaso.Dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.almacenes;
import com.example.syscaso.entity.proveedores;



public interface AlmacenesDao {

almacenes create (almacenes al);
almacenes update (almacenes al);
void delete (Long id);
Optional<almacenes>read(Long ID);
List<almacenes>readAll();
}
