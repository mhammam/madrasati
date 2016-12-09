package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SALLE")
@SequenceGenerator(name="SALLE_GEN",sequenceName="SALLE_SEQ")
public class Salle {
	@Column(name="CODE",unique=true,nullable=false)
	private String code;
	@Column(name="ETAGE")
	private String etage;
	@Column(name="NUMERO")
	private Integer numero;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SALLE_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
