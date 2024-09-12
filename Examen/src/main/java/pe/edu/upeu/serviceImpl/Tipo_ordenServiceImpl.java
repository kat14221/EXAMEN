package pe.edu.upeu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.Tipo_ordenDao;
import pe.edu.upeu.entity.Tipo_orden;
import pe.edu.upeu.service.Tipo_ordenService;

@Service
public class Tipo_ordenServiceImpl implements Tipo_ordenService {
@Autowired
private Tipo_ordenDao tipo_ordenDao;
	@Override
	public Tipo_orden create(Tipo_orden c) {
		// TODO Auto-generated method stub
		return tipo_ordenDao.create(c);
	}

	@Override
	public Tipo_orden update(Tipo_orden c) {
		// TODO Auto-generated method stub
		return tipo_ordenDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipo_ordenDao.delete(id);
	}

	@Override
	public Tipo_orden read(Long id) {
		// TODO Auto-generated method stub
		return tipo_ordenDao.read(id);
	}

	@Override
	public List<Tipo_orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_ordenDao.readAll();
	}

}
