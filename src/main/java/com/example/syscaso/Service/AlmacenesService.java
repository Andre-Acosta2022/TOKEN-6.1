package com.example.syscaso.Service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.almacenes;

public interface AlmacenesService {
	almacenes create (almacenes al);
	almacenes update (almacenes al);
	void delete (Long id);
	Optional<almacenes>read(Long ID);
	List<almacenes>readAll();
}
