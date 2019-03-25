package com.framework.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assingment1 {

	@Test
	public void GetAmazonImages() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();

		dr.get("https://www.amazon.in");

		List<WebElement> allimages = dr.findElements(By.tagName("a"));
		for (WebElement imageFromList : allimages) {
			String ImageUrl = imageFromList.getAttribute("href");
			System.out.println(ImageUrl); // will get you all the image urls on
											// the page
			
		}
		dr. close();
	}

}
