package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.ReadMultipleData;

public class Demo1 {
	@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException{
		
	ReadMultipleData excel=new ReadMultipleData();
	String[][] sarr=excel.readData("Sheet2");
	return sarr;

	}
	@Test(priority=1,dataProvider="testData")
		public void Sample(String[] data) {
			for(String s:data) {
				Reporter.log(s,true);
			}
		}
	}

