package onliner.test;

import onliner.test.forms.OnlinerParametrSearch;
import webdriver.BaseTest;


public class OnlinerParametr extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://catalog.onliner.by/");
		logger.step(2);
		OnlinerParametrSearch ops = new OnlinerParametrSearch();
		logger.step(3);
		ops.photo();
		logger.step(4);
		ops.typecamera();
		logger.step(5);		
		ops.splash();
		browser.waitForPageToLoad();
		logger.step(6);
		ops.enter();
		logger.step(7);
		/*browser.waitForPageToLoad();
		ops.typecam();
		logger.step(8);
		ops.splash();
		logger.step(9);
		ops.enter();*/
		logger.step(10);
		ops.asserts();
		
	}

	
	
}
