package onliner.test;

import onliner.test.forms.OnlinerSearchForums;
import webdriver.BaseTest;

public class OnlinerSearchForum extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://onliner.by/");
		logger.step(2);
		OnlinerSearchForums ops = new OnlinerSearchForums();
		logger.step(3);
		ops.forum();
		logger.step(4);
		ops.gsearchBar("Canon");
		browser.waitForPageToLoad();
		logger.step(5);
		ops.searchassert();
		logger.step(6);
	}
}
