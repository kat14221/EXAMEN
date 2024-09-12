package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.entity.Proveedor;

public interface ProveedorService {
	Proveedor create(Proveedor c);
    Proveedor update(Proveedor c);
    void delete(Long id);
    Proveedor read(Long id);
    List<Proveedor> readAll(); 
}
