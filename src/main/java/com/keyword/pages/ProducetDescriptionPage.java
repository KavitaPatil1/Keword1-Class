package com.keyword.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProducetDescriptionPage {

	@FindBy(css = "ul.gender-list>li:nth-child(1)")
	public WebElement menfilter;

	@FindBy(css = "h4.product-product")
	public List<WebElement> productdescription;

	public void selectMenFileter() {
		menfilter.click();

	}

	public List<String> getproductdescription() {

		List<String> description = new ArrayList<String>();
		for (WebElement descriptionsnew : productdescription) {
			description.add(descriptionsnew.getText());
		}

		return description;
	}

}
