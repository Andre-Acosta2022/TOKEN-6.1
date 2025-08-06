package com.example.syscaso.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.Dao.FormapagoDao;
import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Repository.FormapagoRepository;
import com.example.syscaso.Repository.ProveedoresRepository;
import com.example.syscaso.entity.formapago;
import com.example.syscaso.entity.proveedores;

@Component
public class formapagoDaoImpl   implements FormapagoDao{
 @Autowired
 private FormapagoRepository repository;

@Override
public formapago create(formapago fp) {
	// TODO Auto-generated method stub
	return repository.save (fp);
}

@Override
public formapago update(formapago fp) {
	// TODO Auto-generated method stub
	return repository.save (fp);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<formapago> read(Long ID) {
	// TODO Auto-generated method stub
	return repository.findById(ID);
}

@Override
public List<formapago> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}

}
