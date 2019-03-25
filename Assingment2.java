package com.framework.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assingment2 {

	@Test
	public void PrintBankDetails() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.theswiftcodes.com/malaysia/");
		// Printing table headers of a web table 
		List<WebElement> allHeadersOfTable= dr.findElements(By.className("swift"));
		System.out.println("Headers in table are below:");
		System.out.println("Total headers found: "+allHeadersOfTable.size());
		for(WebElement header:allHeadersOfTable)
		{
			System.out.println(header.getText());
		}

	}

}
