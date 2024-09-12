package pe.edu.upeu.dao;

import java.util.List;

import pe.edu.upeu.entity.Tipo_orden;

public interface Tipo_ordenDao {
	Tipo_orden create(Tipo_orden c);
    Tipo_orden update(Tipo_orden c);
    void delete(Long id);
    Tipo_orden read(Long id);
    List<Tipo_orden> readAll(); 
}
