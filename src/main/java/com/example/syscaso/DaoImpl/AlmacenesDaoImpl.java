package com.example.syscaso.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.Dao.AlmacenesDao;
import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Repository.AlmacenesRepository;
import com.example.syscaso.Repository.ProveedoresRepository;
import com.example.syscaso.entity.almacenes;
import com.example.syscaso.entity.proveedores;

@Component
public class AlmacenesDaoImpl   implements AlmacenesDao{
 @Autowired
 private AlmacenesRepository repository;

@Override
public almacenes create(almacenes al) {
	// TODO Auto-generated method stub
	return repository.save(al);
}

@Override
public almacenes update(almacenes al) {
	// TODO Auto-generated method stub
	return repository.save(al);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<almacenes> read(Long ID) {
	// TODO Auto-generated method stub
	return repository.findById(ID);
}

@Override
public List<almacenes> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}

}
