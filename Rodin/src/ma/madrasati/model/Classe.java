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

@Entity
public class Classe {
	@Column
	private String code;
	@ManyToOne
    @JoinColumn (name="id")
	private Niveau refNiveau;
	@ManyToOne
    @JoinColumn (name="id")
	private AnneeScolaire refAnneeScolaire;
	@OneToMany
	@JoinColumn(name="id")
	private Set<ProffesseurMatiere> refProffesseurs;
	@OneToMany
	@JoinColumn(name="id")
	private Set<UserAccount> refEleves;
	@OneToMany
	@JoinColumn(name="id")
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
	public Set<UserAccount> getRefEleves() {
		return refEleves;
	}
	public void setRefEleves(Set<UserAccount> refEleves) {
		this.refEleves = refEleves;
	}
	public Set<SalleMatiere> getRefSalleMetiere() {
		return refSalleMetieres;
	}
	public void setRefSalleMetiere(Set<SalleMatiere> refSalleMetiere) {
		this.refSalleMetieres = refSalleMetiere;
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
