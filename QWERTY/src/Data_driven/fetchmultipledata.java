package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchmultipledata {
 public static void main(String[]args) throws EncryptedDocumentException, IOException
 {
 
	 //Craete a file
	 File file=new File("./fetchData/excelData.xlsx");
	  //2 create object fo fileinputstream
	 
	 FileInputStream fis=new FileInputStream(file);
	 //3 create object for workbook
	 
	 Workbook wb= WorkbookFactory.create(fis);
	 String name=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(name);
	 double number=wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
	 System.out.println(number);
 }
}
