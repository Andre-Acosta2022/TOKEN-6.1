package com.example.syscaso.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Dao.TipoordenDao;
import com.example.syscaso.Service.ProveedoresService;
import com.example.syscaso.Service.tipoordenService;
import com.example.syscaso.entity.proveedores;
import com.example.syscaso.entity.tipoorden;

import jakarta.persistence.Id;

@Service
public class TipoordenImpl implements tipoordenService {
	@Autowired
	private TipoordenDao dao;

	@Override
	public tipoorden create(tipoorden td) {
		// TODO Auto-generated method stub
		return dao.create(td);
	}

	@Override
	public tipoorden update(tipoorden td) {
		// TODO Auto-generated method stub
		return dao.update(td);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<tipoorden> read(Long ID) {
		// TODO Auto-generated method stub
		return dao.read(ID);
	}

	@Override
	public List<tipoorden> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	
}
