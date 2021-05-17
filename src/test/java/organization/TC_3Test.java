package organization;

import java.io.File;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassRepository.VtigerBaseClass;
import GenericLibrary.ExcelLib;
import GenericLibrary.SelectUtils;
import PomRepository.CreateOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationPage;

public class TC_3Test extends VtigerBaseClass {
	@Test(groups = "smoke")
	public void test2() throws Exception{
		   //navigate to organization
				
			Thread.sleep(2000);
			HomePage home = new HomePage(driver);
			home.getOrganiztionLink().click();
			
			Reporter.log("organization\" page is displayed",true);
			
			//create new organization
			
			OrganizationPage org=new OrganizationPage(driver);
			org.getCreateOrganizationButton().click();
			
			//Entering Mandaatory Feilds 
			CreateOrganizationPage orgPage=new CreateOrganizationPage(driver);
			ExcelLib excel=new ExcelLib();
			File absPath=new File("./Resources/VTigerlogin.xlsx");
			
			orgPage.getOrgNameTextfeild().sendKeys(excel.stringCellValue(absPath, "Sheet1", 1, 2));
			orgPage.getUserRadioButton().click();
			Reporter.log("organization name is entered",true);
			
			
			//Check While Creating New Organization "Industry" Drop Down Option Is Working Or Not
			
			SelectUtils select=new SelectUtils();
			select.selectBy(orgPage.getIndustryListBox(),"Chemicals");
			Reporter.log("dropdown value is entered",true);
			Thread.sleep(3000);
			
			orgPage.getSubmitButton().click();
			Reporter.log("submit button is clicked",true);
			
			
	
	}
}
