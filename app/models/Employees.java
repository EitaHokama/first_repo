package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employees extends Model {
	@Id
	@OneToMany
	public Integer employees_id;
	public String name;
	@ManyToOne
	public Integer depatrment_id;
	public String login_id;
	public String pass;
	public String permissions;
	public String emplyees_cd;
	public Integer del_flag;
}
