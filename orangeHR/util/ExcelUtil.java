package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtil(String excelpath,String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheetName);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static int getRowCount()
	{
		int rowCount=0;
		try {
			 rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+ rowCount);
		} 
		catch(Exception exp){
			System.out.println(exp.getMessage());
			exp.getMessage();
			exp.getCause();
			}
		return rowCount;
	}
	public static int getColCount()
	{
		int colCount=0;
		try {
			 colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of column: "+ colCount);
		} 
		catch(Exception exp){
			System.out.println(exp.getMessage());
			exp.getMessage();
			exp.getCause();
			}return colCount;
	}
	public static String getCellDataString(int rowNum,int colNum) {
		String CellData=null;
		try {
			 CellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(CellData);
			
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getMessage();
			exp.getCause();
	}return CellData;
	}public static void getCellDataNumber(int rowNum,int colNum) {
		
		try {
			double Celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(Celldata);}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getMessage();
			exp.getCause();
		}
		
	}
	
}
