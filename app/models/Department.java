package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department extends Model {
	@Id
	@OneToMany
	public Integer department_id;
	public String department_name;

}
