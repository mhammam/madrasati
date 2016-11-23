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
public class Controle {
	@Column
	private String code;
	@Column
	private Date dateControle;
	@ManyToOne
	@JoinColumn(name="id")
	private Matiere refMatiere;
	@ManyToOne
	@JoinColumn(name="id")
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
