package com.example.syscaso.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.syscaso.Service.ProveedoresService;
import com.example.syscaso.entity.proveedores;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Proveedores")
public class ProovedoresController {

	@Autowired
	private ProveedoresService service;
	
	@GetMapping
	public ResponseEntity<List<proveedores>> readAll(){
		try {
			List<proveedores> lista = service.readAll();
			if(lista.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
@PostMapping
public ResponseEntity<proveedores> crear(@Valid @RequestBody proveedores pro ){
	try {
		proveedores p = service.create(pro);
		return new ResponseEntity<>(p, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}


@GetMapping("/{id}")
public ResponseEntity<proveedores> getAccesoId(@PathVariable("id") Long id){
	try {
		proveedores s = service.read(id).get();
		return new ResponseEntity<>(s, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
@DeleteMapping("/{id}")
public ResponseEntity<proveedores> delAcceso(@PathVariable("id") Long id){
	try {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}

}

