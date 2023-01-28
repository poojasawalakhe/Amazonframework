package com.amazon;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.pages.Homepage;
import com.wait.Wait;
@Listeners
public class ChooseLanguageForShoppingTest  {
	@Test
	public void chooseLanguageForShopping() {

		/*
		 * Actions action = new Actions(driver); WebElement language =
		 * driver.findElement(By.xpath(
		 * "//div[@id='nav-tools']/child::a[@id='icp-nav-flyout']"));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 * 
		 * action.moveToElement(language).perform(); Thread.sleep(2000);
		 * 
		 * // WebElement english = // // driver.findElement(By.
		 * xpath("//div[@id='nav-flyout-icp']/div/following-sibling::div[@class='nav-template // nav-flyout-content //nav-tpl-itemList']/span/span/i/following-sibling::span[text()='English']"
		 * )); driver.findElement(By.xpath(
		 * "//div[@id='nav-flyout-icp']/div/following-sibling::div[@class='nav-template nav-flyout-content nav-tpl-itemList']/span/following-sibling::a/span/span[text()='हिन्दी']"
		 * )) .click(); String actuallamguageselected = driver
		 * .findElement(By.xpath("//span[@class='nav-line-2']/child::div[text()='HI']"))
		 * .getText(); String expectedlamguageselected = "HI";
		 * Assert.assertEquals(actuallamguageselected, expectedlamguageselected); }*/
		 

		Homepage home = new Homepage();
		
		Wait.waitFor(2);
		home.selectLanguageforShopping();
		String expectedlamguageselected = "HI";
		String actuallamguageselected = home.ActualSelectedLanguage.getText();
		Assert.assertEquals(actuallamguageselected, expectedlamguageselected);

	}
}