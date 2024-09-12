package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.entity.Forma_pago;

public interface Forma_pagoService {
	Forma_pago create(Forma_pago c);
    Forma_pago update(Forma_pago c);
    void delete(Long id);
    Forma_pago read(Long id);
    List<Forma_pago> readAll(); 
}
