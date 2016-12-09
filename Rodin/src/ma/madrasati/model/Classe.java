package ma.madrasati.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLASSE")
@SequenceGenerator(name="CLASSE_GEN",sequenceName="CLASSE_SEQ")
public class Classe {
	@Column(name="CODE",unique=true)
	private String code;
	@ManyToOne
    @JoinColumn (name="REF_NIVEAU")
	private Niveau refNiveau;
	@ManyToOne
    @JoinColumn (name="REF_ANNEE_SCO")
	private AnneeScolaire refAnneeScolaire;
	@OneToMany
	@JoinColumn(name="REF_PROFS")
	private Set<ProffesseurMatiere> refProffesseurs;
	@OneToMany
	@JoinColumn(name="REF_ELEVES")
	private Set<Eleve> refEleves;
	@OneToMany
	@JoinColumn(name="REF_SALLE_MATIERES")
	private Set<SalleMatiere> refSalleMetieres;
	
	
	public Niveau getRefNiveau() {
		return refNiveau;
	}
	public void setRefNiveau(Niveau refNiveau) {
		this.refNiveau = refNiveau;
	}
	public AnneeScolaire getRefAnneeScolaire() {
		return refAnneeScolaire;
	}
	public void setRefAnneeScolaire(AnneeScolaire refAnneeScolaire) {
		this.refAnneeScolaire = refAnneeScolaire;
	}
	public Set<ProffesseurMatiere> getRefProffesseurs() {
		return refProffesseurs;
	}
	public void setRefProffesseurs(Set<ProffesseurMatiere> refProffesseurs) {
		this.refProffesseurs = refProffesseurs;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Set<Eleve> getRefEleves() {
		return refEleves;
	}
	public void setRefEleves(Set<Eleve> refEleves) {
		this.refEleves = refEleves;
	}
	public Set<SalleMatiere> getRefSalleMetiere() {
		return refSalleMetieres;
	}
	public void setRefSalleMetiere(Set<SalleMatiere> refSalleMetiere) {
		this.refSalleMetieres = refSalleMetiere;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="CLASSE_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
}
