package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "booking_status")
public class BookingStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String status;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "bookingStatus")
	List<CivilianRequest> civilianRequests;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "bookingStatus")
	List<MilitaryRequest> militaryRequests;

	public BookingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookingStatus [id=" + id + ", status=" + status + ", civilianRequests=" + civilianRequests
				+ ", militaryRequests=" + militaryRequests + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<CivilianRequest> getCivilianRequests() {
		return civilianRequests;
	}

	public void setCivilianRequests(List<CivilianRequest> civilianRequests) {
		this.civilianRequests = civilianRequests;
	}

	public List<MilitaryRequest> getMilitaryRequests() {
		return militaryRequests;
	}

	public void setMilitaryRequests(List<MilitaryRequest> militaryRequests) {
		this.militaryRequests = militaryRequests;
	}

}
