package Practice_Java.Practice_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* To read XLS files, an HSSF implementation is provided by POI library.
		To read XLSX, XSSF implementation of POI library will be the choice.*/ 
		
		try
		{
			//specify the file path
			File src = new File("D:\\Lenskart\\Tasks\\readwrite.xlsx");
			
			//load file
			FileInputStream fis= new FileInputStream(src);
			
			//load workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			//load sheet
			XSSFSheet sheet = wb.getSheetAt(0);
			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			System.out.println(rowCount);
			
			System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
			// getRow() specify which row we want to read.
			  // and getCell() specify which column to read.
			  // getStringCellValue() specify that we are reading String data.
			
			
			XSSFRow row = sheet.getRow(0);
			XSSFRow newRow = sheet.createRow(rowCount+1);
			
			newRow.createCell(5).setCellValue("111111");
			
			
			FileOutputStream fout = new FileOutputStream(new File("D:\\Lenskart\\Tasks\\readwrite.xlsx"));
			wb.write(fout);
			
			fout.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
