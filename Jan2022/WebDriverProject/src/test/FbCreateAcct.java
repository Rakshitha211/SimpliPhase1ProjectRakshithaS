package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCreateAcct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rakshitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S Gowda");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("raks@test.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Rak@12345");
		

	}

}
