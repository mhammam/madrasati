package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AVIS")
@SequenceGenerator(name="AVIS_GEN",sequenceName="AVIS_SEQ")
public class Avis {
	@Column(name="COMMENTAIRE")
	private String commentaire;
	@ManyToOne
    @JoinColumn (name="REF_PROF")
	private Proffesseur refProfesseur;
	@ManyToOne
    @JoinColumn (name="REF_MATIERE")
	private Matiere refMatiere;
	@Column
	@Temporal(TemporalType.DATE)
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="AVIS_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
