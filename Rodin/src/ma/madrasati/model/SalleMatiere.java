package ma.madrasati.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SalleMatiere {
	@ManyToOne
	@JoinColumn(name="id")
	private Salle refSalle;
	@ManyToOne
	@JoinColumn(name="id")
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
