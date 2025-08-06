package com.example.syscaso.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Service.ProveedoresService;
import com.example.syscaso.entity.proveedores;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {
	@Autowired
	private ProovedoresDao dao;

	@Override
	public proveedores create(proveedores pro) {
		// TODO Auto-generated method stub
		return dao.create(pro);
	}

	@Override
	public proveedores update(proveedores pro) {
		// TODO Auto-generated method stub
		return dao.update(pro);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

    @Override
    public Optional<proveedores> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}
	@Override
	public List<proveedores> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
