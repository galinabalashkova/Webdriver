package onliner.test;

import onliner.test.forms.OnlinerSearchBaraholkas;
import webdriver.BaseTest;

public class OnlinerSearchBaraholka extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://onliner.by/");
		logger.step(2);
		OnlinerSearchBaraholkas ops = new OnlinerSearchBaraholkas();
		logger.step(3);
		ops.baraholka();
		logger.step(4);
		ops.gsearchBar("Canon");
		browser.waitForPageToLoad();
		logger.step(5);
		ops.searchassert();
		logger.step(6);
	}
}
