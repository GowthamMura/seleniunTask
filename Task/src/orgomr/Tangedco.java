package orgomr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tangedco {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nsc.tnebltd.gov.in/nsconline/mobval.xhtml?apl=N");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtmobile = driver.findElement(By.id("nscapp:appphno"));
		txtmobile.sendKeys("8667704263");
		
		WebElement txtemail = driver.findElement(By.id("nscapp:appmail"));
		txtemail.sendKeys("muragowtgham@gmail.com");
		
		WebElement btnotp = driver.findElement(By.xpath("//input[@value='Generate OTP']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(btnotp).perform();
		btnotp.click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
