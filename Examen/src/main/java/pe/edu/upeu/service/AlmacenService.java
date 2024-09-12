package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.entity.Almacen;

public interface AlmacenService {
	Almacen create(Almacen c);
    Almacen update(Almacen c);
    void delete(Long id);
    Almacen read(Long id);
    List<Almacen> readAll(); 
}
