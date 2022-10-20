package day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUsedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\chromedriver.exe");

ChromeDriver driver=new ChromeDriver();
//enter the application URL
driver.get("https://demo.actitime.com/login.do");
String actualUrl=driver.getCurrentUrl();
String actualTitle=driver.getTitle();

System.out.println(" ACTUAL URL IS:"+actualUrl);
System.out.println("ACTUAL TITLE IS:"+actualTitle);
String expectedUrl="https://demo.actitime.com/login.do";
String expectedTitle="actiTIME - Login";
System.out.println("URL validation:"+actualUrl.equals(expectedUrl));
System.out.println("URL validation:"+actualTitle.equals(expectedTitle));
String pageSource=driver.getPageSource();
System.out.println("page Source length:"+pageSource.length());
System.out.println("page source length:"+pageSource);
//close the current browser
driver.close();
	}

}
