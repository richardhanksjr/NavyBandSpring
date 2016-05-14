package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Band {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int fax;
	@Column(name = "phone_one")
	private String phone;
	private String email;
	@OneToOne(mappedBy = "band")
	private Address address;
	@OneToMany(mappedBy = "band")
	private List<UnitLeader> unitLeaders;
	@OneToMany(mappedBy = "band")
	private List<Ensemble> ensembles;
	public Band() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Band [id=" + id + ", fax=" + fax + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", unitLeaders=" + unitLeaders + ", ensembles=" + ensembles + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<UnitLeader> getUnitLeaders() {
		return unitLeaders;
	}
	public void setUnitLeaders(List<UnitLeader> unitLeaders) {
		this.unitLeaders = unitLeaders;
	}
	public List<Ensemble> getEnsembles() {
		return ensembles;
	}
	public void setEnsembles(List<Ensemble> ensembles) {
		this.ensembles = ensembles;
	}
	

}
