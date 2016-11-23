package ma.madrasati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Note {
	@Column
	private String code;
	@Column
	private String description;
	@Column
	private Float note;
	@ManyToOne
	@JoinColumn(name="id")
	private Controle refControle;
	@ManyToOne
	@JoinColumn(name="id")
	private UserAccount refEleve;
	
	
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
	public UserAccount getRefEleve() {
		return refEleve;
	}
	public void setRefEleve(UserAccount refEleve) {
		this.refEleve = refEleve;
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
