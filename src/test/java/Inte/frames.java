package Inte;

import org.openqa.selenium.WebDriver;

public class frames {
	public WebDriver driver;

	public void totalframes() {
		driver.switchTo().frame(2);
	}
}
