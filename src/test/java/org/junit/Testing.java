package org.junit;



import java.util.Date;

import org.frameworktesting.BaseClassAllMethods;
import org.pomframeworktestings.LoginPojo;

public class Testing extends BaseClassAllMethods {
	
	//Annotation execution order 
	//@BeforeClass
	//@Before
	//@Test
	//@After
	//@AfterClass
	
	@BeforeClass
	public static void befClass() {
		Date d = new Date();
		
		System.out.println(d);

	}
	
	@AfterClass
	public static void aftClass() {
		Date d = new Date();
		
		System.out.println(d);

	}
	
	@Before
	public void bef() {
		launchBrowser();
		toLoadURL("https://practicetestautomation.com/practice-test-login/");
		toMaximize();

	}
	@After
	public void aft() {
		toQuitBrowser();
		System.out.println("Program is Executed Fully");

	}
	
	@Test
	public void test1() {
		LoginPojo l = new LoginPojo();     //pojoclass for webelement stored class
		
		toFill(l.getTxtUser(),"Sridharangjava95@gmail.com"); //here toFill is baseclassmethod, l is pojo class ref and getTextUser 
		toFill(l.getTxtPass(), "Sri123");
		toClick(l.getBtnLogin());

	}
	
	@Ignore
	@Test
	public void test2() {
		LoginPojo l = new LoginPojo();     //pojoclass for webelement stored class
		
		toFill(l.getTxtUser(),"Mukesh@gmail.com"); //here toFill is baseclassmethod, l is pojo class ref and getTextUser 
		toFill(l.getTxtPass(), "Muki123");
		toClick(l.getBtnLogin());

	}
	
	@Test
	public void test3() {
		LoginPojo l = new LoginPojo();
		
		toFill(l.getTxtUser(), "Vijay123@gmail.com");
		toFill(l.getTxtPass(), "vijay123");
		
		toClick(l.getBtnLogin());

	}
	

}
