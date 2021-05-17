package Practice;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClassRepository.VtigerBaseClass;
import PomRepository.HomePage;

	public class  Demo3  {
		@Test(groups = "smoke")
		public void test1(String message) throws Exception{
	 
		//navigate to organization
			
		//Thread.sleep(2000);
		//HomePage home = new HomePage(driver);
		//home.getOrganiztionLink().click();
		
		Reporter.log("organization\" page is displayed",true);
		Reporter.log(message);

		}
}
	


