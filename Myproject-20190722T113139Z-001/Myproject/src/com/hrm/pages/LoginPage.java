package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="txtUsername")
	private WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	private WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String un,String pw){
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pw);
		btnLogin.click();
	}
}
