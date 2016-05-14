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
@JoinColumn(name = "booking_status_id")
private BookingStatus bookingStatus;

@Column(name = "after_action")
private String afterAction;

@Column(name = "moveable_date")
private boolean moveableDate;

@Column(name = "expected_attendance")
private int expectedAttendance;

@Column(name = "other_units")
private boolean otherUnits;

@Column(name = "charges_description")
private String chargesDescription;

@Column(name = "fundraising_description")
private String fundraisingDescription;

@Column(name = "open_admission")
private boolean openAdmission;

@Column(name = "civic_organization")
private boolean civicOrganization;

@Column(name = "backing_of_gov")
private boolean backingOfGovernment;

@Column(name = "organization_exclusive")
private boolean ogranizationExclusive;

@Column(name = "fund_meal")
private boolean fundMeal;

@Column(name = "fund_trans")
private boolean fundTrans;

@Column(name = "provide_telephone")
private boolean provideTelephone;

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

public DateOfRequest getDateRequest() {
	return dateOfRequest;
}

public void setDateRequest(DateOfRequest dateRequest) {
	this.dateOfRequest = dateRequest;
}

public DateOfEvent getDateEvent() {
	return dateOfEvent;
}

public void setDateEvent(DateOfEvent dateEvent) {
	this.dateOfEvent = dateEvent;
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

public boolean isMoveableDate() {
	return moveableDate;
}

public void setMoveableDate(boolean moveableDate) {
	this.moveableDate = moveableDate;
}

public int getExpectedAttendance() {
	return expectedAttendance;
}

public void setExpectedAttendance(int expectedAttendance) {
	this.expectedAttendance = expectedAttendance;
}

public boolean isOtherUnits() {
	return otherUnits;
}

public void setOtherUnits(boolean otherUnits) {
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

public boolean isOpenAdmission() {
	return openAdmission;
}

public void setOpenAdmission(boolean openAdmission) {
	this.openAdmission = openAdmission;
}

public boolean isCivicOrganization() {
	return civicOrganization;
}

public void setCivicOrganization(boolean civicOrganization) {
	this.civicOrganization = civicOrganization;
}

public boolean isBackingOfGovernment() {
	return backingOfGovernment;
}

public void setBackingOfGovernment(boolean backingOfGovernment) {
	this.backingOfGovernment = backingOfGovernment;
}

public boolean isOgranizationExclusive() {
	return ogranizationExclusive;
}

public void setOgranizationExclusive(boolean ogranizationExclusive) {
	this.ogranizationExclusive = ogranizationExclusive;
}

public boolean isFundMeal() {
	return fundMeal;
}

public void setFundMeal(boolean fundMeal) {
	this.fundMeal = fundMeal;
}

public boolean isFundTrans() {
	return fundTrans;
}

public void setFundTrans(boolean fundTrans) {
	this.fundTrans = fundTrans;
}

public boolean isProvideTelephone() {
	return provideTelephone;
}

public void setProvideTelephone(boolean provideTelephone) {
	this.provideTelephone = provideTelephone;
}

public CivilianRequest() {
	super();
	// TODO Auto-generated constructor stub
}




}


