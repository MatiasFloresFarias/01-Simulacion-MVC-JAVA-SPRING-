package cl.awake.simulacro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awake.simulacro.modelos.Beneficiarios;



//Creamos la interface BeneficiarioRepositorio y se extiende a la clase JPARepositorio pasado la entidad y el formato del id
public interface BeneficiariosRepositorio extends JpaRepository<Beneficiarios, Integer> {

}
