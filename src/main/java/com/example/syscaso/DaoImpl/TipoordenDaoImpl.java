package com.example.syscaso.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Dao.TipoordenDao;
import com.example.syscaso.Repository.ProveedoresRepository;
import com.example.syscaso.Repository.TipoOrdenRepository;
import com.example.syscaso.entity.proveedores;
import com.example.syscaso.entity.tipoorden;

@Component
public class TipoordenDaoImpl   implements TipoordenDao{
 @Autowired
 private TipoOrdenRepository repository;

@Override
public tipoorden create(tipoorden td) {
	// TODO Auto-generated method stub
	return repository.save(td);
}

@Override
public tipoorden update(tipoorden td) {
	// TODO Auto-generated method stub
	return repository.save(td);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	
	repository.deleteById(id);
}

@Override
public Optional<tipoorden> read(Long ID) {
	// TODO Auto-generated method stub
	return repository.findById(ID);
}

@Override
public List<tipoorden> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}


}
