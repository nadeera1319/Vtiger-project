package BaseClassRepository;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomRepository.HomePage;
import PomRepository.LoginPage;

public class VtigerBaseClass {
	public static WebDriver driver;
	//public HomePage home;
	@BeforeClass(alwaysRun = true)
     public  void Launch(){
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        //Launching the Browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Reporter.log("Browser launched",true);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
     @BeforeMethod(alwaysRun = true)
     public void login() throws EncryptedDocumentException, IOException {
		LoginPage login=new LoginPage(driver);
 		File abspath=new File("./Resources/VTigerlogin.xlsx");
 		login.login(driver,abspath);
        Reporter.log("Home page is displayed",true);

     } 
     @AfterMethod(alwaysRun = true)
     public void logoutApplication() throws InterruptedException{
    	 
    	 HomePage home= new HomePage(driver);
    	 home.logout(driver);
    	 Reporter.log("logging out from application",true);
     }
     @AfterClass()
     public void ZcloseApp() {
    	 driver.quit();
    	 Reporter.log("closing the application",true);
     
    	 
     }
    	 
    	 
    	 
    	 
    	 
     }
		 
   
     
     		
        	 
        	 
        	 
         


