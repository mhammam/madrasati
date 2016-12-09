package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ELEVE")
@SequenceGenerator(name="ELEVE_GEN",sequenceName="ELEVE_SEQ")
public class Eleve extends UserAccount {
	@Column(name="NCS",columnDefinition="Code nationnal de l etudiant")
	private String nCS; // National code for Student

	public String getnCS() {
		return nCS;
	}

	public void setnCS(String nCS) {
		this.nCS = nCS;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="ELEVE_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
