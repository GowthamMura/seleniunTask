package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement hdfcframe = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(hdfcframe);
		WebElement customerid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		customerid.sendKeys("gowtham@123");
		WebElement clkcontinue = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		clkcontinue.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
