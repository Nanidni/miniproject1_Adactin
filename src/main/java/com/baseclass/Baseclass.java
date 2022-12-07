package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;//null
	public static void launch(String value) {
		if(value.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver","D:\\miniproject1_Adactin\\src\\main\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();}
		else if(value.equalsIgnoreCase("IE")) {
			System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Internet Explore" );
			driver=new ChromeDriver();
			}
	}
public static void url(String geturl) {
	driver.get(geturl);
	
}
public static void inputElement(WebElement element,String value) {
	element.sendKeys(value);
}
public static void main(String[] args) {
}
}

			
		
	
	
	
	
	
		


