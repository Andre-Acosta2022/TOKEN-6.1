package com.example.syscaso.Dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.proveedores;
import com.example.syscaso.entity.tipoorden;



public interface TipoordenDao {
	tipoorden create (tipoorden  td);
	tipoorden update (tipoorden td);
void delete (Long id);
Optional<tipoorden>read(Long ID);
List<tipoorden>readAll();
}
