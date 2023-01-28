package com.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;
import com.Keywords.Keywords;

public class Homepage   {

	@FindBy(xpath = "//div[@id='nav-tools']/child::a[@id='icp-nav-flyout']")
	public WebElement languageNameList;

	@FindBy(xpath = "//div[@id='nav-flyout-icp']/div/following-sibling::div[@class='nav-template nav-flyout-content nav-tpl-itemList']/span/following-sibling::a/span/span[text()='हिन्दी']")
	public WebElement selectedLanguageHindi;

	@FindBy(xpath = "//span[@class='nav-line-2']/child::div[text()='HI']")
	public WebElement ActualSelectedLanguage;

	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchBox ;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	public WebElement submitButton ;
	

	public Homepage() {
		PageFactory.initElements(Keywords.driver, this); // to crate object of page class keywords.driver=driver

	}

	/**
	 * author Pooja Sawalakhe "this method is select the language name from list and
	 * on page appear data in selected language"
	 */
	public  void selectLanguageforShopping() {
		/*Actions action = new Actions(driver);
		action.moveToElement(languageNameList).build().perform();*/

		Keywords.moveToElement(languageNameList);
		Keywords.clickOn(selectedLanguageHindi);
		
	}
	/** @author Pooja s
	 * this metod is used to verify product added in cart is as per selected or not
	 */
	public void toSearchProduct(){
		Keywords.clickOn(searchBox);
		Keywords.enterText1(searchBox, "headphones");
		Keywords.clickOn(submitButton);
		
		
				
				
	}}
		
	

	


