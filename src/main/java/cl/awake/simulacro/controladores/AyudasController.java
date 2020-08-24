package cl.awake.simulacro.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awake.simulacro.modelos.Ayudas;
import cl.awake.simulacro.repositorios.AyudasRepositorio;



@Controller
public class AyudasController {
	
	//injeccion de ayudaRepository  
    @Autowired
    AyudasRepositorio ar;
	
    //ruta el cual respondera el controlador 
    @RequestMapping(value = "/guardarAyudas", method = RequestMethod.POST)
    public ModelAndView guardarAsesoria(Ayudas a) {
    	//llamamos la variable que le damos a Ayuda repository y le entregamos el metodo gaurdar de JPA 
        ar.save(a);
        //return new ModelAndView("redirect:/listadomontosporciudad");
        //El metodo Al ser llamado redireciona a la pagina princial 
        return new ModelAndView("redirect:/");
    }
}
