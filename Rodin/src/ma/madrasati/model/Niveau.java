package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="NIVEAU")
@SequenceGenerator(name="NIVEAU_GEN",sequenceName="NIVEAU_SEQ")
public class Niveau {
	@Column(name="CODE",nullable=false,unique=true)
	private String code;
	@Column(name="LIBELLE",nullable=false)
	private String libelle;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="NIVEAU_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
