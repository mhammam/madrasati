package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AttestationScolarite extends Demande {
	@Column
	private String reasonOfAttestation;
	@Column
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
