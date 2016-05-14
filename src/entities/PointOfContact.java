package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "point_of_contact")
public class PointOfContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rank;
	private String name;
	private String title;
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	@Column(name = "work_phone")
	private String workPhone;
	
	@Column(name = "cell_phone")
	private String cellPhone;
	private String email;
	private String fax;
	public PointOfContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PointOfContact [id=" + id + ", rank=" + rank + ", name=" + name + ", title=" + title + ", address="
				+ address + ", workPhone=" + workPhone + ", cellPhone=" + cellPhone + ", email=" + email + ", fax="
				+ fax + "]";
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
