package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows"); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("Before clicking new button: " + ParentWin);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='windowButton']"));
		element.click();
		
		System.out.println("After clicking new window button");
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			
			String currentVal = itr.next();
			System.out.println(currentVal);
			
			if(!currentVal.equals(ParentWin)) {
				
				driver.switchTo().window(currentVal); //switching to current window
			}
		}


		
		String text=driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		
		System.out.println(text);
		
		
		driver.switchTo().window(ParentWin); //back to parent window
		System.out.println("Back to parent window");
		driver.quit();

	}

}
