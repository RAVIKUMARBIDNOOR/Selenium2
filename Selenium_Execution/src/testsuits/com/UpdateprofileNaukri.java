package testsuits.com;


import java.util.concurrent.TimeUnit;






import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






import java.io.*;



public class UpdateprofileNaukri {
	public static void main(String[] args) throws InterruptedException, IOException
	{
//		WebDriver wd=new FirefoxDriver();
//		wd.manage().window().maximize();
//		wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		File src=new File("C:/Users/IBM_ADMIN/Desktop/Test Automation/DS.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheet("Sheet1");
	int rowcount=s.getLastRowNum();
	System.out.println("TOTAL NUMBER OF ROWS: "+rowcount);
	for(int i=0;i<rowcount;i++)
	{
		if(i%2!=0){
		String str=s.getRow(i).getCell(1).getStringCellValue();
		System.out.println("All user names are:"+str);
		}
	}
		
	
	
	}

}
