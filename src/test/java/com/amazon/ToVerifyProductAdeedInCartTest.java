package com.amazon;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.Keywords.Keywords;
import com.pages.AddToCartPage;
import com.pages.CartPage;
import com.pages.Homepage;
import com.pages.ProductListOfSearchedProductPage;

@Listeners
public class ToVerifyProductAdeedInCartTest extends TestBase {
	@Test
	public void toVerifyProductAdeedInCart() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		/*
		 * Actions action = new Actions(driver);
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(
		 * "headphones");
		 * driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click
		 * (); driver.findElement(By.
		 * xpath("//span[text()='Logitech H111 Wired On Ear Headphones With Mic Black']"
		 * )).click(); String currentwindow = driver.getWindowHandle(); Set<String>
		 * allwindows = driver.getWindowHandles(); for (String window : allwindows) { if
		 * (!currentwindow.equalsIgnoreCase(window)) { driver.switchTo().window(window);
		 * 
		 * WebElement addtocartbutton =
		 * driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		 * action.moveToElement(addtocartbutton).click().build().perform(); } } for
		 * (String window1 : allwindows) { if (!currentwindow.equalsIgnoreCase(window1))
		 * { driver.switchTo().window(window1); WebElement cartlogo =
		 * driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		 * action.moveToElement(cartlogo).click().build().perform(); WebElement
		 * productnameincart = driver.findElement(By.xpath(
		 * "//span[@class='a-size-base-plus a-color-base sc-product-title sc-grid-item-product-title']"
		 * )); String actualexpectedproductincart = productnameincart.getText();
		 * //System.out.println(actualexpectedproductincart);
		 * 
		 * 
		 * String expectedproductincart =
		 * "Logitech H111 Wired On Ear Headphones With Mic Black";
		 * Assert.assertEquals(actualexpectedproductincart, expectedproductincart); }
		 * 
		 * }
		 */
		Homepage home = new Homepage();
		AddToCartPage addtocart = new AddToCartPage();
		ProductListOfSearchedProductPage productlist = new ProductListOfSearchedProductPage();
		CartPage cart = new CartPage();
		
		home.toSearchProduct();
		productlist.toClickOnProductToAddInCart();
		Keywords.toHandleMultipleWindows();
		addtocart.toClickOnAddToCartButton();
		Keywords.toHandleMultipleWindows();
		cart.toClickOnCartSymbol();
		String expectedproductincart = "Logitech H111 Wired On Ear Headphones With Mic Black";
		String actualexpectedproductincart = cart.productnameincart.getText();
		Assert.assertEquals(actualexpectedproductincart, expectedproductincart);
	}
}
