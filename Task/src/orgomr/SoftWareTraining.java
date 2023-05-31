package orgomr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SoftWareTraining {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get( "http://omrbranch.com/softwaretestingtraininginchennaiomr/ ");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl  = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement lnkbutton = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		Actions actions = new Actions(driver);
		actions.contextClick(lnkbutton).perform();
				
		

		
		
		
		
		
		
		
		
		
	}
	

}
