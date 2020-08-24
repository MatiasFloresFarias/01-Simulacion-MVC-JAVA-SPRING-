package cl.awake.simulacro.repositorios;

	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.awake.simulacro.modelos.Ayudas;


//Creamos la interface ayudaRepositorio y se extiende a la clase JPARepositorio pasado la entidad y el formato del id
@Repository
public interface AyudasRepositorio extends JpaRepository<Ayudas, Integer> {

}
