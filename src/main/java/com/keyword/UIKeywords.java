package com.keyword;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.keyword.exceptions.InvalidBrowserNameException;
import com.keyword.util.Fileutility;

public class UIKeywords {
	
	
	public static  RemoteWebDriver driver;
	public  static void openBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else {
			throw new InvalidBrowserNameException(browsername);
		}

	}
	
	public static  void launchAppUrl(String env) {
	Fileutility fileutility=new Fileutility();
	String baseurl=System.getProperty("user.dir");
	String url=fileutility.readproprty(baseurl+"/src/main/resources/environment.properties", "app."+env+".url");
	driver.get(url);

	}
	public static void clickonElemnet1(String locator) {
		driver.findElement(By.xpath(locator)).click();

	}
	public static void clickontheElement(String locator) {
		driver.findElement(By.xpath(locator)).click();
		

	}
	public static void entertext(String locator,String text) {
		driver.findElement(By.xpath(locator)).sendKeys(text);

	}
	public static void maximizewindow() {
		driver.manage().window().maximize();

	}
	public static List<String> gettexts(String locator) {
		List<WebElement>items=driver.findElements(By.xpath(locator));
		List<String>itemtexts=new ArrayList<String>();
		for(WebElement item:items) {
			itemtexts.add(item.getText());
		}
		
return itemtexts;
	}
	public static String gettext(String loactor) {
	return driver.findElement(By.xpath(loactor)).getText();
	

	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
