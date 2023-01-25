package com.amazon;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.AmazonHomepage;
import com.pages.AmazonRedmiMobileUnder_10000Page;

public class AmazonTest extends TestBase {
	/**
	 * Author: Reema
	 */
	
	@Test
	public void VerifyThatRedmiMobileUnder_10000() {
		AmazonHomepage home=new AmazonHomepage();
		AmazonRedmiMobileUnder_10000Page redmi=new AmazonRedmiMobileUnder_10000Page();
		home.enterOnTextBox();
		redmi.clickOnRedmiCheckBox();
		redmi.verifyPricesOfMobileUnder_10000();
	}

}
