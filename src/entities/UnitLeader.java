package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unit_leader")
public class UnitLeader {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@OneToMany(mappedBy = "unitLeader")
private List<Ensemble> ensembles;
@ManyToOne
@JoinColumn(name = "band_id")
private Band band;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Ensemble> getEnsembles() {
	return ensembles;
}
public void setEnsembles(List<Ensemble> ensembles) {
	this.ensembles = ensembles;
}
public Band getBand() {
	return band;
}
public void setBand(Band band) {
	this.band = band;
}
@Override
public String toString() {
	return "UnitLeader [id=" + id + ", ensembles=" + ensembles + ", band=" + band + "]";
}
public UnitLeader() {
	super();
	// TODO Auto-generated constructor stub
}

}
