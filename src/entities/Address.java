package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String street;

@Column(name = "apt_po_number")
private String aptPoNumber;
private String city;
private String state;
private String zip;
@ManyToOne
@JoinColumn(name = "band_id")
private Band band;

 @OneToMany(mappedBy = "address")
 List<RequestingCommand> requestingCommands;
 
 @OneToMany(mappedBy = "address")
 List<CivilianRequest> civilianRequests;
 
 @OneToMany(mappedBy = "address")
 List<PointOfContact> pointsOfContact;
 
 @OneToMany(mappedBy = "address")
 List<MilitaryRequest> militaryRequests;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getAptPoNumber() {
	return aptPoNumber;
}

public void setAptPoNumber(String aptPoNumber) {
	this.aptPoNumber = aptPoNumber;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
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

public Band getBand() {
	return band;
}

public void setBand(Band band) {
	this.band = band;
}

public List<RequestingCommand> getRequestingCommands() {
	return requestingCommands;
}

public void setRequestingCommands(List<RequestingCommand> requestingCommands) {
	this.requestingCommands = requestingCommands;
}

public List<CivilianRequest> getCivilianRequests() {
	return civilianRequests;
}

public void setCivilianRequests(List<CivilianRequest> civilianRequests) {
	this.civilianRequests = civilianRequests;
}

public List<PointOfContact> getPointsOfContact() {
	return pointsOfContact;
}

public void setPointsOfContact(List<PointOfContact> pointsOfContact) {
	this.pointsOfContact = pointsOfContact;
}

public List<MilitaryRequest> getMilitaryRequests() {
	return militaryRequests;
}

public void setMilitaryRequests(List<MilitaryRequest> militaryRequests) {
	this.militaryRequests = militaryRequests;
}
}
