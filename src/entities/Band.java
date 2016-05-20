package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Band {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String fax;
	@Column(name = "phone_one")
	private String phone;
	private String dsn;
	public String getDsn() {
		return dsn;
	}
	public void setDsn(String dsn) {
		this.dsn = dsn;
	}
	private String email;
	@OneToMany(fetch=FetchType.EAGER, mappedBy = "band")
	List<Address> addresses;
	@OneToMany(mappedBy = "band")
	private List<UnitLeader> unitLeaders;
	@OneToMany(mappedBy = "band")
	private List<Ensemble> ensembles;
	@Column(name = "po_box")
	private String poBox;
	@Column(name = "street_address")
	private String streetAddress;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String state;
	private String zip;
	


	public String getPoBox() {
		return poBox;
	}
	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Band() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
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


	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
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
