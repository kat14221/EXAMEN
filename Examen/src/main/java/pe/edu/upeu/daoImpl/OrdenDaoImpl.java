package pe.edu.upeu.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.dao.OrdenDao;
import pe.edu.upeu.entity.Orden;
import pe.edu.upeu.repository.OrdenRepository;
@Component
public class OrdenDaoImpl implements OrdenDao{
@Autowired
private OrdenRepository ordenRepository;
	@Override
	public Orden create(Orden c) {
		// TODO Auto-generated method stub
		return ordenRepository.save(c);
	}

	@Override
	public Orden update(Orden c) {
		// TODO Auto-generated method stub
		return ordenRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenRepository.deleteById(id);
	}

	@Override
	public Orden read(Long id) {
		// TODO Auto-generated method stub
		return ordenRepository.findById(id).get();
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}

}
