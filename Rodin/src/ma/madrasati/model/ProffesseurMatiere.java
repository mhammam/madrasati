package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PROF_MATIERE")
@SequenceGenerator(name="PROF_MAT_GEN",sequenceName="PROF_MATIERE_SEQ")
public class ProffesseurMatiere {
	@OneToOne
	@JoinColumn(name="REF_PROF")
	private Proffesseur refProffesseur;
	@OneToOne
	@JoinColumn(name="REF_MAT")
	private Matiere refMatiere;
	@Column(name="DATE_DEBUT")
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Column(name="DATE_FIN")
	@Temporal(TemporalType.DATE)
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="PROF_MAT_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
