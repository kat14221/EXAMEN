package pe.edu.upeu.dao;

import java.util.List;

import pe.edu.upeu.entity.Proveedor;

public interface ProveedorDao {
	Proveedor create(Proveedor c);
    Proveedor update(Proveedor c);
    void delete(Long id);
    Proveedor read(Long id);
    List<Proveedor> readAll(); 
}
