package com.keyword.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	@FindBy(css="input.desktop-searchBar")
	public WebElement SearchCompoennet;
	
	public String  searchproduct(String productname) {
		SearchCompoennet.sendKeys(productname,Keys.ENTER);
		return productname;
		
	}

	
	
	
	
	
	

}
