package com.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	
}
