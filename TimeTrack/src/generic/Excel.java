package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Excel 
{
	public static String getCellValue(String PATH, String Sheet, int row, int col)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(PATH);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(Sheet).getRow(row).getCell(col);
			v=c.getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log("Excel is not found",true);
			Assert.fail();
		}
		return v;
	}
}
