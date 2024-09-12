package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.entity.Orden;

public interface OrdenService {
	Orden create(Orden c);
    Orden update(Orden c);
    void delete(Long id);
    Orden read(Long id);
    List<Orden> readAll(); 
}
