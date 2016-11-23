package ma.madrasati.model;

import java.util.Date;

public class Avis {
	private String commentaire;
	private Proffesseur refProfesseur;
	private Matiere refMatiere;
	private Date dateAvis;

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Proffesseur getRefProfesseur() {
		return refProfesseur;
	}

	public void setRefProfesseur(Proffesseur refProfesseur) {
		this.refProfesseur = refProfesseur;
	}

	public Matiere getRefMatiere() {
		return refMatiere;
	}

	public void setRefMatiere(Matiere refMatiere) {
		this.refMatiere = refMatiere;
	}

	public Date getDateAvis() {
		return dateAvis;
	}

	public void setDateAvis(Date dateAvis) {
		this.dateAvis = dateAvis;
	}

}
