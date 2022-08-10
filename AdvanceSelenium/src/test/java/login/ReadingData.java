package login;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadingData {
	@DataProvider(name = "test data")
	public static Object[][] readData() throws IOException{
		FileInputStream fis=new FileInputStream("./TestData/Data.xlsx");

		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		int row_count=sheet.getPhysicalNumberOfRows();

		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data=new Object[row_count][col_count];

		for(int r=0;r<=row_count-1;r++) {
			Row row=sheet.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++) {
				data[r][c]=row.getCell(c).getStringCellValue();
			}
		}
		return data;
	}
}

