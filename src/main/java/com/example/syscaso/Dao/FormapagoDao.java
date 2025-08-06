package com.example.syscaso.Dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.formapago;

public interface FormapagoDao {

	formapago create(formapago fp);

	formapago update(formapago fp);

	void delete(Long id);

	Optional<formapago> read(Long ID);

	List<formapago> readAll();
}
