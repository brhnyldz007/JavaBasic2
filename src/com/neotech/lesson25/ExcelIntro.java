package com.neotech.lesson25;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	
	public static void main(String[] args) throws IOException {
		String filePath ="/Users/burhan/Documents/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		// read the workbook (the whole excel file)
		Workbook book = new XSSFWorkbook(fis);
		// Accessing the sheet that I want to read
	   Sheet sheet = book.getSheet("Sheet1");
		// Accessing the row that I want to read
		Row row = sheet.getRow(0);

		// Accessing the cell that I want to read
		Cell cell = row.getCell(1);

		// Getting data/information from the cell
		String info = cell.toString();
		System.out.println(info); // LastName
		// How do I get NY
		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(3);
		String cellValue = cell3.toString();
		System.out.println(cellValue);
		
		// How to get Garfield, with method chaining
		String cellInfo = sheet.getRow(1).getCell(2).toString();
		// How to get numeric value from the cell
		// You can use this method only for numbers
		double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);
		// downcast to an integer
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);
		// I can get the zip as a String
		String zip = sheet.getRow(1).getCell(4).toString();
		System.out.println(zip);
	}

}
