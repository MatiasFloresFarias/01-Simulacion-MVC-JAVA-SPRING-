package cl.awake.simulacro.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//Damos la propiedad entidad y el nombre de la tabla con el nombre de la bd
@Entity
@Table(name="ayudas")
public class Ayudas {
	
	//atributo id mas el generador de secuencia para implementar el autoincremental de la BD (solo oracle)
	@Id
	@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "ayudaid_seq", sequenceName = "ayudaid_seq")
	private int ayudaid;
	
	//Creamos un beneficiario de tipo beneficiario y se le une las tablas por join asiganado el id de la tabla a relacionar 
	@JoinColumn(name="beneficiarioid")
	@ManyToOne //Relacion de muchos a uno 
	private Beneficiarios beneficiario;
	
	private int monto;
	
	private String motivo;
	
	//Contructores 
	public Ayudas() {
		super();
	}

	public Ayudas(int ayudaid, Beneficiarios beneficiario, int monto, String motivo) {
		super();
		this.ayudaid = ayudaid;
		this.beneficiario = beneficiario;
		this.monto = monto;
	}

	//Getter And Setter 
	public int getAyudaid() {
		return ayudaid;
	}

	public void setAyudaid(int ayudaid) {
		this.ayudaid = ayudaid;
	}

	public Beneficiarios getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiarios beneficiario) {
		this.beneficiario = beneficiario;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return "Ayudas [ayudaid=" + ayudaid + ", beneficiario=" + beneficiario + ", monto=" + monto + ", motivo="
				+ motivo + "]";
	}
	
	// ToString 
	
	
}
