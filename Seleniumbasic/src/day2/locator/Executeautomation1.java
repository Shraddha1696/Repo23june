package day2.locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executeautomation1 {
	public static void main(String[] args) {
	//step1: open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit way
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//step2:enter app URL
		driver.get("https://demosite.executeautomation.com/Login.html");
		//step3: enter user name as admin
		/** locate username field from UI */
		driver.findElement(By.name("Username")).sendKeys("execution");;
		//step4: enter password as manager
		/**identify password field*/
		driver.findElement(By.name("password")).sendKeys("admin");;
		//step5:click on login button
		/**identify login and click on it*/
		driver.findElement(By.name("Login")).click();;
		
		
	}
}
/**
 * Open chrome browser Enter application URL Enter usernams as admin enter
 * password as manager click on login button validation home page click on
 * logout button validate login page
 */