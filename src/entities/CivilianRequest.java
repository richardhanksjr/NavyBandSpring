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
@Table(name="civilian_event")
public class CivilianRequest {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String title;

@ManyToOne
@JoinColumn(name = "address_id")
private Address address;

@ManyToOne
@JoinColumn(name = "date_of_request_id")
private DateOfRequest dateOfRequest;

@ManyToOne
@JoinColumn(name = "date_of_event_iddate_of_event")
private DateOfEvent dateOfEvent;

@ManyToOne
@JoinColumn(name = "ensemble_id")
private Ensemble ensemble;

private String description;

@ManyToOne
@JoinColumn(name = "point_of_contact_id")
private PointOfContact pointOfContact;

public PointOfContact getPointOfContact() {
	return pointOfContact;
}


public void setPointOfContact(PointOfContact pointOfContact) {
	this.pointOfContact = pointOfContact;
}


@ManyToOne
@JoinColumn(name = "booking_status_id")
private BookingStatus bookingStatus;

@Column(name = "after_action")
private String afterAction;

@Column(name = "moveable_date")
private Boolean moveableDate;

@Column(name = "expected_attendance")
private Integer expectedAttendance;

@Column(name = "other_units")
private Boolean otherUnits;

@Column(name = "charges_description")
private String chargesDescription;

@Column(name = "fundraising_description")
private String fundraisingDescription;

@Column(name = "open_admission")
private Boolean openAdmission;

@Column(name = "civic_organization")
private Boolean civicOrganization;

@Column(name = "backing_of_gov")
private Boolean backingOfGovernment;

@Column(name = "oganization_exclusive")
private Boolean ogranizationExclusive;

@Column(name = "fund_meal")
private Boolean fundMeal;

@Column(name = "fund_trans")
private Boolean fundTrans;

@Column(name = "provide_telephone")
private Boolean provideTelephone;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
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


public DateOfRequest getDateOfRequest() {
	return dateOfRequest;
}


public void setDateOfRequest(DateOfRequest dateOfRequest) {
	this.dateOfRequest = dateOfRequest;
}


public DateOfEvent getDateOfEvent() {
	return dateOfEvent;
}


public void setDateOfEvent(DateOfEvent dateOfEvent) {
	this.dateOfEvent = dateOfEvent;
}


public Ensemble getEnsemble() {
	return ensemble;
}


public void setEnsemble(Ensemble ensemble) {
	this.ensemble = ensemble;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public BookingStatus getBookingStatus() {
	return bookingStatus;
}


public void setBookingStatus(BookingStatus bookingStatus) {
	this.bookingStatus = bookingStatus;
}


public String getAfterAction() {
	return afterAction;
}


public void setAfterAction(String afterAction) {
	this.afterAction = afterAction;
}


public Boolean getMoveableDate() {
	return moveableDate;
}


public void setMoveableDate(Boolean moveableDate) {
	this.moveableDate = moveableDate;
}


public Integer getExpectedAttendance() {
	return expectedAttendance;
}


public void setExpectedAttendance(Integer expectedAttendance) {
	this.expectedAttendance = expectedAttendance;
}


public Boolean getOtherUnits() {
	return otherUnits;
}


public void setOtherUnits(Boolean otherUnits) {
	this.otherUnits = otherUnits;
}


public String getChargesDescription() {
	return chargesDescription;
}


public void setChargesDescription(String chargesDescription) {
	this.chargesDescription = chargesDescription;
}


public String getFundraisingDescription() {
	return fundraisingDescription;
}


public void setFundraisingDescription(String fundraisingDescription) {
	this.fundraisingDescription = fundraisingDescription;
}


public Boolean getOpenAdmission() {
	return openAdmission;
}


public void setOpenAdmission(Boolean openAdmission) {
	this.openAdmission = openAdmission;
}


public Boolean getCivicOrganization() {
	return civicOrganization;
}


public void setCivicOrganization(Boolean civicOrganization) {
	this.civicOrganization = civicOrganization;
}


public Boolean getBackingOfGovernment() {
	return backingOfGovernment;
}


public void setBackingOfGovernment(Boolean backingOfGovernment) {
	this.backingOfGovernment = backingOfGovernment;
}


public Boolean getOgranizationExclusive() {
	return ogranizationExclusive;
}


public void setOgranizationExclusive(Boolean ogranizationExclusive) {
	this.ogranizationExclusive = ogranizationExclusive;
}


public Boolean getFundMeal() {
	return fundMeal;
}


public void setFundMeal(Boolean fundMeal) {
	this.fundMeal = fundMeal;
}


public Boolean getFundTrans() {
	return fundTrans;
}


public void setFundTrans(Boolean fundTrans) {
	this.fundTrans = fundTrans;
}


public Boolean getProvideTelephone() {
	return provideTelephone;
}


public void setProvideTelephone(Boolean provideTelephone) {
	this.provideTelephone = provideTelephone;
}


public CivilianRequest() {
	super();
	// TODO Auto-generated constructor stub
}




}


