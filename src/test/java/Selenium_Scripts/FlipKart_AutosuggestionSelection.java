package Selenium_Scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart_AutosuggestionSelection {
	public WebDriver driver;
	@Test
	public void TC_01() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Mobiles");
		Thread.sleep(5000);
		List<WebElement> AutoSuggestion = driver.findElements(By.xpath("//*[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		AutoSuggestion.get(6).click();
		driver.quit();
		
	}

}
