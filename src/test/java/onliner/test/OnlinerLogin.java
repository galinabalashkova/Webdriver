package onliner.test;

import onliner.test.forms.OnlinerLoginSearch;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import webdriver.BaseTest;

public class OnlinerLogin extends BaseTest {
	private String login;
	private String password;
	@Parameters({ "usernameparam", "passwordparam"})
	public OnlinerLogin(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://www.onliner.by/");
		logger.step(2);
		OnlinerLoginSearch osf = new OnlinerLoginSearch();
		logger.step(3);
		osf.assertlogo();
		logger.step(4);
		osf.login(login);
		logger.step(5);
		osf.passwordclick();
		logger.step(6);
		osf.password(password);
		logger.step(7);
		browser.waitForPageToLoad();
		osf.submit();
		browser.waitForPageToLoad();
		logger.step(8);
		osf.assertlogin();
		
	}

}
