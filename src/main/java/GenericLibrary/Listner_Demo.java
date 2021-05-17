package GenericLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.ITestListener;


public class Listner_Demo implements  ITestListener   {
   		
    public void onFinish(ITestContext arg0) {					
       			
        		
    }		

    		
    public void onStart(ITestContext arg0) {					
        			
        		
    }		

    		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        			
        		
    }		

    		
    public void onTestFailure(ITestResult arg0) {
    	 TakeScreenShotUtils t=new  TakeScreenShotUtils();
    	try {
			t.elementScreenshot("fail2" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	
      			
        		
    }		

    	
    public void onTestSkipped(ITestResult arg0) {					
        			
        		
    }		

    	
    public void onTestStart(ITestResult arg0) {					
  				
        		
    }		

   	
    public void onTestSuccess(ITestResult arg0) {					
        				
        		
    }		
}		


