package Infosys_HackerRank;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectingAutosuggestion {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@BeforeClass
	public void browser_launch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	@Test
	public void Autosuggestion() throws InterruptedException {
		WebElement input=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		wait.until(ExpectedConditions.visibilityOf(input));
		input.sendKeys("Selenium");
		Thread.sleep(15000);
		List<WebElement> AutoSuggestion = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("(//*[@class='OBMEnb'])[1]/ul/li"))));
		for(WebElement suggestion:AutoSuggestion) {
			System.out.println("Suggestion:"+suggestion);
			if(suggestion.getText().equals("selenium interview questions")) {
				suggestion.click();
			}else {
				System.out.println("Content Is Not Displaying");
			}
		}
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
