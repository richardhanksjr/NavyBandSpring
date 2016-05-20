package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "point_of_contact")
public class PointOfContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String rank;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String title;
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	@Column(name = "work_phone")
	private String workPhone;
	
	@Column(name = "cell_phone")
	private String cellPhone;
	@Column(name = "home_phone")
	private String homePhone;
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pointOfContact")
	List<MilitaryRequest> militaryRequests;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pointOfContact")
	List<CivilianRequest> civilianRequests;
	
	public List<MilitaryRequest> getMilitaryRequests() {
		return militaryRequests;
	}
	public void setMilitaryRequests(List<MilitaryRequest> militaryRequests) {
		this.militaryRequests = militaryRequests;
	}
	public List<CivilianRequest> getCivilianRequests() {
		return civilianRequests;
	}
	public void setCivilianRequests(List<CivilianRequest> civilianRequests) {
		this.civilianRequests = civilianRequests;
	}
	private String email;
	private String fax;
	public PointOfContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "PointOfContact [id=" + id + ", password=" + password + ", rank=" + rank + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", title=" + title + ", address=" + address + ", workPhone=" + workPhone
				+ ", cellPhone=" + cellPhone + ", email=" + email + ", fax=" + fax + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}

}
