package orgomr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	   WebElement txtgreeens = driver.findElement(By.xpath("//span[contains(text(),'Greens Technologies Porur')]"));
	 	
     js.executeScript("arguments[0].scrollIntoView(true)", txtgreeens);
		
		String text = txtgreeens.getText();
		System.out.println(text);
		
		WebElement txtaddr = driver.findElement(By.xpath("//strong[contains(text(),'149')]"));
		String text2 = txtaddr.getText();
		System.out.println(text2);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
