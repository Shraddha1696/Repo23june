package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {

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
driver.get("https://www.gsmarena.com/");
//validation home page
String actualTitle=driver.getTitle();
String expectedTitle=" GSMArena.com - mobile phone reviews, news, specification and more...";
System.out.println("Actual Title is:"+actualTitle);
System.out.println("Expected Title is:"+expectedTitle);
//samsung phone link present on phone finder
driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']"));
//device count
List<WebElement> samsungphone=driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
System.out.println("device count of samsung phone:"+samsungphone.size());
//all device name
for(int i=0;i<samsungphone.size();i++) {
	System.out.println(samsungphone.get(i).getText());
	
}
	}

}
