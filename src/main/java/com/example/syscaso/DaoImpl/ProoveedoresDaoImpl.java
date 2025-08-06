package com.example.syscaso.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Repository.ProveedoresRepository;
import com.example.syscaso.entity.proveedores;

@Component
public class ProoveedoresDaoImpl   implements ProovedoresDao{
 @Autowired
 private ProveedoresRepository repository;

@Override
public proveedores create(proveedores pro) {
	// TODO Auto-generated method stub
	return repository.save(pro);
}

@Override
public proveedores update(proveedores pro) {
	// TODO Auto-generated method stub
	return repository.save(pro);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<proveedores> read(Long id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}

@Override
public List<proveedores> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}
}
