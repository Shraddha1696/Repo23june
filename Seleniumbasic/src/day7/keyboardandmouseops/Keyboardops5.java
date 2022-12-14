package day7.keyboardandmouseops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardops5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
	/**
	 * possible ways to refresh the browser:
	 * 1. driver.navigate().refresh();
	 * 2. sendKeys(Keys.F5)
	 * 3. by hitting same URL again
	 * 4. ctrl+R
	 */
	
	
	}

}
