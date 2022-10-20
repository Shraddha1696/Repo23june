package day2.locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\geckodriver.exe" );
	FirefoxDriver fdriver=new FirefoxDriver();
fdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//step2 enter app URL
fdriver.get("https://demosite.executeautomation.com/Login.html");
}
}