package ma.madrasati.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CONTROLE")
@SequenceGenerator(name="CONTROLE_GEN",sequenceName="CONTROLE_SEQ")
public class Controle {
	@Column(name="CODE",unique=true)
	private String code;
	@Column(name="DATE_CONTROLE")
	private Date dateControle;
	@ManyToOne
	@JoinColumn(name="REF_MATIERE")
	private Matiere refMatiere;
	@ManyToOne
	@JoinColumn(name="REF_CLASSE")
	private Classe refClasse;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDateControle() {
		return dateControle;
	}
	public void setDateControle(Date dateControle) {
		this.dateControle = dateControle;
	}
	public Matiere getRefMatiere() {
		return refMatiere;
	}
	public void setRefMatiere(Matiere refMatiere) {
		this.refMatiere = refMatiere;
	}
	public Classe getRefClasse() {
		return refClasse;
	}
	public void setRefClasse(Classe refClasse) {
		this.refClasse = refClasse;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="CONTROLE_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
