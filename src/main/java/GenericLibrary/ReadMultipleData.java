package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public String[][] readData(String Sheet) throws EncryptedDocumentException, IOException {
		File abspath=new File("./Resources/VTigerlogin.xlsx");
		FileInputStream fin=new FileInputStream(abspath);
		Workbook wb=WorkbookFactory.create(fin);
		Sheet sheet = wb.getSheet(Sheet);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] arr=new String[rowcount][cellcount];
		for(int i=0;i<=rowcount-1;i++) {
			for(int j=0;j<=cellcount-1;j++) {
				arr[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return arr;
		
	}

}
