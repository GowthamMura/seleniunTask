package orgomr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JsBinFruit {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(1);
		String text = webElement.getText();
		System.out.println(text);
		System.out.println("============");
		for (int i = 0; i < options.size(); i++) {
			if (i==1) {
				continue;
				
			}
			WebElement webElement2 = options.get(i);
			String text2 = webElement2.getText();
			System.out.println(text2);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
