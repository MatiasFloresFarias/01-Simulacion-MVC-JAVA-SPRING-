package cl.awakelab.simulacion1.restcontrolador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.awake.simulacro.modelos.MontosPorCiudad;
import cl.awake.simulacro.repositorios.MontosPorCiudadRepositorio;



@RestController
public class MontosPorCiudadRestController {
	
	@Autowired
	MontosPorCiudadRepositorio mpcr;

	@RequestMapping(value = "/mpclist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MontosPorCiudad> getMontosPorCiudad() {
		List<MontosPorCiudad> lista = mpcr.getMontosPorCiudad();
		return lista;
	}

//	@RequestMapping(value = "/mpclist", method = RequestMethod.POST, headers = "Accept=application/json")
//	public void addCliente(@RequestBody Profesional profesional) { 
//		ps.add(profesional);
//	}
//
//	@RequestMapping(value = "/mpclist", method = RequestMethod.PUT, headers = "Accept=application/json")
//	public void updateCliente(@RequestBody Profesional profesional) {
//		ps.edit(profesional);
//	}
//
//	@RequestMapping(value = "/mpcdetalle/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public Profesional getClientePorId(@PathVariable int id) {
//		return ps.getById(id);
//	}
//
//	@RequestMapping(value = "/mpcdetalle/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
//	public void deleteCliente(@PathVariable("id") int id) {
//		ps.delete(id);
//	}

}
