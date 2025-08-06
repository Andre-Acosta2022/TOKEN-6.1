package com.example.syscaso.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.example.syscaso.Dao.OrdenesDao;
import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Service.OrdenesService;
import com.example.syscaso.Service.ProveedoresService;
import com.example.syscaso.entity.ordenes;
import com.example.syscaso.entity.proveedores;

@Service
public class ordenesServiceImpl implements OrdenesService {
	@Autowired
	private OrdenesDao dao;

	@Override
	public ordenes create(ordenes or) {
		// TODO Auto-generated method stub
		return dao.create(or);
	}

	@Override
	public ordenes update(ordenes or) {
		// TODO Auto-generated method stub
		return dao.update(or);
				
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<ordenes> read(Long ID) {
		// TODO Auto-generated method stub
		return dao.read(ID);
	}

	@Override
	public List<ordenes> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
}
