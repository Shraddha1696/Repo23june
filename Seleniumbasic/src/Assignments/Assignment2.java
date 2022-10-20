package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
//System.setProperty("webdriver,chrome.drive", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//to get url
driver.get("https://demo.automationtesting.in/Register.html");
List<WebElement> menu=driver.findElements(By.cssSelector("ul.nav.navbar-nav>li>a"));
System.out.println("count of menu option:"+menu.size());
for(int i=0;i<menu.size();i++) {
System.out.println(menu.get(i).getText());
	}
	}
}
