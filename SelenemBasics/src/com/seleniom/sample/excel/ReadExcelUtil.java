package com.seleniom.sample.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtil {
	static Workbook book;
	static Sheet sheet;
	static Object[][] data = new Object[10][10];
	
	public static void main(String[] args) {
		getTestDataDifferentMethod("Sheet1");
	}

	public static Object[][] getTestData(String sheetName) {		
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\SwathiMura_Work\\SampleSheet.xlsx");
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(sheetName);
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
					data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in reading : "+e);
		}
		return data;
	}
	
	public static Object[][] getTestDataDifferentMethod(String sheetName) {		
		FileInputStream file = null;
		try {				
			FileInputStream file1 = new FileInputStream(new File("C:\\SwathiMura_Work\\SampleSheet.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook;
			workbook = new XSSFWorkbook(file1);
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Get first/desired sheet from the workbook
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			int i=0;
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				int k=0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					System.out.print(cell.getStringCellValue() + "\t");
					data[i][k] = sheet.getRow(i+1).getCell(k).toString();
					k=k++;
				}
				System.out.println("");
				i=i++;
			}
			file1.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in reading : "+e);
		}
		return data;
	}
}
