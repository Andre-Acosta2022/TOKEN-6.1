package com.example.syscaso.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.Dao.AlmacenesDao;
import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Service.AlmacenesService;
import com.example.syscaso.Service.ProveedoresService;
import com.example.syscaso.entity.almacenes;
import com.example.syscaso.entity.proveedores;

@Service
public class AlmacenesServiceImpl implements AlmacenesService {
	@Autowired
	private AlmacenesDao dao;

	@Override
	public almacenes create(almacenes al) {
		// TODO Auto-generated method stub
	return dao.create(al);
	}

	@Override
	public almacenes update(almacenes al) {
		// TODO Auto-generated method stub
		return dao.update(al);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<almacenes> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<almacenes> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}

