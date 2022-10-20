package day3Locator;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BROWSEROP1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// explicit wait(static wait)
	Thread.sleep(2000);
	// maximize browser window
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// set browser window size
	driver.manage().window().setSize(new Dimension(650,450));
	// explicit wait(static wait)
			Thread.sleep(2000);
			// maximize browser window
			driver.manage().window().maximize();
			// to enter required application URL use get() of WebDriver interface
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit way
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// identify and click on login button
	driver.findElement(By.className("orangehrm-login-forgot")).click();	
			Thread.sleep(2000);
			//come back to the previous page
			driver.navigate().back();
			Thread.sleep(2000);
			//come back to the next page
			driver.navigate().forward();
			Thread.sleep(2000);
			//to reload the current page 
			driver.navigate().refresh();
			Thread.sleep(2000);
			//to move to different url
			driver.navigate().to("https://www.google.com");
			
}}

	