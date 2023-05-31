package org.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement lnklogin = driver.findElement(By.xpath("//a[text()='Login']"));
		lnklogin.click();
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(txtusername).perform();
		String text = txtusername.getText();
		System.out.println("gowtham");
		
		
		
		
	}
	
	
	
	

}
