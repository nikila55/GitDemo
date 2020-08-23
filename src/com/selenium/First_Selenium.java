package com.selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise");
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		String []itemsToBeAdded={"Cucumber","Beans"};
		
		List listToBeAdded=Arrays.asList(itemsToBeAdded);
		
		
		
		for(int i=0;i<itemsToBeAdded.length;i++)
		{
			String s=products.get(i).getText();
			  String[] ItemsREceived=s.split("-");
			  String Formatted=ItemsREceived[0].trim();
			
			
			if(listToBeAdded.contains("Formatted"))
			{
				
				
			 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
		}
		
		
		driver.close();
		
		
		
		
		

	}

}
