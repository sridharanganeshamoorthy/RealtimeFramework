package org.pomframeworktestings;

import org.openqa.selenium.WebElement;

public class Testing extends BaseClass {
	
	public static void main(String[] args) {
		
		
		launchBrowser();
		
		toLoadURL("https://practicetestautomation.com/practice-test-login/");
		
		toMaximize();
		
		toGetTitle();
		
		toGetCurrentURL();
		
		LoginPojo l = new LoginPojo();
		
		WebElement user = l.getTxtUser();
		toFill(user, "Sridharangjava95@gmail.com");
		
		WebElement pass = l.getTxtPass();
		toFill(pass, "Sri123");
		
		WebElement login = l.getBtnLogin();
		toClick(login);
		
		//l.toQuitBrowser();
		
		System.out.println("Code Executed");
		
		
		
		
	}
	
	
	
	

}
