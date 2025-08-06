package com.example.syscaso.Service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.formapago;

public interface FormapagoService {
	formapago create(formapago fp);

	formapago update(formapago fp);

	void delete(Long id);

	Optional<formapago> read(Long ID);

	List<formapago> readAll();
}
