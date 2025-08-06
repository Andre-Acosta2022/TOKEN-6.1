package com.example.syscaso.Service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.proveedores;

public interface ProveedoresService {
	proveedores create (proveedores pro);
	proveedores update (proveedores pro);
	void delete (Long id);
	Optional<proveedores>read(Long id);
	List<proveedores>readAll();
}
