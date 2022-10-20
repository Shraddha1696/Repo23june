package day2.locator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeSourcen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//step2: enter app url
		driver.get("https://www.saucedemo.com/");
		//input field
		WebElement userNameInputField=driver.findElement(By.id("user-name")) ;
		userNameInputField.sendKeys("standard_user");
		//password field
		WebElement password=driver.findElement(By.id("password")) ;
		password.sendKeys("secrect_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//validation home page
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println("ExpectedTitle:"+expectedTitle);
		System.out.println("ActualTitle is:"+actualTitle);
		 if(actualTitle.equals(expectedTitle)) {
			  System.out.println("Login validation is passed");
		  }else {
			  System.out.println("Login validation is failed");
		  }
		  //identify logout link and link on it
		  driver.findElement(By.id("logout_sidebar_link")).click();
		  //driver.close();
		  
	}

}
