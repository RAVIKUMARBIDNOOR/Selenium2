package testsuits.com;

import org.openqa.selenium.*;

import java.util.*;
import java.awt.*;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.*;

public class PedSupport {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\QA_08.docx");
		{
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		wd.get("https://accounts.google.com/SignUp?hl=en-GB");
	    String parent=wd.getWindowHandle();
	   // Webelemwd.findElement("").click();
	    System.out.println("parent window"+parent);
	    wd.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
	    Set<String> s1=wd.getWindowHandles();
	   Iterator it= s1.iterator();
	   while(it.hasNext())
	   {
		  String child=(String) it.next();
		  if(!parent.equalsIgnoreCase(child))
		  {
			  wd.switchTo().window(child);
			  Thread.sleep(2000);
			  System.out.println(wd.getTitle());
			  wd.findElement(By.linkText("Date of birth")).click();
			  //wd.close();
		  }
	   }
	   
	   wd.switchTo().window(parent);	
	   wd.close();
	}

}}
