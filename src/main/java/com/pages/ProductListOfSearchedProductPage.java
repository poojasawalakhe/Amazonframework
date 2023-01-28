package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Keywords.Keywords;

public class ProductListOfSearchedProductPage {
	@FindBy (xpath = "//span[text()='Logitech H111 Wired On Ear Headphones With Mic Black']")
	public WebElement selectproducttoadd ;
	
	public ProductListOfSearchedProductPage() {
		PageFactory.initElements(Keywords.driver, this);
	}
	
	public  void toClickOnProductToAddInCart(){
		Keywords.clickOn(selectproducttoadd);
		
	}
	
	
}
