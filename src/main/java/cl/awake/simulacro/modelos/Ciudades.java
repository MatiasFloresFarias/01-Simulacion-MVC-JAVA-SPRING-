package cl.awake.simulacro.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Damos la propiedad entidad y el nombre de la tabla con el nombre de la bd
@Entity
@Table(name="ciudades")
public class Ciudades {
	
	//Atributos 
	@Id
	private int ciudadid;
	
	private String nombreciudad;
	
	//Contructores 
	public Ciudades() {
		super();
	}

	public Ciudades(int ciudadid, String nombreciudad) {
		super();
		this.ciudadid = ciudadid;
		this.nombreciudad = nombreciudad;
	}

	public int getCiudadid() {
		return ciudadid;
	}

	public void setCiudadid(int ciudadid) {
		this.ciudadid = ciudadid;
	}

	public String getNombreciudad() {
		return nombreciudad;
	}

	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}
	
	//ToString 	
	@Override
	public String toString() {
		return "Ciudades [ciudadid=" + ciudadid + ", nombreciudad=" + nombreciudad + "]";
	}
	

	
	
}
