package util;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		ExcelUtil excel=new ExcelUtil(projectPath+"/excel/data.xlsx","Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumber(1,1);

	}

}
