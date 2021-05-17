package organization;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassRepository.VtigerBaseClass;
import GenericLibrary.SelectUtils;
import PomRepository.CreateOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationPage;

public class TC_4Test extends VtigerBaseClass{
	@Test
	public void test4() throws Exception{
   //navigate to organization
		
	Thread.sleep(2000);
	HomePage home = new HomePage(driver);
	home.getOrganiztionLink().click();
	
	Reporter.log("organization\" page is displayed",true);
	
	//create new organization
	
	OrganizationPage org=new OrganizationPage(driver);
	org.getCreateOrganizationButton().click();
	
	//Check While Creating New Organization "Industry" Drop Down Option Is Working Or Not
	
	SelectUtils select=new SelectUtils();
	CreateOrganizationPage orgPage1=new CreateOrganizationPage(driver);
	WebElement listbox = orgPage1.getTypeListBox();
	
	select.selectBy(listbox,"Competitor");
	
	}
}
