package models;

import com.avaje.ebean.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department extends Model {
	@Id
	public Integer department_id;
	public String department_name;

	@OneToMany
	public List<Employees> employees = new ArrayList<>();

}
