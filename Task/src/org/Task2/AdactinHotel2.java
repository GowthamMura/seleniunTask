package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("gowtham");
		
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("12301");
		
		
		
		
	}
	
	

}
