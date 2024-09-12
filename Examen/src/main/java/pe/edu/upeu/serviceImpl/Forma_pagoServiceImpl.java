package pe.edu.upeu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.Forma_pagoDao;
import pe.edu.upeu.entity.Forma_pago;
import pe.edu.upeu.service.Forma_pagoService;

@Service
public class Forma_pagoServiceImpl implements Forma_pagoService {
@Autowired
private Forma_pagoDao forma_pagoDao;
	@Override
	public Forma_pago create(Forma_pago c) {
		// TODO Auto-generated method stub
		return forma_pagoDao.create(c);
	}

	@Override
	public Forma_pago update(Forma_pago c) {
		// TODO Auto-generated method stub
		return forma_pagoDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		forma_pagoDao.delete(id);
	}

	@Override
	public Forma_pago read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoDao.read(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoDao.readAll();
	}

}
