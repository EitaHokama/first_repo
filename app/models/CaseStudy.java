package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CaseStudy extends Model {
	@Id
	//@ManyToMany
	public Integer case_id;
	public Integer year;
	public Integer month;

	@ManyToMany()
    public List<Gratitude_Card> gc = new ArrayList<>();

    public static Find<Integer,CaseStudy> find = new Find<Integer,CaseStudy>(){};
}
