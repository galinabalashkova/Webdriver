package onliner.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;


public class OnlinerRulesSearch extends BaseForm {
	private static String formlocator="//body['data-twttr-rendered']";
	
	private Button forum = new Button(By.xpath("//a[@href='http://forum.onliner.by/']"),"forum");
	private Button rules = new Button(By.linkText("Правила"),"rules");
	private Button assertrules = new Button(By.linkText("Запрос в службу поддержки"),"rules");
	
	public void forum() {
		forum.click();
	}
	
	public void rules() {
		rules.click();
	}
	
	public void assertrules(){
		assert(assertrules.isPresent());
	}
	
	
	
	
	public OnlinerRulesSearch() {
		super(By.xpath(formlocator), "Rules");
	}

}
