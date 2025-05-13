package Selenium_Scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NSE_Script {
	public WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nseindia.com/all-reports");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		js.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(10000);
		WebElement allradio = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[contains(text(),'Select All Reports')]"))));
		allradio.click();
		//allradio.click();
		WebElement downloadlink = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='MultiDwnld']"))));
		downloadlink.click();
	}

}
