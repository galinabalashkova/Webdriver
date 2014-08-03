package onliner.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class OnlinerMeteoSearch extends BaseForm {
	private static String formlocator="//body['data-twttr-rendered']";
	
	private Button weather = new Button(By.xpath("//a[@href='http://pogoda.onliner.by/']"), "weather");
	private Button assertweather = new Button(By.linkText("Pogoda.by"),"assertweather");
	
	
	public void weather() {
		weather.click();
	}
	
	public void assertweather(){
		assert(assertweather.isPresent());
	}
	
	
	public OnlinerMeteoSearch() {
		super(By.xpath(formlocator), "Weather");
	}
}
