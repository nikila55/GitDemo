package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectiveDropDown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
			List<WebElement> option =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			
			for(WebElement o:option)
			{
				if(o.getText().equalsIgnoreCase("India"))
				{
					o.click();
				}
						
			}

	}

}
