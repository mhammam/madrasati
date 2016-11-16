package ma.madrasati.model;

import java.util.Date;

public class ProffesseurMatiere {
	private Proffesseur refProffesseur;
	private Matiere refMatiere;
	private Date dateDebut;
	private Date dateFin;
	
	public Proffesseur getRefProffesseur() {
		return refProffesseur;
	}
	public void setRefProffesseur(Proffesseur refProffesseur) {
		this.refProffesseur = refProffesseur;
	}
	public Matiere getRefMatiere() {
		return refMatiere;
	}
	public void setRefMatiere(Matiere refMatiere) {
		this.refMatiere = refMatiere;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
}
