package Infosys_HackerRank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Withoutlaunchingbrowser {
	
	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
