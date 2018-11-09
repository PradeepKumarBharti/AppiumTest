package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifySuggestion {
	WebDriver driver = null;

	public static void main(String[] args) {
		new VerifySuggestion().Pk();
	}

	private void Pk() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_mac");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.get("http://jedwatson.github.io/react-select/");
		try {
			driver.findElement(
					By.xpath("//div[@id='example']//div[@class='section'][1]//span[@class='Select-arrow-zone']"))
					.click();
			Thread.sleep(300);
			reactSelect("3", "Caramel", "Peppermint");
		} catch (Exception e) {

		}
	}

//	public void start() {
//		driver.get("http://jedwatson.github.io/react-select/");
//		reactSelect("3", "Caramel", "Peppermint");
//	}

	public void reactSelect(String id, String... values) {
		By selectDropArrow = By.xpath("//div[@class='Select-control'][span[contains(@id,'react-select-" + id
				+ "')]]/span[@class='Select-arrow-zone']");
		WebElement dropDownArrow = driver.findElement(selectDropArrow);
		dropDownArrow.click();
		if (values != null) {
			for (String value : values) {
				WebElement option = driver.findElement(By.xpath("//div[@id='react-select-" + id
						+ "--list']/div[@class='Select-option' and text()='" + value + "']"));
				option.click();
			}
		}
	}
}
