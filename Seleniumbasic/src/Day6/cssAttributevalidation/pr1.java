package Day6.cssAttributevalidation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome b
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.name("q")).sendKeys("selenium");
List<WebElement> suggList=driver.findElements(By.xpath("input[@class=gLFyf gsfi"));
//input[@class=gLFyf gsfi']















	}

}
