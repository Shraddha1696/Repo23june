package day2.locator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userNameInputField=driver.findElement(By.name("username")) ;
		userNameInputField.sendKeys("admin");

		WebElement password=driver.findElement(By.name("password")) ;
		password.sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		String expectedTitle="orange-Hrm";
		String actualTitle=driver.getTitle();
		System.out.println("ActualTitle is:"+actualTitle);

	}

}
