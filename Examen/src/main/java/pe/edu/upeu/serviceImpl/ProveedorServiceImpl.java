package pe.edu.upeu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.ProveedorDao;
import pe.edu.upeu.entity.Proveedor;
import pe.edu.upeu.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {
@Autowired
private ProveedorDao proveedorDao;
	@Override
	public Proveedor create(Proveedor c) {
		// TODO Auto-generated method stub
		return proveedorDao.create(c);
	}

	@Override
	public Proveedor update(Proveedor c) {
		// TODO Auto-generated method stub
		return proveedorDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorDao.delete(id);
	}

	@Override
	public Proveedor read(Long id) {
		// TODO Auto-generated method stub
		return proveedorDao.read(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorDao.readAll();
	}

}
