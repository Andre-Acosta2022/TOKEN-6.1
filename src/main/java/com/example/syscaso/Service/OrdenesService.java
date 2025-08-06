package com.example.syscaso.Service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.ordenes;

public interface OrdenesService {
	ordenes create (ordenes or);
	ordenes update (ordenes or);
	void delete (Long id);
	Optional<ordenes>read(Long ID);
	List<ordenes>readAll();
}
