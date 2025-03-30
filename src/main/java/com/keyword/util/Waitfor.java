package com.keyword.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.keyword.UIKeywords;

public class Waitfor {

	public static FluentWait<WebDriver> wait;
	static {
		wait = new FluentWait<WebDriver>(UIKeywords.driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(500));

	}

	public static void elemetToBeClicakable(String loactortype, String locator) {
		By element = getWebElement(loactortype, locator);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static By getWebElement(String loactortype, String locator) {
		By element = null;
		if (loactortype.equalsIgnoreCase("css")) {
			element = By.cssSelector(locator);
		} else if (loactortype.equalsIgnoreCase("xpth")) {
			element = By.xpath(locator);

		} else if (loactortype.equalsIgnoreCase("Id")) {
			element = By.id(locator);

		} else if (loactortype.equalsIgnoreCase("ClassName")) {
			element = By.className(locator);

		}
		return element;
	}

	public static void elemnetToBepresent(String loactortype, String locator) {
		By element = getWebElement(loactortype, locator);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
}