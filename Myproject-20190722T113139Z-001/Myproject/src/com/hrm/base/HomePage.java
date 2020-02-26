package com.hrm.base;

import generics.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class HomePage extends BasePage{

	@FindBy(linkText="Welcome Admin")
	private WebElement welcome;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
		
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void logout(){
		Utility.clickUsingJS(driver, welcome);
		Utility.clickUsingJS(driver, logout);
	}
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	
	public void clickPIM_Menu(){
		pim_Menu.click();
	}
	
	public void clickAddEmp_Menu(){
		addEmp_Menu.click();
	}
	
	
}






