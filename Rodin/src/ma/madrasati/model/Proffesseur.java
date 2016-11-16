package ma.madrasati.model;

import java.util.Date;

public class Proffesseur {
	private String code;
	private String nom;
	private String prenom;
	private Date dateEmbauche;
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
	
	
	
}
