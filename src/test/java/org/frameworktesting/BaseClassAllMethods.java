package org.frameworktesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassAllMethods {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;

	// Browser methods

	public static void launchBrowser() {
		
		ChromeOptions options = new ChromeOptions();

	    options.addArguments("--headless");
	    options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("--disable-gpu");
	    options.addArguments("--window-size=1920,1080");
	    
		driver = new ChromeDriver(options);
	}
	
	public static void toLoadURL(String url) {
		driver.get(url);
	}
	
	public static void toMaximize() {
		driver.manage().window().maximize();

	}

	public static void toNavigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void toBack() {
		driver.navigate().back();
	}

	public static void toForward() {
		driver.navigate().forward();
	}

	public static void toRefresh() {
		driver.navigate().refresh();
	}

	public static void toQuitBrowser() {
		driver.quit();
	}
	public static void toCloseBrowser() {
		driver.close();
	}

	public static void toGetTitle() {
		System.out.println("Page Title: " + driver.getTitle());
	}

	public static void toGetCurrentURL() {
		System.out.println("Current URL: " + driver.getCurrentUrl());
	}

	public static void toGetPageSource() {
		System.out.println("Page Source: " + driver.getPageSource());
	}

	// WebElement methods

	public static WebElement find(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> findAll(By locator) {
		return driver.findElements(locator);
	}

	public static void toClick(WebElement e) {
		e.click();
	}

	public static void toFill(WebElement e, String text) {
		e.sendKeys(text);
	}

	public static void toClear(WebElement e) {
		e.clear();
	}

	public static void toSubmit(WebElement e) {
		e.submit();
	}

	public static void toGetText(WebElement e) {
		System.out.println("Element Text: " + e.getText());
	}

	public static String toGetAttribute(WebElement e) {
		//System.out.println("Attribute [" + attr + "]: " + e.getAttribute(attr));
		String attribute = e.getAttribute("value");
		return attribute;
	}

	public static void toGetTagName(WebElement e) {
		System.out.println("Tag Name: " + e.getTagName());
	}

	public static void toIsDisplayed(WebElement e) {
		System.out.println("Is Displayed: " + e.isDisplayed());
	}

	public static void toIsEnabled(WebElement e) {
		System.out.println("Is Enabled: " + e.isEnabled());
	}

	public static void toIsSelected(WebElement e) {
		System.out.println("Is Selected: " + e.isSelected());
	}

	public static void toGetLocation(WebElement e) {
		System.out.println("Location: " + e.getLocation());
	}

	public static void toGetSize(WebElement e) {
		System.out.println("Size: " + e.getSize());
	}

	// Frames & Windows methods

	public static void toSwitchFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void toSwitchFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public static void toSwitchFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}

	public static void toDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void toGetWindowHandle() {
		System.out.println("Window Handle: " + driver.getWindowHandle());
	}

	public static void toGetWindowHandles() {
		System.out.println("Window Handles: " + driver.getWindowHandles());
	}

	public static void toSwitchWindow(String handle) {
		driver.switchTo().window(handle);
	}

	public static void toSwitchWindowByTitle(String title) {
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
			if (driver.getTitle().equals(title))
				break;
		}
	}

	// Alerts methods

	public static void toAcceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void toDismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static void toGetAlertText() {
		System.out.println("Alert Text: " + driver.switchTo().alert().getText());
	}

	// Dropdown methods

	public static void toSelectByText(WebElement e, String text) {
		new Select(e).selectByVisibleText(text);
	}

	public static void toSelectByValue(WebElement e, String value) {
		new Select(e).selectByValue(value);
	}

	public static void toSelectByIndex(WebElement e, int index) {
		new Select(e).selectByIndex(index);
	}

	public static void toGetDropdownOptions(WebElement e) {
		List<WebElement> options = new Select(e).getOptions();
		System.out.println("Dropdown Options: ");
		for (WebElement opt : options)
			System.out.println(opt.getText());
	}

	public static void toIsMultipleSelect(WebElement e) {
		System.out.println("Is Multiple: " + new Select(e).isMultiple());
	}

	// Actions methods

	public static void toActionClick(WebElement e) {
		a = new Actions(driver);
		a.click(e).perform();
	}

	public static void toDoubleClick(WebElement e) {
		a.doubleClick(e).perform();
	}

	public static void toContextClick(WebElement e) {
		a.contextClick(e).perform();
	}

	public static void toMoveTo(WebElement e) {
		a.moveToElement(e).perform();
	}

	public static void toDragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	public static void toSendKeys(CharSequence keys) {
		a.sendKeys(keys).perform();
	}

	// Robot methods

	public static void toPressEnter() throws AWTException {

		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toPressTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toPressEscape() {
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public static void toPressControl() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toPressDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toPaste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void toCopy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// JavaScript Executor methods

	public static void jsClick(WebElement e) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", e);
	}

	public static void jsSetAttribute(WebElement e, String attr, String val) {
		js.executeScript("arguments[0].setAttribute('" + attr + "', '" + val + "');", e);
	}

	public static void jsGetAttribute(WebElement e, String attr) {
		System.out.println("JS Attribute [" + attr + "]: "
				+ js.executeScript("return arguments[0].getAttribute('" + attr + "');", e));
	}

	// Screenshots methods

	public static void screenshotToFile(String path) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		System.out.println("Screenshot saved to: " + path);
	}

}
