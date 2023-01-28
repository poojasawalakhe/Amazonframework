package com.Keywords;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import com.Base.TestBase;
import com.exception.InvalidBrowserNameException;

public class Keywords extends TestBase {
	public static void openBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			throw new InvalidBrowserNameException(browsername);
		}
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void findElement1(String xpath) {
		driver.findElement(By.xpath(xpath));
	}
	public static void click(String WebElement) {
		
	}
	public void enterText(WebElement element, String text) {

		element.sendKeys(text);
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("ID")) {
			return driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("XPATH")) {
			return driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("CSS")) {
			return driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("CLASS")) {
			return driver.findElement(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("NAME")) {
			return driver.findElement(By.name(locatorValue));
		} else if (locatorType.equalsIgnoreCase("tagName")) {
			return driver.findElement(By.xpath(locatorValue));
		} else {
			System.err.println("Invalid locator type");
			return null;
		}

	}

	

	public static void enterText(String locator, String text) {
		String locatorType = locator.split("##")[0];
		String locatorValue = locator.split("##")[1];
		getWebElement(locatorType, locatorValue).sendKeys(text);

	}

	
	public static void clickOn (WebElement element) {
		element.click();

	}

	public static void clickOn(String locator) {
		String locatorType = locator.split("##")[0];
		String locatorValue = locator.split("#")[1];
		getWebElement(locatorType, locatorValue).click();

	}

	public void hitKey(String locatorType, String locatorValue, Keys key) {
		getWebElement(locatorType, locatorValue).sendKeys(key);

	}

	public static void hitKey(int keyCode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keyCode);

	}

	/*public static List<String> getTexts(String locatorType, String locatorValue) {
		List<String> items = new ArrayList<String>();
		List<WebElement> elements = getWebElements(locatorType, locatorValue);
		for (WebElement element : elements) {
			items.add(element.getText());
		}
		return items;
	}*/
	/*public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(getWebElement("xpath", " ")).build().perform();

	}*/
	
	public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

		//Keywords.moveToElement(languageNameList);
	}
	public static void enterText1(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	public static void moveToElementAndClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

		//Keywords.moveToElement(languageNameList);
	}
	public static void toHandleMultipleWindows(){
		String currentwindow = Keywords.driver.getWindowHandle();
		Set<String> allwindows = Keywords.driver.getWindowHandles();
		for (String window : allwindows) {
			if (!currentwindow.equalsIgnoreCase(window)) {
				Keywords.driver.switchTo().window(window);
		
	}
	
}}}

