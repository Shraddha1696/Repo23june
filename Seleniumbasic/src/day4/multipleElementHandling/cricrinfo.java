package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricrinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> suggList=driver.findElements(By.cssSelector(".ds-flex>*:first-child>div>a"));
		//(By.xpath("//div[@class='wzrk-overlay']"));
	//System.out.println("Suggestion count is: "+suggList.size());
		//to get element from the list
		//WebElement firstSugg=suggList.get(0);
		//System.out.println("First Suggestion name: "+firstSugg.getText());
		
		for(int i =0;i<suggList.size();i++) {
			System.out.println(suggList.get(i).getText());
		}
		
		
		
		
		
	}

}
