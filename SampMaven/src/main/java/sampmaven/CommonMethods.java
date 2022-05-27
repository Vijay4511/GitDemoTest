package sampmaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonMethods {

	

	public ArrayList<String> getdatafrmExcel(String Tcname) throws IOException
	{
		
		ArrayList<String> TcInfo = new ArrayList();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\vjred\\Desktop\\Automation Testing\\SignupData.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =wbook.getSheet("Regestration");
		
		Iterator<Row> rows= sheet.iterator();
		
		while(rows.hasNext())
		{
						
			Row specificrow = rows.next();
			
			if(specificrow.getCell(0).getStringCellValue().equalsIgnoreCase(Tcname))
			{
				Iterator<Cell> cells =specificrow.cellIterator();

				while(cells.hasNext())
				{
					Cell cellvalue = cells.next();
					TcInfo.add(cellvalue.getStringCellValue());
				}
		
			}
	
		}

		wbook.close();
		return TcInfo;
	}
	
	
	
	
	
	
	
	
	
}
