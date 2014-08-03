package onliner.test;

import onliner.test.forms.OnlinerMeteoSearch;
import webdriver.BaseTest;

public class OnlinerMeteo extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://onliner.by/");
		logger.step(2);
		OnlinerMeteoSearch oms = new OnlinerMeteoSearch();
		logger.step(3);
		oms.weather();
		logger.step(4);
		oms.assertweather();
		logger.step(5);
		
	}
}
