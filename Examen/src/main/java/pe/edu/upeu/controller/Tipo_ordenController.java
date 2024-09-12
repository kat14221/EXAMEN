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
import pe.edu.upeu.entity.Tipo_orden;
import pe.edu.upeu.service.Tipo_ordenService;

@RestController
@RequestMapping("/tipo_orden")

public class Tipo_ordenController {
	@Autowired
	private Tipo_ordenService tipo_ordenService;
	@GetMapping
	public ResponseEntity<List<Tipo_orden>> readAll() {
		try {
			List<Tipo_orden> tipo_ordens = tipo_ordenService.readAll();
			if (tipo_ordens.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tipo_ordens, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@PostMapping
	public ResponseEntity<Tipo_orden> crear(@Valid @RequestBody Tipo_orden cat){
		try {
			Tipo_orden c = tipo_ordenService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Tipo_orden> getTipo_ordenId(@PathVariable("id") Long id){
		try {
			Tipo_orden c = tipo_ordenService.read(id);
			return new ResponseEntity<>(c, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo_orden> delTipo_orden(@PathVariable("id") Long id) {

		try {
			tipo_ordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipo_orden(@PathVariable("id") Long id, @Valid @RequestBody Tipo_orden cat) {

		   Tipo_orden c =  tipo_ordenService.read(id);
		    if(c.getId()>0) {
                return new ResponseEntity<>(tipo_ordenService.update(cat), HttpStatus.OK);		    	
		    }else {
		    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
	}
}
