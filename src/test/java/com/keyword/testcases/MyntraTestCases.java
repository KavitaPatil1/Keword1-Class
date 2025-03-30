package com.keyword.testcases;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.keyword.UIKeywords;
import com.keyword.base.TestBase;
import com.keyword.pages.Homepage;
import com.keyword.pages.ProducetDescriptionPage;
import com.keyword.util.Locator;
import com.keyword.util.OR;
import com.keyword.util.Waitfor;

public class MyntraTestCases extends TestBase {
/*	
	@Test
	public void verifysearchproduct() {
		UIKeywords.maximizewindow();
		
		//UIKeywords.entertext(OR.getlocator("homepage.saerchbar"),"Levis"+ Keys.ENTER);
		UIKeywords.entertext(Locator.homepage_saerchbar,"levis"+Keys.ENTER);
	Waitfor.elemetToBeClicakable(OR.getlocator("formen.filter"));
		
		UIKeywords.clickonElemnet1(OR.getlocator("formen.filter"));
		List<String>productdescription=UIKeywords.gettexts(OR.getlocator("total.Product.description"));
		
		for(String productdescriptions:productdescription ) {
			Assert.assertTrue(productdescriptions.contains("men"));
		}
		

	}
	*/
@Test
	public  void verifysearchproductUsingPOM() {
		
		UIKeywords.maximizewindow();
	//	Homepage home=new Homepage();///it is not initialize the webelement so that we use pagefactory class
		Homepage home=PageFactory.initElements(UIKeywords.driver, Homepage.class);
		home.searchproduct("levis");
		//Waitfor.elemetToBeClicakable("menfilter");
		ProducetDescriptionPage pdp=PageFactory.initElements(UIKeywords.driver, ProducetDescriptionPage.class);
		//ProducetDescriptionPage pdp=new ProducetDescriptionPage();
		pdp.selectMenFileter();
		pdp.getproductdescription();
		List<String>productdescription=pdp.getproductdescription();
		for(String descrip:productdescription ) {
		Assert.assertTrue(descrip.contains("Men"+descrip));
		}
		
		
		
	}
	
	
}
