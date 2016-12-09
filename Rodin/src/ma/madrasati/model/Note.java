package ma.madrasati.model;

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
@Table(name="NOTE")
@SequenceGenerator(name="NOTE_GEN",sequenceName="NOTE_SEQ")
public class Note {
	@Column(name="CODE",nullable=false)
	private String code;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="NOTE")
	private Float note;
	@ManyToOne
	@JoinColumn(name="REF_CONTROLE")
	private Controle refControle;
	@ManyToOne
	@JoinColumn(name="REF_ELEVE")
	private Eleve refEleve;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getNote() {
		return note;
	}
	public void setNote(Float note) {
		this.note = note;
	}
	public Controle getRefControle() {
		return refControle;
	}
	public void setRefControle(Controle refControle) {
		this.refControle = refControle;
	}
	public Eleve getRefEleve() {
		return refEleve;
	}
	public void setRefEleve(Eleve refEleve) {
		this.refEleve = refEleve;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="NOTE_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
