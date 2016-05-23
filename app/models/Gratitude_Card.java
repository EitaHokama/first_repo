package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Gratitude_Card extends Model {
	@Id
	//@ManyToMany
	public Integer card_id;
	@ManyToOne
	public Employees sender_id;
	@ManyToOne
	public Employees receiver_id;
	//public Date date;
	public String card_title;
	public String card_content;
	@ManyToOne
	public Category category_id;

	@ManyToMany
	public List<CaseStudy> cs= new ArrayList();


	public static Find<Integer,Gratitude_Card> find = new Find<Integer,Gratitude_Card>(){};
}
