package organization;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PomRepository.CreateOrganizationPage;
import PomRepository.HomePage;
import PomRepository.LoginPage;
import PomRepository.OrganizationPage;

public class TC_1Test {
	public static void main(String[] args) throws IOException, InterruptedException {
	
		//Launching Browser
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		File abspath=new File("./Resources/VTigerlogin.xlsx");
		login.login(driver,abspath);

		System.out.println("Home page is displayed");
    
		//navigate to organization
		
		HomePage home=new HomePage(driver);
	    home.getOrganiztionLink().click();
		System.out.println("organization\" page is displayed");
	
		//naviagate to "create new organization"page by click on "+" image
		
		OrganizationPage org=new OrganizationPage(driver);
		org.getCreateOrganizationButton().click();
		System.out.println("Creating New organization\" page is displayed");
		
		//create a organization with madatory fields
		CreateOrganizationPage orgPage=new CreateOrganizationPage(driver);
		orgPage.getOrgNameTextfeild().sendKeys("abc26");
		orgPage.getUserRadioButton().click();
		orgPage.getSubmitButton().click();
		
		home.logout(driver);
		
	}
	
	
	

}
