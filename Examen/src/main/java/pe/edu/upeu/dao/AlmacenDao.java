package pe.edu.upeu.dao;

import java.util.List;


import pe.edu.upeu.entity.Almacen;

public interface AlmacenDao {
	Almacen create(Almacen c);
    Almacen update(Almacen c);
    void delete(Long id);
    Almacen read(Long id);
    List<Almacen> readAll(); 
}
