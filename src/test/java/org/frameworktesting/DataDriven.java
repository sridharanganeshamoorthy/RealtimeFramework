package org.frameworktesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\sridh\\eclipse-workspace\\FrameWorkTasks\\Data Driven Files\\Datadriventesting1.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);

		Sheet sh = book.getSheet("Sheet1");

		// (simple testing program to fetch particular row and cell) .

//		Row r = sh.getRow(1);
//		
//		Cell c = r.getCell(1);
//		
//		System.out.println(c);   

		// (to fetch all the rows and cell)

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {

			Row row = sh.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell c = row.getCell(j);

				System.out.println(c);

			}

		}

	}

}
