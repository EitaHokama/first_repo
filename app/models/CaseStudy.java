package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CaseStudy extends Model {
	@Id
	//@ManyToMany
	public Integer case_id;
	public Integer year;
	public Integer month;


}
