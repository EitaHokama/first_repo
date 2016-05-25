package controllers;

import models.CaseStudy;
import models.Employees;
import models.Gratitude_Card;
import models.Category;
import play.mvc.*;
import java.util.List;

import views.html.*;
import play.data.Form;
import play.data.FormFactory;
import javax.inject.Inject;
import java.util.Map;
import java.util.HashMap;
import com.avaje.ebean.ExpressionList;

/**
 * name 感謝カード各項目の論理名称を格納
 */
public class SelectGC {

	private Map<String, String[]> params;
	public static final Map<String, String> name = new HashMap<String, String>(){
		{
			put("sender_department", "送信部署");
			put("sender", "送信者");
			put("receiver_department", "受信部署");
			put("receiver","受信者");
			put("date", "日付");
			put("title", "タイトル");
			put("category", "カテゴリ");
		}
	};

	SelectGC(Map<String, String[]> params){
		this.params = params;
	}

	public List<Gratitude_Card> find(){
		List<Gratitude_Card> gc;

		/*Query<> cat = Category.find.where().eq("category_name",params.get("category")[0]).findList();
    	if(!"カテゴリ".equals(params.get("category")[0])){
    		gc = Gratitude_Card.find.where().eq("category_id",
    				cat.get(0)
    			).findList();
    	}else{
    		gc = Gratitude_Card.find.all();
    	}*/
		// com...EbeanList を戻り値に持つメソッドを連結する
		//gc= Gratitude_Card.find.all();

		//gc = sortDate(Gratitude_Card.find.all());
		gc=sortDate(Gratitude_Card.find.where());

		return gc;
	}

	public List<Gratitude_Card> sortDate(ExpressionList<Gratitude_Card> gc){

		return gc.orderBy("date ASC").findList();
	}


}
