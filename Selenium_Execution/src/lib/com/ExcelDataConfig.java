package lib.com;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataConfig {
	
	XSSFSheet s;
	XSSFWorkbook ws;

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	public	ExcelDataConfig()
		{
		try{
			File f=new File("C:/Users/IBM_ADMIN/Desktop/Test Automation/DS.xlsx");
			FileInputStream fis=new FileInputStream(f);
			ws=new XSSFWorkbook(fis);
			
			
		}
		catch(Exception e)
		{
			System.out.println("emessage:"+e);
		}
		}

	public String readData(int sheetnum,int row,int column)
	{
		s=ws.getSheetAt(0);
		String data=s.getRow(row).getCell(column).getStringCellValue();
		return data;
	}}

	



