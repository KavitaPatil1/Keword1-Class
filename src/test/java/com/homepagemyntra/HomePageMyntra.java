package com.homepagemyntra;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.keyword1.Keyword1;

import BaseClass.Base;
import com_BrowserPropertiesReadCode.ReadBrowserName;

public class HomePageMyntra extends Base {

	/*
	 * @Test public void firsttestcase() throws InterruptedException {
	 * 
	 * ReadBrowserName bn = new ReadBrowserName();
	 * 
	 * Keyword1.openBrowser(bn.gereadPropetiesFile("BROWSER_Name")); // ChromeDriver
	 * driver =new ChromeDriver();
	 * Keyword1.openUrl(bn.gereadPropetiesFile("BROWSER_Url"));
	 * 
	 * Keyword1.maximizeWindow();
	 * 
	 * WebElement men = Keyword1.clickonElement("xpath",
	 * "//a[@data-group=\"men\"]");
	 * 
	 * Actions act = new Actions(Keyword1.driver);
	 * act.moveToElement(men).build().perform(); Thread.sleep(2000);
	 * 
	 * String
	 * tshirt=Keyword1.driver.findElement(By.cssSelector("a[href=\"/men-tshirts\"]")
	 * ).getText(); System.out.println(tshirt);
	 * 
	 * 
	 * Keyword1.clickonElement("cssSelector", "a[href=\"/men-tshirts\"]").click();
	 * 
	 * Keyword1.chromeoptions();
	 * 
	 * //Keyword1.scrollby(0, 200);
	 * 
	 * FluentWait wait = new FluentWait<>(Keyword1.driver);
	 * wait.withTimeout(Duration.ofSeconds(50));
	 * wait.pollingEvery(Duration.ofMillis(500));
	 * 
	 * By image1 = By.xpath("//img[contains(@src, '1362228')]");
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(image1)); // Wait for the
	 * element to be clickable Keyword1.driver.findElement(image1).click();
	 * 
	 * 
	 * 
	 * Set<String> resultwindow = Keyword1.driver.getWindowHandles(); for (String
	 * window : resultwindow) { Keyword1.driver.switchTo().window(window);
	 * Keyword1.scrollby(0, 300); if
	 * (Keyword1.driver.getTitle().contains("tshirts")) {
	 * Keyword1.clickonElement("tagname", "button"); }
	 * 
	 * 
	 * }
	 */
	@Test
	public void searchProduct() throws InterruptedException {

		ReadBrowserName bn = new ReadBrowserName();

		// Keyword1.openBrowser(bn.gereadPropetiesFile("BROWSER_Name"));

		// Keyword1.openUrl(bn.gereadPropetiesFile("BROWSER_Url"));

		Keyword1.maximizeWindow();

		Keyword1.clickonElement("xpath", "//input[@placeholder=\"Search for products, brands and more\"]")
				.sendKeys("sneakers");
		Keyword1.clickonElement("cssselector", "span.myntraweb-sprite.desktop-iconSearch.sprites-search").click();

		Keyword1.scrollby(0, 200);
		FluentWait wait = new FluentWait<>(Keyword1.driver);
		wait.withTimeout(Duration.ofSeconds(40));
		wait.pollingEvery(Duration.ofMillis(300));

		By value = By.xpath("//img[contains(@src,'RedTapeMenWhiteWovenDesignSneakers1.jpg')]");
		wait.until(ExpectedConditions.elementToBeClickable(value));
		Keyword1.driver.findElement(value).click();

		Thread.sleep(200);
		Set<String> windowHandles = Keyword1.driver.getWindowHandles();

		FluentWait wait1 = new FluentWait<>(Keyword1.driver);

		for (String windowHandle : windowHandles) {
			Keyword1.driver.switchTo().window(windowHandle);

			if (Keyword1.driver.getTitle().equalsIgnoreCase("Buy red tape men")) {
				System.out.println("Welcome to the new window");

				Keyword1.scrollby(0, 300);

				By pincode = By.xpath("//input[@placeholder='Enter pincode']");
				wait.until(ExpectedConditions.elementToBeClickable(pincode));
				Keyword1.driver.findElement(pincode).sendKeys("411035");
				System.out.println("Pincode entered successfully.");

			}

		}

	}

	@Test
	public void usingPageObjectModel() throws InterruptedException {
		// 1st type of implement to pageobjectmodel
		/*
		 * pages.HomePageMyntra hm=new pages.HomePageMyntra(); //not initialized
		 * hm.enterSneakersNameToSearchBox("sneakers");
		 */

		// 2nd type of implement to pageobjectmodel
		/*
		 * pages.HomePageMyntra
		 * hm=PageFactory.initElements(Keyword1.driver,pages.HomePageMyntra.class );
		 * hm.enterSneakersNameToSearchBox("sneakers");
		 */

		// 3rd type of implement to pageobjectmodel

		pages.HomePageMyntra hm = new pages.HomePageMyntra();
		hm.enterSneakersNameToSearchBox("sneakers");
		hm.clickonsearchbutton();

		String mainpage = Keyword1.driver.getWindowHandle();
		pages.Sneakers sk = new pages.Sneakers();

		sk.clickonspecificsneakers();

		Set<String> WindowHandles = Keyword1.driver.getWindowHandles();
		for (String window : WindowHandles) {

			if (!window.equals(mainpage)) {
				Keyword1.driver.switchTo().window(window);

				break;

			}
		}

		pages.RedTapeSneakersPage rt = new pages.RedTapeSneakersPage();

		rt.enterTextInPincodeBox("411035");
		rt.clickOnChangeBtn();
		
		

	}
}