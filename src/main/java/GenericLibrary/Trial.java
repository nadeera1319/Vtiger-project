package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Trial {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abspath=new File("./Resources/Book1.xlsx");
		 ExcelLib el=new ExcelLib();
		 System.out.println(el.numericCellValue(abspath,"Sheet1", 0, 0));
		 System.out.println(el.booleanCellValue(abspath, "Sheet1", 0, 2));
		
	}

}
