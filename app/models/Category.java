package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category extends Model {
	@Id
	//@OneToMany
	public Integer category_id;
	public String category_name;


}
