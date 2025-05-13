package Selenium_Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ecommerce {
	// updating selenium scrip updated in testing branch
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public void search_text() throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("LapTops"+Keys.ENTER);
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[text()='Brand']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[text()='HP']")).click();
		Thread.sleep(20);
		List<WebElement> products = driver.findElements(By.xpath("//*[@class='CGtC98']"));
		for(int i=1;i<=5;i++) {
			Thread.sleep(10);
			//Testing
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", driver.findElement(By.xpath("(//*[@class='CGtC98'])["+i+"]/div[2]/div[1]/div[1]")));
			String ProductNames = driver.findElement(By.xpath("(//*[@class='CGtC98'])["+i+"]/div[2]/div[1]/div[1]")).getText();
			System.out.println("Product Names:"+ProductNames);
			Thread.sleep(10);
			String ProductPrices = driver.findElement(By.xpath("(//*[@class='CGtC98'])["+i+"]/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
			System.out.println("Product Prices:"+ProductPrices);
		}
	}

}
