package onliner.test.forms;
	
import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

	public class OnlinerParametrSearch extends BaseForm {
		private static String formlocator="//body['data-twttr-rendered']";
		
		private Button photo = new Button(By.linkText("Фотоаппараты"), "photo_onliner");
		private Button typecamera = new Button(By.linkText("зеркальная камера"), "typecamera" );
		private Button splash = new Button(By.id("lВстроенная вспышка"),"flash");
		private Button enter = new Button(By.xpath("//input[@name = 'search']"), "search");
		private Label assertseacrh = new Label(By.xpath("//div['зеркальная камера']"), "assertsearch");
		
		public void photo() {
			photo.click();
		}	
		
		public void typecamera() {
			typecamera.click();
		}
		
		public void splash() {
			splash.click();
		}
		
		public void asserts(){
			assert(assertseacrh.isPresent());
		}
		
		public void enter() {
			enter.click();
		}
		
		/*private Button photo = new Button(By.linkText("Фотоаппараты"), "photo_onliner");
		private Button wendor = new Button(By.id("lmfr0"), "wendor");
		private Button select = new Button(By.xpath("//id[@value = 'nikon']"), "Nikon");
		private Button type = new Button(By.id("lcam_type"), "type");
		private Button typecamera = new Button(By.xpath("//option[@value = 'mirror']"), "mirror");
		private Button splash = new Button(By.id("lВстроенная вспышка"),"flash");
		private Button searchass = new Button(By.partialLinkText("Nikon"), "Nikon");
		private Label assertseacrh = new Label(By.xpath("//div['зеркальная камера']"), "assertsearch");
		private Button enter = new Button(By.xpath("//input[@name = 'search']"), "search");
		
		public void enter() {
			enter.click();
		}	
		
		public void searchassert(){
			assert(searchass.isPresent());
		}
		
		public void asserts(){
			assert(assertseacrh.isPresent());
		}
		
		public void splash() {
			splash.click();
		}
		
		
		public void photo() {
			photo.click();
		}
		
		public void wendor() {
			wendor.click();
		}				
		
		public void select() {
			browser.waitForPageToLoad();
			select.click();
		}
		
		public void typecam() {
			typecamera.click();
		}	
		
		public void type() {
			type.click(); 
		} */

		
		
		
		
		
		
		public OnlinerParametrSearch() {
			super(By.xpath(formlocator), "parametrs");
			// TODO Auto-generated constructor stub
		}

}
