package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEMANDE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="descriminant",discriminatorType=DiscriminatorType.STRING)
@SequenceGenerator(name="DEMANDE_GEN",sequenceName="DEMANDE_SEQ")
public abstract class Demande {
	@ManyToOne
	@JoinColumn(name="REF_ELEVE")
	private Eleve refEleve;
	@Column
	private Date dateDemande;
	@ManyToOne
	@JoinColumn(name="REF_ANNEE_SCONALIRE")
	private AnneeScolaire refAnneScolaire;

	public Eleve getRefEleve() {
		return refEleve;
	}

	public void setRefEleve(Eleve refEleve) {
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="DEMANDE_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
