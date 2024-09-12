package pe.edu.upeu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.entity.Forma_pago;


@Repository
public interface Forma_pagoRepository extends JpaRepository<Forma_pago, Long>{

}
