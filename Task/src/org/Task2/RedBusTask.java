package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTask {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement icon = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		icon.click();
		
		WebElement clksighin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		clksighin.click();
	
		// using swith to frame by webElement
		
		WebElement framechck = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(framechck);
		
		WebElement txtph = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtph.sendKeys("8667704263");
		
		
		
		
		
		
		
		
	}

}
