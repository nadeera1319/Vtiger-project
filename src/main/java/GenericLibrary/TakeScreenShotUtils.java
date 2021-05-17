package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import BaseClassRepository.VtigerBaseClass;

public class TakeScreenShotUtils {
	 public void elementScreenshot(String s) throws IOException {
		 TakesScreenshot ts=(TakesScreenshot)VtigerBaseClass.driver;
		File tempfile= ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/"+s+".png");
		FileUtils.copyFile(tempfile, dest);
		 
	 }

}
