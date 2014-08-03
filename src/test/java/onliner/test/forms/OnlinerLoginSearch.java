package onliner.test.forms;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class OnlinerLoginSearch extends BaseForm {	
	
	private static String formlocator="//body['data-twttr-rendered']";
	
	private TextBox login = new TextBox(By.name("username"),"name");
	private TextBox passwordclick = new TextBox(By.xpath("//input[@class = 'input unfocus password']"), "password");
	private TextBox password = new TextBox(By.xpath("//input[@class = 'input password']"), "password");
	private Button submit = new Button (By.className("submit"), "submit");
	private Label lbLogo = new Label(By.xpath("//img[@class = 'onliner_logo retina-off']"), "logo_onliner");
	private Button lblogin = new Button(By.linkText("galinastorm"), "login_onliner");
		
	public void passwordclick() {
		passwordclick.click();
	}

	public void assertlogo(){
		assert(lbLogo.isPresent());
	}
	
	public void assertlogin(){
		assert(lblogin.isPresent());
	}
	
	public void login(String text) {
		login.click();
		login.type(text);
		}
	
	public void password(String text) {
		password.click();
		password.type(text);
			}
	
	public void submit() {
		submit.click();
	}
	
	
	public OnlinerLoginSearch() {
		super(By.xpath(formlocator), "login");
		// TODO Auto-generated constructor stub
	}


}
