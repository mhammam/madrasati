package ma.madrasati.model;

public class Note {
	private String code;
	private String description;
	private Float note;
	private Controle refControle;
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
	
	
	
}
