package onliner.test;

import onliner.test.forms.OnlinerSortSearch;
import webdriver.BaseTest;

public class OnlinerSort extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://catalog.onliner.by/");
		logger.step(2);
		OnlinerSortSearch oss = new OnlinerSortSearch();
		logger.step(3);
		oss.photo();
		logger.step(4);
		oss.cost();
		browser.waitForPageToLoad();
		oss.assertenabled("price");
		logger.step(5);
		oss.name();
		oss.assertenabled("name");
		logger.step(6);
		oss.rate();
		oss.assertenabled("rating");
		logger.step(7);
		oss.data();
		oss.assertenabled("date");
		logger.step(8);
		
	}

}
