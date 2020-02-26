package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpPersonalDetailsPage;

public class CreateEmployee extends BaseTest {
	 @Test
	 public void testCreateEmployee()
	 {
		 //click on PIM
		 DashboardPage dbPage=new DashboardPage(driver);
		 dbPage.clickPIM_Menu();
		 //click on Add Emp
		 dbPage.clickAddEmp_Menu();
		 //verify AddEmpPage
		 AddEmpPage aePage=new AddEmpPage(driver);
		 aePage.verifyURLhas("addEmployee");
		 //enter valid FN
		 aePage.setFirstName("ravi");
		 //enter valid LN
		 aePage.setLastName("prakash");
		 //click on Save
		 aePage.clickSave();
		 //verify Emp Personal Details page
	 EmpPersonalDetailsPage epdPage=new EmpPersonalDetailsPage(driver);
		 epdPage.verifyURLhas("viewPersonalDetails");
		 //verify the FN
		 epdPage.verifyFirstName("bhanu");
	 }
}






