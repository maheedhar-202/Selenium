package Parllel_Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Parallel extends Lunching{
	public String base_URL="https://www.youtube.com/";
	@Test(priority = 1)
	public void  Search() {
		driver.get(base_URL);
		driver.findElement(By.cssSelector(".ytSearchboxComponentInput.yt-searchbox-input.title")).sendKeys("Testing"+Keys.ENTER);
	}

}
