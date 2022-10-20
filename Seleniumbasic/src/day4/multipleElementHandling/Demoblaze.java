package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
//System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe" );
		
//creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
				driver.manage().window().maximize();
				// to enter required application URL use get() of WebDriver interface
				driver.get("https://www.demoblaze.com/");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//List<WebElement> mobileNameList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
				
				List<WebElement> mobilenameList=driver.findElements(By.xpath("//a[@class='hrefch']"));
				//(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4"))
				
				//List<WebElement> mobilePriceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
				
				List<WebElement> mobilepriceList=driver.findElements(By.xpath("//h5[text()='$360']"));
				//(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h5"));
				//count size
				System.out.println("Suggestion count is: "+mobilepriceList.size());
				
				//to get element from the list
				WebElement firstSugg=mobilepriceList.get(0);
				
				System.out.println("First Suggestion name: "+firstSugg.getText());
				
				for(int i=0;i<mobilenameList.size();i++) {
					System.out.println(mobilenameList.get(i).getText()+ " ---> "+mobilepriceList.get(i).getText());
				}}
		
		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
