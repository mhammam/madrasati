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
public class ProffesseurMatiere {
	@ManyToOne
	@JoinColumn(name="id")
	private Proffesseur refProffesseur;
	@ManyToOne
	@JoinColumn(name="id")
	private Matiere refMatiere;
	@Column
	private Date dateDebut;
	@Column
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
