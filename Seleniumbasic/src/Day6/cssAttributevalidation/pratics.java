package Day6.cssAttributevalidation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class pratics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath =  System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
//to genarate the instance
		WebDriver driver=new ChromeDriver();
		//maximize browser 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//find element by usernamefield
		driver.findElement(By.name("username")).sendKeys("admin");		
		/**
		 * Basic Validation on username input field
		 * - visible or not
		 * - editable or not
		 * - default text
		 */
		driver.findElement(By.name("password")).sendKeys("admin123");		
		/**System.out.println("password input field is Visible or not? \"+passwordInputField.isDisplayed()");
		
		System.out.println("password input field is editable or not? "+passwordInputField.isEnabled());
		System.out.println("password input field default value: "+defaultValue);*/
		
		//identify login button
				driver.findElement(By.className("orangehrm-login-button")).click();
				/**
				 * Basic Validation on login button
				 * - visible or not
				 * - functional or not
				 * - default text
				 */
				/**System.out.println("Login button visible or not? "+loginBtn.isDisplayed());
				System.out.println("Login button functional or not? "+loginBtn.isEnabled());
				String buttonName=loginBtn.getText();
				System.out.println("Button name is: "+buttonName);*/

				//fluent Wait declaration
				FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				
		
		
		
		
		
		
	}

}
