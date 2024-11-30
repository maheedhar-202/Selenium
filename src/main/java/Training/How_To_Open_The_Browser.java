package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class How_To_Open_The_Browser {
	public WebDriver driver;
	
	@Test
	public void TC_001() {
		driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}

}
