package org.junit;

import java.util.Date;

import org.frameworktesting.BaseClassAllMethods;
import org.pomframeworktestings.LoginPojo;

public class Login3 extends BaseClassAllMethods {

	@BeforeClass
	public static void befClass() {
		Date d = new Date();

		System.out.println(d);

	}

	@Before
	public void bef() {
		launchBrowser();
		toLoadURL("https://practicetestautomation.com/practice-test-login/");
		toMaximize();

	}

	@Test
	public void test1() {
		LoginPojo l = new LoginPojo();
		toFill(l.getTxtUser(), "Sri123@gmail.com");

		String user = toGetAttribute(l.getTxtUser());
		Assert.assertTrue("I am validating user field", "Sri123@gmail.com".equals(user)); //False

		toFill(l.getTxtPass(), "sri123");

		String pass = toGetAttribute(l.getTxtPass());
		Assert.assertEquals("I am validating password field", pass, "Sridharan123");

		toClick(l.getBtnLogin());

	}

	@Test
	public void test2() {
		LoginPojo l = new LoginPojo();
		toFill(l.getTxtUser(), "Mukesh123@gmail.com");
		toFill(l.getTxtPass(), "Mukesh123");
		toClick(l.getBtnLogin());

	}

	@Test
	public void test3() {
		LoginPojo l = new LoginPojo();
		toFill(l.getTxtUser(), "Vijay123@gmail.com");
		toFill(l.getTxtPass(), "Vijay123");
		toClick(l.getBtnLogin());

	}

	@After
	public void aft() {
		toQuitBrowser();

	}

	@AfterClass
	public static void aftClass() {
		Date d = new Date();

		System.out.println(d);

	}

}
