package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DemandeAvis extends Demande {
	@ManyToOne
	@JoinColumn(name="id")
	private Matiere refMatiere;
	@Column
	private String commentaire;

	public Matiere getRefMatiere() {
		return refMatiere;
	}

	public void setRefMatiere(Matiere refMatiere) {
		this.refMatiere = refMatiere;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
}
