package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keyword1.Keyword1;

public class HomePageMyntra {
	
	@FindBy(xpath="//input[@placeholder=\"Search for products, brands and more\"]")
	 public WebElement entersnekersname;
	
	@FindBy(css="span.myntraweb-sprite.desktop-iconSearch.sprites-search")
	public WebElement clickonsearchicon;
	
	public void enterSneakersNameToSearchBox(String Snekersname) {
		
		entersnekersname.sendKeys(Snekersname);
	}
	public void clickonsearchbutton() {
		clickonsearchicon.click();
		Keyword1.scrollby(0, 200);
	}

	public HomePageMyntra(){
		PageFactory.initElements(Keyword1.driver, this);   //3rd type to pom
	}
	
	
	
	

}
