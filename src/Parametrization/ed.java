package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ed {
	public static void main(String[] args) throws Throwable {
		
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\KIRAN PAWAR\\\\Desktop\\\\Kiran\\\\excel\\\\kp.xlsx");
//	double data = WorkbookFactory.create(file).getSheet("reel").getRow(1).getCell(1).getNumericCellValue();
    String data1 = WorkbookFactory.create(file).getSheet("reel").getRow(5).getCell(2).getStringCellValue();
	System.out.println(data1+" ");
}
}