package cl.awake.simulacro.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cl.awake.simulacro.modelos.Beneficiarios;
import cl.awake.simulacro.modelos.MontosPorCiudad;
import cl.awake.simulacro.repositorios.BeneficiariosRepositorio;



@Controller
public class MontosPorCiudadController {

	//Injeccion de Beneficiario Repository 
	@Autowired
	BeneficiariosRepositorio br;

	@RequestMapping(value = "/listadomontosporciudad", method = RequestMethod.GET)
	public ModelAndView getAllPostJSON(Model model, HttpServletRequest request) {
		
		//Guardamos el puerto local en la variale port 
		int port = request.getLocalPort();
		
		//Generamos la URI donde vendra el API REST generada en el controllador rest 
		final String uri = "http://localhost:" + port + "/simulacion1/mpclist";
		
		//intanciamos restemplate metodo que sirve para trabajar los json y poder consumirlo con jsp 
		RestTemplate restTemplate = new RestTemplate();

		//manejamos la respuesta http 
		ResponseEntity<List<MontosPorCiudad>> postResponse = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MontosPorCiudad>>() {
				});
		
		//obtener montos pro ciudades 
		List<MontosPorCiudad> posts = postResponse.getBody();
		model.addAttribute("montosporciudad", posts);


		// obtener los beneficiarios
		List<Beneficiarios> listab = br.findAll();
		model.addAttribute("beneficiarios", listab);
		
		//retornamos la funcion a Home (vista jsp)
		return new ModelAndView("home", "model", model);
	}
}