package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keyword1.Keyword1;

public class Sneakers  {
	
	
	@FindBy(css="img[title=\"Red Tape Men Perforated Slip Resistant Lace-Up Sneakers\"]")
	public WebElement Redtapesnakers;
	
	public Sneakers(){
		PageFactory.initElements(Keyword1.driver, this);
	}
	
	public void clickonspecificsneakers() throws InterruptedException {
		Keyword1.ExplicitWait(Redtapesnakers);
		Redtapesnakers.click();
		
			
	}

}
