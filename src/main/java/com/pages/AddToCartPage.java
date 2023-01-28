package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Keywords.Keywords;

public class AddToCartPage {
	@FindBy (xpath = "//span[text()='Add to Cart']")
	public WebElement addtocartButton ;
	
	
	public AddToCartPage() {
		PageFactory.initElements(Keywords.driver, this);
	}
	
	public void toClickOnAddToCartButton(){
		Keywords.moveToElementAndClick(addtocartButton);
		
	}
	
	
	
	
	

}





