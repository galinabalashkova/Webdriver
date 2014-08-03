package onliner.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class OnlinerSearchForums extends BaseForm {
	private static String formlocator="//body['data-twttr-rendered']";
	
	private TextBox gsearchBar = new TextBox(By.id("g-search-input"), "search_bar");
	private Button btnSubmitSearch = new Button(By.xpath("//button[@type='submit']"),"search button");
	private Button searchassert = new Button(By.partialLinkText("Canon"), "Canon");
	private Button forum = new Button(By.linkText("Форум"),"forum");
	
	public void forum() {
		forum.click();
	}
			
	public void gsearchBar(String text) {
				gsearchBar.type(text);
		    	btnSubmitSearch.click();
		    }
	
	public void searchassert(){
		assert(searchassert.isPresent());
	}
	
	
	public OnlinerSearchForums() {
		super(By.xpath(formlocator), "searchcatalog");
		// TODO Auto-generated constructor stub
	}

}
