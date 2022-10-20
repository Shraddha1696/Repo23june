package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
//System.setProperty("webdriver,chrome.drive", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
List<WebElement> suggList = (List<WebElement>) driver.findElement(By.xpath("//span[@class='nav-logo-locale']"));
System.out.println("Suggestion count is: "+suggList.size());
WebElement firstSugg=suggList.get(1);
System.out.println("First Suggestion name: "+firstSugg.getText());

for(int i=0;i<suggList.size();i++) {
System.out.println(suggList.get(i).getText() );
}












	}

}
