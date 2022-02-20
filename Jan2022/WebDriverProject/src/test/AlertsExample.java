package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	      	System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");

			
			WebDriver driver =new ChromeDriver();
			driver.get("https://demoqa.com/alerts"); 
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			
			Alert alt1=driver.switchTo().alert();
			
			Thread.sleep(3000);
			alt1.accept();
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			Alert alt2=driver.switchTo().alert();
		
			Thread.sleep(3000);
			alt2.dismiss();
			
			
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			Alert alt3=driver.switchTo().alert();
		
			Thread.sleep(3000);
			alt3.sendKeys("Selenium");
			alt3.accept();
			
			
			
			
	}

}
