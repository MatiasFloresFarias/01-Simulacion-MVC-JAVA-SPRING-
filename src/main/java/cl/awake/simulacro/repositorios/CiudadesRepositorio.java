package cl.awake.simulacro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awake.simulacro.modelos.Ciudades;


//Creamos la interface CiudadesRepositorio y se extiende a la clase JPARepositorio pasado la entidad y el formato del id
public interface CiudadesRepositorio extends JpaRepository<Ciudades, Integer> {

}
