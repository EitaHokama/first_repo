package models;

import com.avaje.ebean.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employees extends Model {
	@Id

	public Integer employees_id;
	public String name;
	@ManyToOne
	public Department depatrment_id;
	public String login_id;
	public String pass;
	public String permissions;
	public String employees_cd;
	public Integer del_flag;

	@OneToMany(mappedBy="sender_id")
	public List<Gratitude_Card> sender = new ArrayList<>();
	@OneToMany(mappedBy="receiver_id")
	public List<Gratitude_Card> receiver = new ArrayList<>();
	public static Find<Integer,Employees> find = new Find<Integer,Employees>(){};
}
