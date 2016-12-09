package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value="AVIS")
public class DemandeAvis extends Demande {
	@ManyToOne
	@JoinColumn(name="REF_MATIERE")
	private Matiere refMatiere;
	@Column(name="COMMENTAIRE",length=250,nullable=false)
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
