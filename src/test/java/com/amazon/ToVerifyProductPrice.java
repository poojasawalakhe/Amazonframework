package com.amazon;

import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hc.core5.util.Asserts;
import org.apache.xmlbeans.GDuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.TestBase;

@Listeners
public class ToVerifyProductPrice extends TestBase {
	@Test
	public void toVerifySelectedProductPriceWithinRange() {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		/*
		 * driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).
		 * click();
		 * driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).
		 * sendKeys("headphones");
		 */
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headphones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.name("low-price")).sendKeys("1000");
		driver.findElement(By.name("high-price")).sendKeys("1500");
		driver.findElement(By.xpath("//span[@id='a-autoid-1']")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (WebElement price : prices) {
			String priceofproduct = price.getText();

			System.out.println("Price " + priceofproduct);
			Pattern p = Pattern.compile("\\d+/b+");
			Matcher m = p.matcher(priceofproduct);
			while (m.find()) {
				String price111 = m.group();
				// int number = Integer.parseInt(price111);
				System.out.println("Price after regular expressin" + price111);
			}

			System.out.println("end of logic");

		}

	}

}
