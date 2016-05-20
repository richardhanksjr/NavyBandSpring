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
@Table(name = "date_of_request")
public class DateOfRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String year;
	private String month;
	private String day;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dateOfRequest")
	private List<MilitaryRequest> militaryRequests;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dateOfRequest")
	private List<CivilianRequest> civilianRequests;

	public DateOfRequest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

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

}
