package com.datadriven;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class dd {
	public static WebDriver driver;
	public static void mm()throws IOException {
	System.setProperty("Webdriver.chrome.driver", "D:\\ miniproject1_Adactin\\src\\main\\resources\\driver\\chromedriver.exe");
 driver = new ChromeDriver();
File f= new File("D:\\miniproject1_Adactin\\DataSheet\\nandini.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wk=new XSSFWorkbook(fis);
Sheet nan= wk.getSheetAt(0);
for(int i=0;i<5;i++)
{
	driver.get("https://www.facebook.com/");
	WebElement findElement=driver.findElement(By.id("email"));
	findElement.sendKeys(nan.getRow(i).getCell(0).getStringCellValue());
}
driver.close();
	}
	public static void main(String[] args) throws IOException{
		mm();
	}
	

}
