package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//validation home page
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping Site for Moblies, Electronics, Furniture, Grocery";
		System.out.println("Expected Title is:"+expectedTitle);
		System.out.println("Home page Title validation:"+actualTitle.equals(expectedTitle));
		//main menu option count
		List<WebElement> mainmenu=driver.findElements(By.cssSelector("div.37M3Pb>a>*:nth-child(2)"));
		System.out.println("main count is: "+mainmenu.size());
				//to get element from the list
				//WebElement firstSugg=suggList.get(0);
				//System.out.println("First Suggestion name: "+firstSugg.getText());
				
				for(int i =0;i<mainmenu.size();i++) {
					System.out.println(mainmenu.get(i).getText());
				}
	}

}
