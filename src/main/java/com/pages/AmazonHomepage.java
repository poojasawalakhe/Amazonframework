package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class AmazonHomepage {
	/**
	 * Author:Reema
	 */
	@FindBy(css = "input#twotabsearchtextbox")
	private WebElement TextBox;

	public AmazonHomepage() {
       PageFactory.initElements(TestBase.driver, this);
	}

	public void enterOnTextBox() {
		TextBox.sendKeys("mobile under 10000");
		TextBox.sendKeys(Keys.ENTER);

	}

}
