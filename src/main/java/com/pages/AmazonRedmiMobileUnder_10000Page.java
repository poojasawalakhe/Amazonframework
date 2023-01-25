package com.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Base.TestBase;

public class AmazonRedmiMobileUnder_10000Page {
	/**
	 * Author:Reema
	 */
	@FindBy(css = "li[aria-label=\"Redmi\"] label>input+i")
	private WebElement redmiCheckBox;

	@FindBy(css = "span.a-price-symbol+span")
	private List<WebElement> pricesOfRedmiMobile;

	@FindBy(css = "span.a-size-medium")
	private List<WebElement> NamesOfRedmiMobile;

	public AmazonRedmiMobileUnder_10000Page() {
		PageFactory.initElements(TestBase.driver, this);
	}

	public void clickOnRedmiCheckBox() {
		redmiCheckBox.click();

	}

	public void verifyPricesOfMobileUnder_10000() {
		Iterator<WebElement> itr1 = pricesOfRedmiMobile.iterator();
		Iterator<WebElement> itr2 = NamesOfRedmiMobile.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next().getText() + "\t");
			if (itr2.hasNext()) {
				System.out.print(itr2.next().getText());
			}
			System.out.println();
		}
		//Assert.assertFalse(pricesOfRedmiMobile.contains(10000));
		Assert.assertTrue(pricesOfRedmiMobile.contains(10000));

	}

}
