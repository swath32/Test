package com.seleniom.sample.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception, IOException{
		try {
			FileInputStream file = new FileInputStream(new File("C:\\SwathiMura_Work\\SampleSheet.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook;
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Get first/desired sheet from the workbook
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					System.out.print(cell.getStringCellValue() + "\t");
				}
				System.out.println(".........");
			}
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
