package cl.awake.simulacro.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.awake.simulacro.modelos.MontosPorCiudad;


//Creamos la interface ayudaRepositorio y se extiende a la clase JPARepositorio pasado la entidad y el formato del id
public interface MontosPorCiudadRepositorio extends JpaRepository<MontosPorCiudad, Integer> {
	//Creamos la consulta para mostrar los valores de os montos por ciudades y los guardamos en en grupo y eso lo guardamos en una lista y sumamos los valores (monto)
	//ROW_NUMBER genera un numero autoincremental que sera el id de nuestra entidad de paso  
	//luego relacionamos las los valores que queremos mostrar, Ciudades, ayudas 
	//sumamos los valores de monto 
	@Query(value="select ROW_NUMBER() OVER(ORDER BY ciudades.nombreciudad, ayudas.motivo) as id, ciudades.nombreciudad as ciudad, ayudas.motivo, sum(monto) as monto  \r\n" + 
			"from beneficiarios\r\n" + 
			"inner join ayudas\r\n" + 
			"on beneficiarios.beneficiarioid = ayudas.beneficiarioid\r\n" + 
			"inner join ciudades\r\n" + 
			"on beneficiarios.ciudadid = ciudades.ciudadid\r\n" + 
			"group by ciudades.nombreciudad, ayudas.motivo", nativeQuery=true)
	//guardamos la consulta en una lista de montos por ciudades
	List<MontosPorCiudad> getMontosPorCiudad();
}
