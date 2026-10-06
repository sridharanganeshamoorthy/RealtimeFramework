package org.frameworktesting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUpdatingExcel {
	
	

	public static void main(String[] args) throws IOException {

	// File location
	File f = new File(
	"C:\\Users\\sridh\\eclipse-workspace\\FrameWorkTasks\\Data Driven Files\\face.xlsx");

	// Create workbook
	Workbook book = new XSSFWorkbook();         //Workbook object creation 

	// Create sheet
	Sheet sh = book.createSheet("New");

	// Create row
	Row r = sh.createRow(0);

	// Create cell
	Cell c = r.createCell(0);

	String value = c.getStringCellValue();
	
	System.out.println(value);
	
	if (value.equals("Sridharan")) {
		c.setCellValue("Mukesh");
	}
	
	else {
		c.setCellValue("Vijay");
	}
	
	FileOutputStream fout = new FileOutputStream(f);    //object creation for writing(FileOutputStream)
	
	book.write(fout);
	

	
	}
}


