package com.pageobjectmodel;

import com.miniproject1_Adactin.login_page;

public class main_page extends baseclass {

	public static  void main (String[] args) {
		Webdriver driver=setProperty("Chrome");
		urlLaunch("https://adactinhotelapp.com/");
	login_page l=new login_page(driver);
	inputvalue(l.getuser(),"nandini29");
		

	}

		
	

}
