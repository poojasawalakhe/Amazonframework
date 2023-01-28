package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Keywords.Keywords;

public class CartPage {
	@FindBy (xpath="//span[@class='nav-cart-icon nav-sprite']")
	public WebElement addCart;
	
	@FindBy (xpath="//span[@class='a-size-base-plus a-color-base sc-product-title sc-grid-item-product-title']")
	public WebElement productnameincart;
	
	
	public CartPage() {
	PageFactory.initElements(Keywords.driver,this);
	}
	public void toClickOnCartSymbol(){
		Keywords.moveToElementAndClick(addCart);
		
	}
	

}
