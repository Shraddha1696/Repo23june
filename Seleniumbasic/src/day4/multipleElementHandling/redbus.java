package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
//System.setProperty("webdriver,chrome.drive", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.redbus.in/");
driver.findElement(By.id("src")).sendKeys("pune");
//path for swar gate
//driver.findElement(By.cssSelector("ul.autoFill.homeSearch>*:nth-child(2)>*:first-child")).click();
driver.findElement(By.cssSelector("ul.autoFill.homeSearch>*:nth-child(2)>*:first-child")).click();
 driver.findElement(By.id("dest")).sendKeys("Goa");
List<WebElement>destination=driver.findElements(By.cssSelector("div.clearfix.search-wrap>*:nth-child(3)>div>ul>li>i"));
 destination.get(2).click();
 //select date of next month
 driver.findElement(By.className("next")).click();
 driver.findElement(By.cssSelector(".rb-calendar>table>tbody>*:nth-child(4)>*:first-child")).click();
 //select on search button
 driver.findElement(By.id("search_btn")).click();
 //select depature time before 6am
 driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li>*:nth-child(4)")).click();
 //select ac type bus
 driver.findElement(By.cssSelector("ul.list-chkbox>*:nth-child(3)>label:nth-of-type(1)")).click();
 //bus name
 List<WebElement>busname=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div>*:first-child"));
 List<WebElement>busprice=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>:nth-of-type(6)>div>*:nth-child(2)"));
 for(int i=0;i<busname.size();i++) {
 System.out.println(busname.get(i).getText()+"--->"+busprice.get(i).getText());
 }
	}
}

