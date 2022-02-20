package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement ele= driver.findElement(By.xpath("//h2[text()='Table Rows']"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver; //on browser if v want to some functionality
		
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		
		//scroll down
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		
		//scroll up
		//js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		

	}

}
