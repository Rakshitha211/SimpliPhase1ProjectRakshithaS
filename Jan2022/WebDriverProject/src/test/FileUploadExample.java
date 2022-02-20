package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");

		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement FileUpload= driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		FileUpload.sendKeys("/Users/rakshitha/Note");
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		

	}

}
