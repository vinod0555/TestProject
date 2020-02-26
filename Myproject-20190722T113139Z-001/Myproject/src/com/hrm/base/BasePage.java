package com.hrm.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Utility;

public abstract class BasePage {
  public Logger log=Logger.getLogger(this.getClass());
  public long timeout=Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
  public WebDriver driver;
  public WebDriverWait wait;
  public BasePage(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  wait= new WebDriverWait(driver,timeout);
  }
  public void verifyURLhas(String expectedUrl){
	  wait.until(ExpectedConditions.urlContains(expectedUrl));
  }
  public boolean verifyElementIsPresentOrNot(String xp){
	  try{
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
		  return true;
	  }
	  catch(Exception e){
		  return false;
	  }
  }
  
}
