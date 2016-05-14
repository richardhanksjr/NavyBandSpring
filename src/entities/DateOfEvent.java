package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "date_of_event")
public class DateOfEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int year;
	private int month;
	private int day;
	private String time;
	@OneToMany(mappedBy = "dateOfEvent")
	private List<MilitaryRequest> militaryRequests;
	
	@OneToMany(mappedBy = "dateOfEvent")
	private List<CivilianRequest> civilianRequests;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	@Override
	public String toString() {
		return "DateOfEvent [id=" + id + ", year=" + year + ", month=" + month + ", day=" + day + ", time=" + time
				+ ", militaryRequests=" + militaryRequests + ", civilianRequests=" + civilianRequests + "]";
	}

	public DateOfEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

}
