package lib.com;

import java.awt.AWTException;

import org.testng.annotations.*;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DataSheet {


		// TODO Auto-generated method stub
		//File f=new File(path)
		ExcelDataConfig e=new ExcelDataConfig();
		@Test
		
			public void test1() throws AWTException
			{
    WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	wd.get("https://login.naukri.com/nLogin/Login.php?msg=2&URL=http%3A%2F%2Fmy.naukri.com%2FHomePage%2Fview");
	wd.findElement(By.id("emailTxt")).sendKeys(e.readData(0, 1, 0));
	wd.findElement(By.xpath(".//*[@id='pwd1']")).sendKeys(e.readData(0, 1, 1));
    wd.findElement(By.cssSelector(".logSBtn.ga-bind")).click();
    try{
	WebElement we=wd.findElement(By.cssSelector(".feedbackBtn.fl"));
	{
		if(we.isEnabled())
		    {
			we.click();
			}}}
    catch(Exception e1){
    	System.out.println("Element not found:"+e1);
    }
	
//else{
	//Thread.sleep(2000); 

	
	Actions act=new Actions(wd);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	WebElement wl=wd.findElement(By.cssSelector(".topIcon.user"));
	act.moveToElement(wl).perform();
	wd.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/div/ul/li[1]/a")).click();
	String parent=wd.getWindowHandle();
	Set<String> s=wd.getWindowHandles();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		String child=(String) it.next();
		if(parent.equalsIgnoreCase(child));
		{
			wd.switchTo().window(child);
		}
	}
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	wd.findElement(By.id("mailCityName")).clear();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	wd.findElement(By.id("mailCityName")).sendKeys("Gulbarga");
	wd.findElement(By.cssSelector(".w150bt.fl")).click();
	//wd.switchTo().window(parent);
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	    JavascriptExecutor je=(JavascriptExecutor)wd;
	    je.executeScript("scroll(0,2300)");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    wd.findElement(By.xpath(".//*[@id='deleteLink1']")).click();
	  wd.findElement(By.xpath(".//*[@id='deleteLayer']/div[3]/div/div[2]/button")).click();
	wd.findElement(By.xpath(".//*[@id='uploadLink']")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	wd.findElement(By.xpath(".//*[@id='attachCV']")).click();
	StringSelection ss=new StringSelection("C:\\Users\\IBM_ADMIN\\Desktop\\QA_08.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	//wd.findElement(By.xpath(".//[@id='attachCV']")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\QA_08.docx");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	wd.findElement(By.cssSelector(".w85bt.fl")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	//Thread.sleep(5000);
//    je.executeScript("scroll(0,2300)");
//    wd.findElement(By.cssSelector(".w85bt.fl")).click();
//    Thread.sleep(2000);
   // je.executeScript("scroll(0,100)");
   // Thread.sleep(2000);
    WebElement w2=wd.findElement(By.cssSelector(".topIcon.user"));
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	act.moveToElement(w2).perform();
	wd.findElement(By.cssSelector(".logout")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    wd.close();
    wd.switchTo().window(parent);
    wd.close();
	}}

