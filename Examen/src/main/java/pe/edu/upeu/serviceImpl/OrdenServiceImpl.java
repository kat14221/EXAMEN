package pe.edu.upeu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.OrdenDao;
import pe.edu.upeu.entity.Orden;
import pe.edu.upeu.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {
@Autowired
private OrdenDao ordenDao;
	@Override
	public Orden create(Orden c) {
		// TODO Auto-generated method stub
		return ordenDao.create(c);
	}

	@Override
	public Orden update(Orden c) {
		// TODO Auto-generated method stub
		return ordenDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenDao.delete(id);
	}

	@Override
	public Orden read(Long id) {
		// TODO Auto-generated method stub
		return ordenDao.read(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return ordenDao.readAll();
	}

}
