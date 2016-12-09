package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PROFFESSEUR")
@SequenceGenerator(name="PROF_GEN",sequenceName="PROF_SEQ")
public class Proffesseur {
	@Column(name="CODE",unique=false)
	private String code;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	private String prenom;
	@Column(name="DATE_EMBAUCHE")
	@Temporal(TemporalType.DATE)
	private Date dateEmbauche;
	@Column(name="ANCIENNETE",nullable=false)
	private Integer anciennete;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Integer getAnciennete() {
		return anciennete;
	}
	public void setAnciennete(Integer anciennete) {
		this.anciennete = anciennete;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="PROF_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
