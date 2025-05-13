package Selenium_Scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandels {
	public WebDriver driver;
	@Test
	public void TC_01() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String firstwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Open a popup window']")).click();
		Set<String> multiplewindows = driver.getWindowHandles();
		Iterator<String> itr = multiplewindows.iterator();
		while(itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if(driver.getTitle().equals("New Window")) {
				System.out.println("equal");
				driver.close();
			}else {
				System.out.println("Not Equals");
			}
		}
		driver.switchTo().window(firstwindow);
		driver.findElement(By.xpath("//*[@id='ta1']")).sendKeys("Testing");
		//Creating New tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
