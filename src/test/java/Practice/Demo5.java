package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {
    @Parameters("browser")
	@Test(alwaysRun = true)
	public void sample2(String browsername) {
		Reporter.log(browsername,true);
		
		if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
		}
		if(browsername.equalsIgnoreCase("chrome")){
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		}
		
	}

}

