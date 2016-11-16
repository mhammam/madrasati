package ma.madrasati.model;

import java.util.Date;

public class Controle {
	private String code;
	private Date dateControle;
	private Matiere refMatiere;
	private Classe refClasse;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDateControle() {
		return dateControle;
	}
	public void setDateControle(Date dateControle) {
		this.dateControle = dateControle;
	}
	public Matiere getRefMatiere() {
		return refMatiere;
	}
	public void setRefMatiere(Matiere refMatiere) {
		this.refMatiere = refMatiere;
	}
	public Classe getRefClasse() {
		return refClasse;
	}
	public void setRefClasse(Classe refClasse) {
		this.refClasse = refClasse;
	}
	
	
	

}
