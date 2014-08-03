package onliner.test;


import onliner.test.forms.OnlinerRulesSearch;
import webdriver.BaseTest;

public class OnlinerRules extends BaseTest {
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://onliner.by/");
		logger.step(2);
		OnlinerRulesSearch ors = new OnlinerRulesSearch();
		ors.forum();
		logger.step(3);
		ors.rules();
		logger.step(4);
		ors.assertrules();
		logger.step(5);
	}


}
