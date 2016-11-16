package ma.madrasati.model;

import java.util.Date;

public abstract class Demande {
	private UserAccount refEleve;
	private Date dateDemande;
	private AnneeScolaire refAnneScolaire;

	public UserAccount getRefEleve() {
		return refEleve;
	}

	public void setRefEleve(UserAccount refEleve) {
		this.refEleve = refEleve;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public AnneeScolaire getRefAnneScolaire() {
		return refAnneScolaire;
	}

	public void setRefAnneScolaire(AnneeScolaire refAnneScolaire) {
		this.refAnneScolaire = refAnneScolaire;
	}

}
