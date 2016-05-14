package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ensemble")
public class Ensemble {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "band_id")
	private Band band;
	@OneToMany(mappedBy = "ensemble")
	List<CivilianRequest> civilianRequests;
	@ManyToOne
	@JoinColumn(name = "unit_leader_id")
	UnitLeader unitLeader;
	private String name;
	private String description;
	private String requirements;
	private int size;
	@OneToMany(mappedBy = "ensemble")
	private List<MilitaryRequest> militaryRequets;
	
	@Override
	public String toString() {
		return "Ensemble [id=" + id + ", band=" + band + ", civilianRequests=" + civilianRequests + ", unitLeader="
				+ unitLeader + ", name=" + name + ", description=" + description + ", requirements=" + requirements
				+ ", size=" + size + "]";
	}
	public Ensemble() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Band getBand() {
		return band;
	}
	public void setBand(Band band) {
		this.band = band;
	}
	public List<CivilianRequest> getCivilianRequests() {
		return civilianRequests;
	}
	public void setCivilianRequests(List<CivilianRequest> civilianRequests) {
		this.civilianRequests = civilianRequests;
	}
	public UnitLeader getUnitLeader() {
		return unitLeader;
	}
	public void setUnitLeader(UnitLeader unitLeader) {
		this.unitLeader = unitLeader;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
