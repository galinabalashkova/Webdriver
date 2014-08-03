package onliner.test;

import org.testng.annotations.Parameters;

import onliner.test.forms.OnlinerLoginSearch;
import onliner.test.forms.OnlinerPrivateSearch;
import webdriver.BaseTest;

public class OnlinerPrivate extends BaseTest {
	private String login;
	private String password;
	private String loginprivate;
	@Parameters({ "usernameparam", "passwordparam", "usernameprivate"})
	public OnlinerPrivate(String login, String password, String loginprivate) {
		this.login = login;
		this.password = password;
		this.loginprivate = loginprivate;
	}
	public void runTest () {
		
		logger.step(1);
		browser.navigate("http://www.onliner.by/");
		logger.step(2);
		OnlinerPrivateSearch osf = new OnlinerPrivateSearch();
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
		osf.submit2();
		browser.waitForPageToLoad();
		logger.step(8);
		osf.assertlogin();			
		logger.step(9);
		browser.navigate("http://forum.onliner.by/");
		logger.step(10);
		OnlinerPrivateSearch opf = new OnlinerPrivateSearch();
		logger.step(11);
		opf.Users();
		logger.step(12);
		opf.Nicknameen(loginprivate);
		browser.waitForPageToLoad();
		logger.step(13);
		opf.submit1();
		logger.step(14);
		opf.nickname(loginprivate);
		logger.step(15);
		opf.pm();
		logger.step(16);
		opf.h1("11111упячка1111");
		browser.waitForPageToLoad();
		logger.step(17);
		opf.body("Hello! How are you?");
		browser.waitForPageToLoad();
		logger.step(18);
		opf.send();
		logger.step(19);
	}
}
