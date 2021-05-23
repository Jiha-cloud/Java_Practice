package java_20210521;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		HSSFWorkbook workBook = new HSSFWorkbook();
		HSSFSheet sheet = workBook.createSheet();
		
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		
		cell.setCellValue("테스트 데이터(0,0)");
		cell = row.createCell(1);
		cell.setCellValue("테스터 데이터(0,1)");
		cell = row.createCell(2);
		cell.setCellValue("테스터 데이터(0,2)");
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(1,0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(1,1)");
		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(1,2)");
		
		row = sheet.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(2,0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(2,1)");
		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(2,2)");
		
		FileOutputStream fos = null;
		
		fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\testcell.xls");
		workBook.write(fos);
		
	}
}
