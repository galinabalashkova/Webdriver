package onliner.test;


import onliner.test.forms.*;
import webdriver.BaseTest;

public class OnlinerLoginTwo extends BaseTest {
	
	public void runTest() {
		
		logger.step(1);
		browser.navigate("http://www.onliner.by/");
		logger.step(2);
		OnlinerLoginTwoSearch osf = new OnlinerLoginTwoSearch();
		osf.assertlogo();
		logger.step(3);
		osf.submit();
		logger.step(4);
		osf.login("Spring_Storm");
		logger.step(5);
		osf.password("1364781");
		logger.step(6);
		osf.enter();
		logger.step(7);
		osf.assertlogin();
		logger.step(8);
		
	
	}

}
