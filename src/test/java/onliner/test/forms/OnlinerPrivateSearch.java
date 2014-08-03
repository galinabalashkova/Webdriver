package onliner.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class OnlinerPrivateSearch extends BaseForm {
	private static String formlocator="//body['data-twttr-rendered']";
	
	private Button users = new Button(By.linkText("Пользователи"), "Users");
	private Button pm = new Button(By.linkText("Написать сообщение"), "pm");
	private Button enter = new Button(By.xpath("//input[@name = 'search']"), "search");
	private TextBox nicknameent = new TextBox(By.xpath("//input[@name = 'name']"), "enternickname");
	private Button submit1 = new Button(By.xpath("//button[@type = 'submit']"), "search");
	private TextBox head = new TextBox(By.id("compose_subject"), "head");
	private TextBox textfield = new TextBox(By.id("compose_text"), "text");
	private Button send = new Button(By.xpath("//button[@type = 'submit']"), "send");
	
	private TextBox login = new TextBox(By.name("username"),"name");
	private TextBox passwordclick = new TextBox(By.xpath("//input[@class = 'input unfocus password']"), "password");
	private TextBox password = new TextBox(By.xpath("//input[@class = 'input password']"), "password");
	private Button submit2 = new Button (By.className("submit"), "submit");
	private Label lbLogo = new Label(By.xpath("//img[@class = 'onliner_logo retina-off']"), "logo_onliner");
	private Button lblogin = new Button(By.linkText("galinastorm"), "login_onliner");
	
	
	public void Users() {
		users.click();
	}
	
	public void Nicknameen(String text) {
		nicknameent.type(text);
	}
	
	public void submit1() {
		submit1.click();
	}
	
	public void nickname(String text) {
		private Button nickname = new Button(By.linkText(text),"Userprivate");
		nickname.click();
	}
	
	public void pm() {
		pm.click();
	}
	
	public void h1(String text) {
		head.type(text);
	}
	
	public void body(String text) {
		textfield.type(text);
	}
	
	public void send() {
		send.click();
	}
	
	
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
	
	public void submit2() {
		submit2.click();
	}
	
	
	
	public OnlinerPrivateSearch() {
		super(By.xpath(formlocator), "private");
		// TODO Auto-generated constructor stub
	}

}
