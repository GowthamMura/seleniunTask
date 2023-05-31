package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btnsignup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		btnsignup.click();
		
		WebElement txtph = driver.findElement(By.id("mobile"));
		txtph.sendKeys("8667704263");
		
		WebElement txtname = driver.findElement(By.id("name"));
		txtname.sendKeys("gowtham");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("gowtham@gmail.com");
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
