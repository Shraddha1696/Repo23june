package day2.locator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
		public class ActitimeLogin2 {
	
public static void main(String[] args) {
				// TODO Auto-generated method stub
				//step1:open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//step2:enter app URL
		driver.get("https://demo.actitime.com/login.do ");
		//step3: enter username as admin
		/**locate username field from UI*/
		WebElement userNameInputField=driver.findElement(By.id("username"));
		/**after identify the webelement we perform following operation in it 
		 * type input----->sendkey("")
		 * click---->click()
		 * delete existing----->clear()
		 */
		userNameInputField.sendKeys("admin");
		//step4:enter password as manager
		/**identify password field*/
		WebElement password=driver.findElement(By.name("pwd"));
		/**type password as manager*/
		  password.sendKeys("manager");
		 //step5:click on login button
		  /**identify login button and click on it*/
		  driver.findElement(By.id("loginButton")).click();
		  //validation will be failed,to avoid this we willuse explicit
		  //wait(conditional wait)
		  WebDriverWait wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		 // wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		  //step6
		  String expectedTitle="actiTIME - Enter Time-Track";
		  String actualTitle=driver.getTitle();
		  System.out.println("Expected Title is:"+expectedTitle);
		  
		  System.out.println("Actual Title is:"+actualTitle);
		  //validation will be failed//validation home page
		  if(actualTitle.equals(expectedTitle)) {
			  System.out.println("Login validation is passed");
		  }else {
			  System.out.println("Login validation is failed");
		  }
		  //identify logout link and link on it
		  driver.findElement(By.id("logoutLink")).click();
		  //driver.close();
		  
		  
		}
		}
	


