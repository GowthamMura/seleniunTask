package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtgoogle = driver.findElement(By.xpath("//input[@name='q']"));
		txtgoogle.sendKeys("greenstechnology");
		
		
		
		
		
		
		
	}
	
	
	

}
