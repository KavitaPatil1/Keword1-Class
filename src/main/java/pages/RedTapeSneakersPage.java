package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keyword1.Keyword1;

public class RedTapeSneakersPage {
	
	
	@FindBy(css="input[name=\"pincode\"]")
	public WebElement enterpincodetextbox;
	
	@FindBy(css="//button[contains(text(),'Change')]")
	public WebElement clickOnChangebutton;
	
	public RedTapeSneakersPage(){
		PageFactory.initElements(Keyword1.driver, this);
		
	}
	
	public void enterTextInPincodeBox(String pincode) throws InterruptedException { //,By pin) throws InterruptedException {
		//Thread.sleep(5000);
	    
		Keyword1.scrollby(0, 400);
		Keyword1.chromeoptions();
		enterpincodetextbox.sendKeys(pincode);
		//Keyword1.ExplicitWait(pin);

	}
	public void clickOnChangeBtn() {
		// TODO Auto-generated method stub
		clickOnChangebutton.click();

	}

}
