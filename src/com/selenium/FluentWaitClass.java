package com.selenium;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package

import com.google.common.base.Function;

public class FluentWaitClass {

	public static void fluentWaitMethod() {
		WebDriver driver = null;

		WebElement element1 = null;
		pk1(driver, element1);
	}

	private static Boolean pk1(WebDriver driver, WebElement element1) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(80))
				.pollingEvery(Duration.ofSeconds(15)).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				if (element1.isDisplayed())
					return element1;
				return null;
			}
		});
		if (element.isDisplayed())
			return true;
		else
			return false;
	}
}