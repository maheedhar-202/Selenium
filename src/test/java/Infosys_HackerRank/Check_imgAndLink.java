package Infosys_HackerRank;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_imgAndLink {
	
	public static void tets() throws MalformedURLException, IOException, InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://jockey.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement Link:links) {
			CheckURL(Link.getDomAttribute("herf"));
		}
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for(WebElement image:images) {
			CheckURL(image.getDomAttribute("src"));
		}
	}
	public static void CheckURL(String url) throws MalformedURLException, IOException {
		try {
			HttpURLConnection Connection = (HttpURLConnection)new URL(url).openConnection();
			  Connection.setRequestMethod("HEAD");
			  Connection.connect();
			  int responseCode = Connection.getResponseCode();
			  if(responseCode>=400) {
				  System.out.println("Broken URL "+url);
			  }else {
				  System.out.println("Valid URL :"+url);
			  }
			
		} catch (Exception e) {
			System.out.println("Broken URL: "+url+"-"+e.getMessage());
		}
		  
	}
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		tets();
	}

}
