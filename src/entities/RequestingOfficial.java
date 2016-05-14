package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "requesting_official")
public class RequestingOfficial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String rank;
	private String title;
	private String email;
	@OneToMany(mappedBy = "requestingOfficial")
	private List<RequestingCommand> requestingCommands;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<RequestingCommand> getRequestingCommands() {
		return requestingCommands;
	}
	public void setRequestingCommands(List<RequestingCommand> requestingCommands) {
		this.requestingCommands = requestingCommands;
	}
	@Override
	public String toString() {
		return "RequestingOfficial [id=" + id + ", rank=" + rank + ", title=" + title + ", email=" + email
				+ ", requestingCommands=" + requestingCommands + "]";
	}
	public RequestingOfficial() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
