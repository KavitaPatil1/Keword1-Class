package com.keyword1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.error.exception.InvalidBrwserName;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Keyword1 extends Base {
	
	public static RemoteWebDriver driver;
	
	public static void openBrowser(String BrowserName)  {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}else if(BrowserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else if(BrowserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			//throw new InvalidBrwserName();
		}
	
	}
	public static void openUrl(String URL) {
		// TODO Auto-generated method stub
		driver.get(URL);

	}
	public static void maximizeWindow() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();

	}
	public static WebElement clickonElement(String LocatorName,String LocatorValue) {
		// TODO Auto-generated method stub
		if(LocatorName.equalsIgnoreCase("CSSSelector")) {
			return driver.findElement(By.cssSelector(LocatorValue));
		}else if(LocatorName.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(LocatorValue));
		}else if(LocatorName.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(LocatorValue));
		}else if(LocatorName.equalsIgnoreCase("linktext")) {
			return driver.findElement(By.partialLinkText(LocatorValue));
		}else if(LocatorName.equals(LocatorValue)) {
			return driver.findElement(By.tagName("tagname"));
		}
		
      return null;
	}
	public static void scrollby(int x,int y) {
		// TODO Auto-generated method stub
		driver.executeScript("window.scrollBy(arguments[0], arguments[1])",x,y);

	}
	
	  public static void ExplicitWait(WebElement redtapesnakers) {
	 
	 FluentWait<WebDriver> wait = new FluentWait(driver);
	 wait.withTimeout(Duration.ofSeconds(300));
	  wait.pollingEvery(Duration.ofMillis(500));
	  wait.until(ExpectedConditions.elementToBeClickable(redtapesnakers));
	  
	  }
	 
	public static void chromeoptions() {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		

	}
	public static void enterElement(String locatortype,String locatorvalue,String entertotext) {
		// TODO Auto-generated method stub
		if(locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).sendKeys(entertotext);
		}else if(locatortype.equalsIgnoreCase("cssselector")) {
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(entertotext);
		}

	}
	
}
	


