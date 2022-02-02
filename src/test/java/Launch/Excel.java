package Launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.google.common.collect.Table.Cell;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\hanif\\eclipse-workspace\\Sample\\target\\TestData\\data.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("hanif");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					org.apache.poi.ss.usermodel.Cell cell = r.getCell(j);
			
					int cellType = cell.getCellType();
					
					if (cellType==1) {
						String val = cell.getStringCellValue();
						System.out.println(val);
					}
					else if (cellType==0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date d = cell.getDateCellValue();
							
							SimpleDateFormat sim = new SimpleDateFormat("dd, MMMM, yyyy");
							String val = sim.format(d);
							System.out.println(val);
							
							
						}
						else {
							double d = cell.getNumericCellValue();
							long l = (long)d;
							String value = String.valueOf(l);
							System.out.println(value
									
									);
						}
						
						
						
						
					}
					
					
			}
		}
		
		
	}

}
