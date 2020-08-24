package cl.awake.simulacro.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	//Controlador de la ruta principal el cual redireccionamos a la vista que seara nuestra pagina principal 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
		return new ModelAndView("redirect:/listadomontosporciudad");
		// return new ModelAndView("home");
	}

}
