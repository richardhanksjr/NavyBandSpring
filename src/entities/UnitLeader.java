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
}
