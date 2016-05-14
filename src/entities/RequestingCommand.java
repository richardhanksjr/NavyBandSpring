package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "requesting_command")
public class RequestingCommand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "requesting_official_id")
	private RequestingOfficial requestingOfficial;

	public RequestingCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestingCommand [id=" + id + ", name=" + name + ", address=" + address + ", requestingOfficial="
				+ requestingOfficial + "]";
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public RequestingOfficial getRequestingOfficial() {
		return requestingOfficial;
	}

	public void setRequestingOfficial(RequestingOfficial requestingOfficial) {
		this.requestingOfficial = requestingOfficial;
	}

}
