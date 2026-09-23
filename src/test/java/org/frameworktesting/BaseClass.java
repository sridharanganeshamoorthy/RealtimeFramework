package org.frameworktesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void LaunchBrowser() {
		driver = new ChromeDriver();

	}

	public static void LoadURL(String url) {
		driver.get(url);

	}

	public static void toMaximize() {
		driver.manage().window().maximize();

	}

	public static void toCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

	public static void toTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void fill(WebElement element, String usertext) {
		element.sendKeys(usertext);

	}

	public static void toClick(WebElement element) {
		element.click();

	}

	public static void toQuit() {
		driver.quit();

	}

}
