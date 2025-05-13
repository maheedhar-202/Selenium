package Interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Findout_highest_Salary {
	public static void main(String[] args) throws FileNotFoundException {
		File f= new File("");
		FileInputStream fi= new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet s = wb.getSheet("Employee");
		HashMap<String,Double> hm=new HashMap<String, Double>();
		
		for(int i=0;i<=s.getLastRowNum();i++) {
			for(int j=1;j<=s.getLastRowNum();j++) {
			if(s.getRow(i).getCell(j).getStringCellValue().equals("Maheedhar")) {
				  double salary = s.getRow(i).getCell(1).getNumericCellValue();
				  hm.put(s.getRow(i).getCell(j).getStringCellValue(), salary);
				  
			}
			
			}
		}
		
	}

}
