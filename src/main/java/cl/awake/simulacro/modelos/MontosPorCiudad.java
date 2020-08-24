package cl.awake.simulacro.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;


//Creamos una entidad para mostrar los datos de las demas entidades 
@Entity
public class MontosPorCiudad {

	//Atributos 
	@Id
	private int id;
	private String ciudad;
	private String motivo;
	private float monto;
	
	//Contructores 
	public MontosPorCiudad() {
		super();
	}

	public MontosPorCiudad(int id, String ciudad, String motivo, float monto) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.motivo = motivo;
		this.monto = monto;
	}

	//Getter and setter  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	//ToString 
	@Override
	public String toString() {
		return "MontosPorCiudad [id=" + id + ", ciudad=" + ciudad + ", motivo=" + motivo + ", monto=" + monto + "]";
	}	
}

