package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		getRowCount();
		getCellDataString();
		getNumaricCellValue();
	}
	public static void getRowCount(){

		XSSFWorkbook workbook;
		XSSFSheet sheet;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\XL\\Data.xlsx");
			sheet = workbook.getSheet("sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("RowCount"+rowcount);

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getCellDataString(){
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\XL\\Data.xlsx");
			XSSFSheet sheet = workbook.getSheet("sheet1");
			String Celldata = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Cell data " +Celldata);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void getNumaricCellValue(){
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\XL\\Data.xlsx");
			XSSFSheet sheet = workbook.getSheet("sheet1");
			Double Celldata1 = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("Cell data " +Celldata1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
