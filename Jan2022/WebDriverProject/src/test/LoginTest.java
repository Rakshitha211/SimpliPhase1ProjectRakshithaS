package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/chromedriver 2");
	//System.setProperty("webdriver.chrome.driver", "/Users/rakshitha/driver/geckodriver 2");
	//	System.setProperty("webdriver.chrome.driver", "chromedriver");
		//create the obj of webdriver
		
		WebDriver driver =new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement loginBtn=driver.findElement(By.linkText("Log in"));
		
		loginBtn.click();
		
		WebElement Uname=driver.findElement(By.name("user_login"));
		WebElement Pwd=driver.findElement(By.name("user_pwd"));
		WebElement LgnBtn=driver.findElement(By.name("btn_login"));
		WebElement remember=driver.findElement(By.className("rememberMe"));
		
		
		Uname.sendKeys("rakshitha@gmail.com");
		Pwd.sendKeys("Abc@12345");
		remember.click();
		//Thread.sleep(30000);
		LgnBtn.click();
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		if(ActualMsg.equals(ExpMsg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		
		
		//total number of hyper links present in the page
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		for(WebElement ele:links) {
			System.out.println(ele.getAttribute("href"));
		}
		
		
		driver.close();

		
		

	}

}
