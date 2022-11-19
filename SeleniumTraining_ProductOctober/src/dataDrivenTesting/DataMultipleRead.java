package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataMultipleRead {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {		
		readMultiple("Login");
	}
	public static Object[][] readMultiple(String sheetName) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object data[][]=new Object[row_count-1][col_count];
		for(int i=1;i<row_count;i++) {
			//iterates row value
			for(int j=0;j<col_count;j++) {
				//iterate cell
				//System.out.println(sheet.getRow(i).getCell(j).toString());
			data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}	
		}
		return data;
		
		
		
	}

}
