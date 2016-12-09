package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue(value="RDV")
public class RendezVous extends Demande {
	@Column(name="DATE_RDV")
	@Temporal(TemporalType.DATE)
	private Date dateRendezVous;
	@Column(name="STATUT")
	private String statut;
	@Column(name="DESCRIPTION",length=250)
	private String description;
	
	public Date getDateRendezVous() {
		return dateRendezVous;
	}

	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
