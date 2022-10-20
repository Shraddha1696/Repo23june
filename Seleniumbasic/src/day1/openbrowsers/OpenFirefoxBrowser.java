package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\geckodriver.exe");
	
FirefoxDriver fdriver=new FirefoxDriver();
}
}