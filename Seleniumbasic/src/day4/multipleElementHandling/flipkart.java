package day4.multipleElementHandling;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//get the suggestion from the google search page
		List<WebElement> suggList=driver.findElements(By.cssSelector("div.37M3Pb>a>*:nth-child(2)"));
		//.xpath("//div[@class='xtXmba']"
		//get suggestion count
		System.out.println("Suggestion count is: "+suggList.size());
		//to get element from the list
		WebElement firstSugg=suggList.get(0);
		System.out.println("First Suggestion name: "+firstSugg.getText());
		
		for(int i =0;i<suggList.size();i++) {
			System.out.println(suggList.get(i).getText());
		}
	}

	}


