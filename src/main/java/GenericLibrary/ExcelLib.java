
package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	public double numericCellValue(File abspath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fin=new FileInputStream(abspath);
		Workbook wb= WorkbookFactory.create(fin);
		double num = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		
		return num;
	}
	public String stringCellValue(File abspath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream(abspath);
		Workbook wb= WorkbookFactory.create(fin);
		String str = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		
		return str;
		
	}
	public boolean booleanCellValue(File abspath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream(abspath);
		Workbook wb= WorkbookFactory.create(fin);
		boolean value= wb.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		
		
		return value;
		
	}
	
	

}
