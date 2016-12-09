package ma.madrasati.model;
/**
 * 
 * 
 * @author mhammam
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="ANNEE_SCOLAIRE")
@SequenceGenerator(name="ANNEE_SCOLAIRE_GEN",sequenceName="ANNEE_SCOLAIRE_SEQ")
public class AnneeScolaire {
	@Column(name="CODE",unique=true)
	private String code;
	@Column(name="ANNEE")
	private Integer annee;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	@Id
	@GeneratedValue(generator="ANNEE_SCOLAIRE_GEN",strategy=GenerationType.SEQUENCE)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
