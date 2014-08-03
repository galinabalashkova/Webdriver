package onliner.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;

public class OnlinerSortSearch extends BaseForm {
	private static String formlocator="//body['data-twttr-rendered']";
	
	private Button photo = new Button(By.linkText("Фотоаппараты"), "photo_onliner");
	private Button cost  = new Button(By.linkText("Цене"), "cost");
	private Button name = new Button(By.linkText("Названию"), "name");
	private Button data = new Button(By.linkText("Дате"), "data");
	private Button rate = new Button(By.linkText("Рейтингу"), "rate");
	
	
	public void assertenabled(String text){
		Button assEnabled = new Button(By.xpath("//a[@href='photo/section/~add=0~where=onsale~currency=USD~city=minsk~sort_by=" +text +"~dir=desc/']"),"forum");
		assert(assEnabled.isPresent());
	}
	
	
	
	public void photo() {
		photo.click();
	}
	
	public void cost() {
		cost.click();
	}
	public void name() {
		name.click();
	}
	public void data() {
		data.click();
	}
	public void rate() {
		rate.click();
	}
	

	
	
	
	
	
	
	public OnlinerSortSearch() {
		super(By.xpath(formlocator), "sortsearch");
		// TODO Auto-generated constructor stub
	}

}