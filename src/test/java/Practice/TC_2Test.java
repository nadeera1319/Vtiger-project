package Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassRepository.VtigerBaseClass;
import GenericLibrary.Listner_Demo;
import GenericLibrary.SelectUtils;
import PomRepository.CreateOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationPage;

@SuppressWarnings("unused")
@Listeners(GenericLibrary.Listner_Demo.class)
public class TC_2Test extends VtigerBaseClass {
	@Test(retryAnalyzer = MyRetry.class)
	public void test1() throws Exception{
 
	//navigate to organization
		
	Thread.sleep(2000);
	HomePage home = new HomePage(driver);
	home.getOrganiztionLink().click();
	
	Reporter.log("organization\" page is displayed",true);
	
	//create new organization
	
	OrganizationPage org=new OrganizationPage(driver);
	org.getCreateOrganizationButton().click();
	Assert.fail();
	
	/*//Check While Creating New Organization "Industry" Drop Down Option Is Working Or Not
	
	SelectUtils select=new SelectUtils();
	CreateOrganizationPage orgPage=new CreateOrganizationPage(driver);
	select.selectBy(orgPage.getIndustryListBox(),"Chemicals");
	*/
			
			
		
		
		
	}

}
