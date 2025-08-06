package com.example.syscaso.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.Dao.FormapagoDao;
import com.example.syscaso.Dao.ProovedoresDao;
import com.example.syscaso.Service.FormapagoService;
import com.example.syscaso.Service.ProveedoresService;
import com.example.syscaso.entity.formapago;
import com.example.syscaso.entity.proveedores;

@Service
public class FormaPagoImpl2  implements FormapagoService {
	@Autowired
	private FormapagoDao dao;

	@Override
	public formapago create(formapago fp) {
		// TODO Auto-generated method stub
		return dao.create(fp);
	}

	@Override
	public formapago update(formapago fp) {
		// TODO Auto-generated method stub
		return dao.update(fp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<formapago> read(Long ID) {
		// TODO Auto-generated method stub
		return dao.read(ID);
	}

	@Override
	public List<formapago> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	
}
