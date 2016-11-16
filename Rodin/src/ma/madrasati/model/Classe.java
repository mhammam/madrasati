package ma.madrasati.model;

import java.util.Set;

public class Classe {
	private String code;
	private Niveau refNiveau;
	private AnneeScolaire refAnneeScolaire;
	private Set<ProffesseurMatiere> refProffesseurs;
	private Set<UserAccount> refEleves;
	private Salle refSalle;
	
	
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
	public Salle getRefSalle() {
		return refSalle;
	}
	public void setRefSalle(Salle refSalle) {
		this.refSalle = refSalle;
	}
	
	
}
