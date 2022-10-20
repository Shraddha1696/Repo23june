package day7.keyboardandmouseops;

import org.openqa.selenium.WebDriver;

public class EXample1 {

	
		// TODO Auto-generated method stub
		static WebDriver driver=null;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			driver=setUp("chrome", "https://www.google.com");
			System.out.println(driver.getTitle());
			cleanUp();
		}
	
static WebDriver setUp(String browserName, String url) {

	return driver;
}
static void cleanUp() {
	driver.close();
}}