package onliner.test;

import onliner.test.forms.OnlinerSearchCatalogs;
import webdriver.BaseTest;

public class OnlinerSearchCatalog extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://onliner.by/");
		logger.step(2);
		OnlinerSearchCatalogs ops = new OnlinerSearchCatalogs();
		logger.step(3);
		ops.gsearchBar("Canon");
		browser.waitForPageToLoad();
		logger.step(4);
		ops.searchassert();
		logger.step(5);
	}

}
