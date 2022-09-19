package Parametrization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet {
	public static void main(String[] args) throws Throwable {
		//create object of fileinputstream class
			FileInputStream file=new FileInputStream("C:\\Users\\KIRAN PAWAR\\Desktop\\Kiran\\excel\\kp.xlsx");
			//open excel sheet using create method
			  String data = WorkbookFactory.create(file).getSheet("kp").getRow(1).getCell(1).getStringCellValue();
			//print data in ecel sheet
			System.out.print(data);
		}
		}	