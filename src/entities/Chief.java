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
public enum Moustache {
    REGULATION, TRYHARD, HITLER, LOWT
}
public class Chief extends UnitLeader{
 private Moustache moustache;
 @JoinColumn(name = "band_id")
 private Band band;
 public Moustache getStache() {
 	return stache;
 }
 public void setStache(Moustache stache) {
 	this.moustache = stache;
}