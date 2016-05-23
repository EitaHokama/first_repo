package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Gratitude_Card extends Model {
	@Id
	//@ManyToMany
	public Integer card_id;
	@ManyToOne
	@JoinColumn(name="employees_id")
	public Integer sender_id;
	@ManyToOne
	@JoinColumn(name="employees_id")
	public Integer receiver_id;
	public Date date;
	public String card_title;
	public String card_content;
	//@MnayToOne
	public Integer category_id;


}
