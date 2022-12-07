package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Data_Read {
public static WebDriver driver;
@SuppressWarnings("resource")
public static void nandu()throws IOException{
	System.setProperty("Webdriver.chrome.driver", "D:\\ miniproject1_Adactin\\src\\main\\resources\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	File f= new File("D:\\miniproject1_Adactin\\DataSheet\\nandini.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook workbook=new XSSFWorkbook(fis);
	Sheet sheetAt=(Sheet) workbook.getSheetAt(0);
	for(int i=0;i<5;i++)
	{
		driver.get("https://www.facebook.com/");
		WebElement findElement=driver.findElement(By.id("email"));
		findElement.sendKeys(((org.apache.poi.ss.usermodel.Sheet) sheetAt).getRow(i).getCell(0).getStringCellValue());
	}
	driver.close();
	}
public static void main()throws IOException{
	nandu();
}
}