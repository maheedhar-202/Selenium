package Sample.Selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class One_plus_interview_Practice {

	public WebDriver driver;
	public Sheet sheet;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void Navigate_To_List_Page() throws Exception {
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Mobile"+Keys.ENTER);
		List<WebElement> products = driver.findElements(By.xpath("//*[@class='_4rR01T']"));
		System.out.println(products.size());
		for(int i=2;i<=products.size();i++) {
			try {
				WebElement ProductName = driver.findElement(By.xpath("(//*[@class='_4rR01T'])["+i+"]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ProductName);
				String Product_Name = ProductName.getText();

				System.out.println("Product Name:"+Product_Name);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			WebElement Product_Price = driver.findElement(By.xpath("(//*[@class='col col-5-12 nlI3QM']/div/div)["+i+"]/div[1]"));
			String product_price = Product_Price.getText();
			System.out.println("Product Price:"+product_price);
			// Create a new Excel workbook
			Workbook workbook = new XSSFWorkbook();

			// Create a new sheet
			sheet =  workbook.createSheet("FlipKartdata");

			// Create a new row Product Name
			Row rowProductName = sheet.createRow(i);

			// Create a cell and set the value
			Cell cell = rowProductName.createCell(0);

			// Create a new row Product Price
			Row rowProductPrice = sheet.createRow(i);

			// Create a cell and set the value
			Cell cell_Product_Price = rowProductPrice.createCell(1);


			// Write the workbook content to a file
			FileOutputStream fileOut = new FileOutputStream("output.xlsx");
			workbook.write(fileOut);
			System.out.println("Writing The Data");
			fileOut.close();
		}
		List<WebElement> price = driver.findElements(By.xpath("(//*[@class='col col-5-12 nlI3QM']/div/div)"));
		double maxPrice = Double.MIN_VALUE;
		WebElement maxPriceElements=null;
		for(int i=1;i<=price.size();i++) {
			WebElement priceElement = driver.findElement(By.xpath("(//*[@class='col col-5-12 nlI3QM']/div/div)["+i+"]/div"));
			String pricetext=priceElement.getText().replace("[^0-9.]+", "");
			String pricetext1 = pricetext.replace(",", "");
			double value = Double.parseDouble(pricetext1.replace("₹", ""));

			if(value>maxPrice) {
				maxPrice=value;
				maxPriceElements=priceElement;
				System.out.println("maxPriceElements:"+maxPriceElements);
			int	j=i+1;
				maxPriceElements=driver.findElement(By.xpath("(//*[@class='_4rR01T'])["+j+"]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", maxPriceElements);
				maxPriceElements.click();
			}
			if(maxPriceElements!=null) {
				System.out.println("Higest Price:"+maxPrice);
				maxPriceElements.click();
			}else {
				System.out.println("No Prices Found On This Page");
			}
		}

	}


}
