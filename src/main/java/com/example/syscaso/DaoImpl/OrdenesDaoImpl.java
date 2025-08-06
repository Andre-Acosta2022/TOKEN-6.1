package com.example.syscaso.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.Dao.OrdenesDao;
import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Repository.OrdenesRepository;
import com.example.syscaso.Repository.ProveedoresRepository;
import com.example.syscaso.entity.ordenes;
import com.example.syscaso.entity.proveedores;

@Component
public class OrdenesDaoImpl   implements OrdenesDao{
 @Autowired
 private OrdenesRepository repository;

@Override
public ordenes create(ordenes or) {
	// TODO Auto-generated method stub
	return repository.save(or);
}

@Override
public ordenes update(ordenes or) {
	// TODO Auto-generated method stub
	return repository.save(or);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<ordenes> read(Long ID) {
	// TODO Auto-generated method stub
	return repository.findById(ID);
}

@Override
public List<ordenes> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}


}
