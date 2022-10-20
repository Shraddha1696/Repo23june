package day3Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximum windows
		driver.manage().window().maximize();
		//to enter the required application URL use get() of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit way
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		//identify user name input fieEld
		WebElement usernameInputField=driver.findElement(By.name("username"));
		/**
		 * Basic Validation on username input field
		 * - visible or not
		 * - editable or not
		 * - default text
		 */
		System.out.println("User name input field is visible or not?"+usernameInputField.isDisplayed());
		System.out.println("User name input field is editableor not?"+usernameInputField.isEnabled());
		String defaultValue=usernameInputField.getAttribute("placeholder");
		System.out.println("User name input field default value: "+defaultValue);
		
		//identify login button
				WebElement loginBtn=driver.findElement(By.className("orangehrm-login-button"));
				/**
				 * Basic Validation on username input field
				 * - visible or not
				 * - functional or not
				 * - default text
				 */
				System.out.println("Login button visible or not? "+loginBtn.isDisplayed());
				System.out.println("Login button functional or not? "+loginBtn.isEnabled());
				String buttonName=loginBtn.getText();
				System.out.println("Button name is: "+buttonName);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
