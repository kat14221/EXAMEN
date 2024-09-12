package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.entity.Tipo_orden;

public interface Tipo_ordenService  {
	Tipo_orden create(Tipo_orden c);
    Tipo_orden update(Tipo_orden c);
    void delete(Long id);
    Tipo_orden read(Long id);
    List<Tipo_orden> readAll(); 
}
