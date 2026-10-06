package org.frameworktesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//if its diff package then have to import package
public class MavenCheck extends BaseClass {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
		LaunchBrowser();
//
//		driver.get("https://www.calculator.net/my-account/sign-in.php");
		LoadURL("https://www.calculator.net/my-account/sign-in.php");
//
//		driver.manage().window().maximize();
		toMaximize();
//
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		toCurrentURL();
//
//		String title = driver.getTitle();
//		System.out.println(title);
		toTitle();
//
		WebElement email = driver.findElement(By.name("email"));
//		email.sendKeys("supersridhar4@gmail.com");
		fill(email, "sridharangjava95@gmail.com");
		
//
		WebElement pass = driver.findElement(By.name("password"));
//		pass.sendKeys("Sridharan");
		fill(pass, "sri");
//
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
//
//		submit.click();
		toClick(submit);
//
//		driver.quit();
		toQuit();
	}

}
