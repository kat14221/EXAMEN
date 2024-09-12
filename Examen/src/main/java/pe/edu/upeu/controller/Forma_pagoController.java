package pe.edu.upeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.entity.Forma_pago;
import pe.edu.upeu.service.Forma_pagoService;

@RestController
@RequestMapping("/forma_pago")

public class Forma_pagoController {
	@Autowired
	private Forma_pagoService forma_pagoService;
	@GetMapping
	public ResponseEntity<List<Forma_pago>> readAll() {
		try {
			List<Forma_pago> forma_pagos = forma_pagoService.readAll();
			if (forma_pagos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(forma_pagos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@PostMapping
	public ResponseEntity<Forma_pago> crear(@Valid @RequestBody Forma_pago cat){
		try {
			Forma_pago c = forma_pagoService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Forma_pago> getForma_pagoId(@PathVariable("id") Long id){
		try {
			Forma_pago c = forma_pagoService.read(id);
			return new ResponseEntity<>(c, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Forma_pago> delForma_pago(@PathVariable("id") Long id) {

		try {
			forma_pagoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateForma_pago(@PathVariable("id") Long id, @Valid @RequestBody Forma_pago cat) {

		   Forma_pago c =  forma_pagoService.read(id);
		    if(c.getId()>0) {
                return new ResponseEntity<>(forma_pagoService.update(cat), HttpStatus.OK);		    	
		    }else {
		    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
	}
}
