package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	@Column
	private String commentaire;
	@ManyToOne
    @JoinColumn (name="id")
	private Proffesseur refProfesseur;
	@ManyToOne
    @JoinColumn (name="id")
	private Matiere refMatiere;
	@Column
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
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
