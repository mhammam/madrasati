package ma.madrasati.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SALLE_METIERE")
@SequenceGenerator(name="SALLE_MAT_GEN",sequenceName="SALLE_MAT_SEQ")
public class SalleMatiere {
	@OneToOne
	@JoinColumn(name="REF_SALLE")
	private Salle refSalle;
	@OneToOne
	@JoinColumn(name="REF_MATIERE")
	private Matiere refMatiere;

	public Salle getRefSalle() {
		return refSalle;
	}

	public void setRefSalle(Salle refSalle) {
		this.refSalle = refSalle;
	}

	public Matiere getRefMatiere() {
		return refMatiere;
	}

	public void setRefMatiere(Matiere refMatiere) {
		this.refMatiere = refMatiere;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SALLE_MAT_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
