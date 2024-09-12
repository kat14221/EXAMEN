package pe.edu.upeu.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.AlmacenDao;
import pe.edu.upeu.entity.Almacen;
import pe.edu.upeu.service.AlmacenService;

@Service
public class AlmacenServiceImpl implements AlmacenService {
@Autowired
private AlmacenDao almacenDao;
	@Override
	public Almacen create(Almacen c) {
		// TODO Auto-generated method stub
		return almacenDao.create(c);
	}

	@Override
	public Almacen update(Almacen c) {
		// TODO Auto-generated method stub
		return almacenDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenDao.delete(id);
	}


	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return almacenDao.readAll();
	}

	@Override
	public Almacen read(Long id) {
		// TODO Auto-generated method stub
		return almacenDao.read(id);
	}

	

}
