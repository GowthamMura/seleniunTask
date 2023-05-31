package orgomr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GuruDemo {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement ddncountry = driver.findElement(By.name("country"));
	Select s = new Select(ddncountry);
	s.selectByValue("ALBANIA");
	
	List<WebElement> options = s.getOptions();
	WebElement webElement = options.get(7);
	String text = webElement.getText();
	System.out.println(text);
	
	for (int i = 0; i < options.size(); i++) {
		WebElement webElement2 = options.get(i);
		String attribute = webElement2.getAttribute("value");
		System.out.println(attribute);
		
	}
	
	
	
	
	
	
}
	
	
	
	
}
