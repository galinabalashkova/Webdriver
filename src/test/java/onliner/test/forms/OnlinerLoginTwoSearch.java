package onliner.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class OnlinerLoginTwoSearch extends BaseForm {
	private static String formlocator="//body['data-twttr-rendered']";
	
	//private Button submit = new Button (By.className("submit"), "submit");
	private Button submit = new Button (By.linkText("Войти"), "submit");
	private TextBox login = new TextBox (By.id("username"), "login");
	private TextBox password = new TextBox (By.id("password"), "password");
	private Button enter = new Button (By.xpath("//input[@alt='Войти и быть как дома']"),"enter");
	private Label lbLogo = new Label(By.xpath("//img[@class = 'onliner_logo retina-off']"), "logo_onliner");
	private Button lblogin = new Button(By.linkText("Spring_Storm"), "login_onliner");
		
	
	
	
	public void submit() {
		submit.click();
	}
	
	public void login(String text) {
		login.click();
		login.type(text);
			
			}
	
	public void password(String text) {
		password.click();
		password.type(text);
			}
	
	public void enter() {
		enter.click();
	}
	
	public void assertlogo(){
		assert(lbLogo.isPresent());
	}
	
	public void assertlogin(){
		assert(lblogin.isPresent());
	}
	
	
	public OnlinerLoginTwoSearch() {
		super(By.xpath(formlocator), "logintwo");
		// TODO Auto-generated constructor stub
	}

}
