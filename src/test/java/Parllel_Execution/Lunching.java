package Parllel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Lunching {
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void tear_Down(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tear_Down() {
		driver.quit();
	}

}
