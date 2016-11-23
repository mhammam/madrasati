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
public abstract class Demande {
	@ManyToOne
	@JoinColumn(name="id")
	private UserAccount refEleve;
	@Column
	private Date dateDemande;
	@ManyToOne
	@JoinColumn(name="id")
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
