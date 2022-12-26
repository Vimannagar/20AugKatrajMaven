package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String readData(int row, int column) throws IOException {

		String path = System.getProperty("user.dir") + "\\KatrajTestData.xlsx";

		File src = new File(path);

//	to load the excel sheet we are using fileinputstream class

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugSheet");

//	wb.getSheetAt(0);

//	String value = sh1.getRow(6).getCell(0).getStringCellValue();

//	System.out.println(value);

		DataFormatter df = new DataFormatter();

		String value = df.formatCellValue(sh1.getRow(row).getCell(column));

		System.out.println(value);
		
		return value;

	}

	public static void writeData() throws IOException {

		String path = System.getProperty("user.dir") + "\\KatrajTestData.xlsx";

		File src = new File(path);

//		to load the excel sheet we are using fileinputstream class

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugSheet");

		File fout = new File(path);

		FileOutputStream fos = new FileOutputStream(fout);

//		row and colums are already created
		sh1.getRow(0).getCell(1).setCellValue("Writing the data for 0th row");
//		row and colums are already created		
		sh1.getRow(6).getCell(0).setCellValue("Writing the data for 6th row");
//		row and colums are not already created
		sh1.createRow(50).createCell(12).setCellValue("testing");

		wb.write(fos);

	}

	public static void main(String[] args) throws IOException {

//		String path = "C:\\Users\\DELL\\Desktop\\KatrajTestData.xlsx";

		String path = System.getProperty("user.dir") + "\\KatrajTestData.xlsx";

//		To handle file in java we have to file class object
		
		File src = new File(path);

//		to load the excel sheet we are using fileinputstream class

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugSheet");

//		wb.getSheetAt(0);

//		String value = sh1.getRow(6).getCell(0).getStringCellValue();

//		System.out.println(value);

		DataFormatter df = new DataFormatter();

		String value = df.formatCellValue(sh1.getRow(8).getCell(0));

		System.out.println(value);// 50

		int numberofrowsinsheet = sh1.getLastRowNum();

		System.out.println("Total number of rows are :" + numberofrowsinsheet);

		int numberofcolumn = sh1.getRow(0).getLastCellNum();

		System.out.println("Total number of columns are :" + numberofcolumn);

		writeData();

	}

}
