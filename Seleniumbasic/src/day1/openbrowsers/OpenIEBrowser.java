package day1.openbrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver", "D:\\Acceleration\\Java Program\\Seleniumbasic\\Executables\\IEDriverServer.exe");
	InternetExplorerDriver idriver=new InternetExplorerDriver();
	}
}
