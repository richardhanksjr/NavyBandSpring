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
@Table(name = "military_event")
public class MilitaryRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;   
	private String type;
	@Column(name = "moveable_date")
	private Boolean moveableDate;
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
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
	@JoinColumn(name = "date_of_request_id")
	private DateOfRequest dateOfRequest;
	
	@ManyToOne
	@JoinColumn(name = "date_of_event")
	private DateOfEvent dateOfEvent;
	
	@ManyToOne
	@JoinColumn(name = "ensemble_id")
	private Ensemble ensemble;
	
	@Column(name = "prescribed_uniform")
	private String prescribedUniform;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "booking_status_id")
	private BookingStatus bookingStatus;
	
	@Column(name = "after_action")
	private String afterAction;

	public MilitaryRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getMoveableDate() {
		return moveableDate;
	}

	public void setMoveableDate(Boolean moveableDate) {
		this.moveableDate = moveableDate;
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

	public String getPrescribedUniform() {
		return prescribedUniform;
	}

	public void setPrescribedUniform(String prescribedUniform) {
		this.prescribedUniform = prescribedUniform;
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


	
}
