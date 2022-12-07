package com.miniproject1_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page{
public WebDriver driver;//null
@FindBy(id="Username")
private WebElement user;
@FindBy(id="Userpass")
private WebElement pass;

public login_page( WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}
}	
		
    
	


