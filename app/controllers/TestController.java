package controllers;

import models.CaseStudy;
import models.Employees;
import models.Gratitude_Card;
import play.mvc.*;
import java.util.List;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class TestController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */


    public Result test2(){
    	//Employees emp = Employees.find.byId(1);
    	List<Gratitude_Card> gc = Gratitude_Card.find.all();

    	return ok(test2.render(gc, ""));
    }

}
