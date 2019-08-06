package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadDataFromExcel("C:\\Users\\DELL\\Desktop\\Book1.xlsx", "Sheet3");
	}

	public static void ReadDataFromExcel(String filepath, String sheetName) throws IOException {

		ArrayList<HashMap<String, String>> myData = new ArrayList<HashMap<String, String>>();

		FileInputStream fs = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		Row HeaderRow = sheet.getRow(0);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			HashMap<String, String> currentHash = new HashMap<String, String>();
			Row currentRow = sheet.getRow(i);
			for (int j = 0; j < HeaderRow.getPhysicalNumberOfCells(); j++) {
				
				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentRow.getCell(j).getStringCellValue());

			}
			myData.add(currentHash);

		}

		System.out.println(myData.get(4).get("EmpName"));
		System.out.println(myData.get(7).get("Comments"));
		//System.out.println(myData);
	}
}