package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="SCOLARITE")
public class AttestationScolarite extends Demande {
	@Column(name="RAISON")
	private String reasonOfAttestation;
	@Column(name="STATUT")
	private String statut;

	public String getReasonOfAttestation() {
		return reasonOfAttestation;
	}

	public void setReasonOfAttestation(String reasonOfAttestation) {
		this.reasonOfAttestation = reasonOfAttestation;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
	

}
