package rakshitha;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12", Keys.ENTER);
		
		
		List<WebElement> iPhoneName =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		System.out.println("count of iphone "+iPhoneName.size());
		
		for(WebElement ele:iPhoneName) {
			
			System.out.println("Name-->"+ele.getText());
			
		}
		
		List<WebElement> iPhonePrice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		System.out.println("count of iPhone Price  "+iPhonePrice.size());
		
	
		for(WebElement ele1:iPhonePrice) {
			
			System.out.println("Price-->"+ele1.getText());
			
	}
		
		

		
		
		driver.quit();
		
		
				

	}

}
