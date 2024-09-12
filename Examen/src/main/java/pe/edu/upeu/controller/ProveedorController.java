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
import pe.edu.upeu.entity.Proveedor;
import pe.edu.upeu.service.ProveedorService;

@RestController
@RequestMapping("/proveedores")

public class ProveedorController {
	@Autowired
	private ProveedorService proveedorService;
	@GetMapping
	public ResponseEntity<List<Proveedor>> readAll() {
		try {
			List<Proveedor> proveedors = proveedorService.readAll();
			if (proveedors.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(proveedors, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@PostMapping
	public ResponseEntity<Proveedor> crear(@Valid @RequestBody Proveedor cat){
		try {
			Proveedor c = proveedorService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Proveedor> getProveedorId(@PathVariable("id") Long id){
		try {
			Proveedor c = proveedorService.read(id);
			return new ResponseEntity<>(c, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Proveedor> delProveedor(@PathVariable("id") Long id) {

		try {
			proveedorService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProveedor(@PathVariable("id") Long id, @Valid @RequestBody Proveedor cat) {

		   Proveedor c =  proveedorService.read(id);
		    if(c.getId()>0) {
                return new ResponseEntity<>(proveedorService.update(cat), HttpStatus.OK);		    	
		    }else {
		    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
	}
}
