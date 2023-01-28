package com.wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.TestBase;

public class Wait extends TestBase {
	

	public static void waitFor(int sec){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
	
	public static void waitFor() {
		FluentWait <WebDriver> wait = new FluentWait <WebDriver> (driver);
		wait.withTimeout(Duration.ofSeconds(2));
	}

}
