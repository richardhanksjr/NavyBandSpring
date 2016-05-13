package entities;

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
Address address;

@ManyToOne
@JoinColumn(name = "date_of_request_id")
DateRequest dateRequest;

@ManyToOne
@JoinColumn(name = "date_of_event_iddate_of_event")
DateEvent dateEvent;

@ManyToOne
@JoinColumn(name = "ensemble_id")
Ensemble ensemble;

Description description;

@ManyToOne
@JoinColumn(name = "booking_status_id")
BookingStatus bookingStatus;
}
