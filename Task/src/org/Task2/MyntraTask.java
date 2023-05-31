package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask {
	public static void main(String[] args) {
		
System.setProperty("Webdriver", "http://greenstech.in/selenium-course-content.html");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/\r\n");
				
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		WebElement txtlogin = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtlogin.sendKeys("8667704263");

		WebElement btncontinue = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		btncontinue.click();
		
		
		
	}
	

}
