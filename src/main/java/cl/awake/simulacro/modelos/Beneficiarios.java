package cl.awake.simulacro.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Damos la propiedad entidad y el nombre de la tabla con el nombre de la bd
@Entity
@Table(name="beneficiarios")
public class Beneficiarios {
	
	@Id
	private int beneficiarioid;
	
	private String nombre;
	
	private int edad;
	
	//Creamos un atributo Ciudadades  de tipo Ciudadades y se le une las tablas por join asiganado el id de la tabla a relacionar 
	@ManyToOne
	@JoinColumn(name="ciudadid")
	private Ciudades ciudad;
	
	//Contructores 
	public Beneficiarios() {
		super();
	}

	public Beneficiarios(int beneficiarioid, String nombre, int edad, Ciudades ciudad) {
		super();
		this.beneficiarioid = beneficiarioid;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	//Getter and setter 
	public int getBeneficiarioid() {
		return beneficiarioid;
	}

	public void setBeneficiarioid(int beneficiarioid) {
		this.beneficiarioid = beneficiarioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ciudades getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudades ciudad) {
		this.ciudad = ciudad;
	}
	
	//ToString  

	@Override
	public String toString() {
		return "Beneficiarios [beneficiarioid=" + beneficiarioid + ", nombre=" + nombre + ", edad=" + edad + ", ciudad="
				+ ciudad + "]";
	}
	
	

	
	
	
}
