package lib.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		 WebDriver wd=new FirefoxDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			wd.get("https://www.google.com/");
			Actions act=new Actions(wd);
			WebElement we=wd.findElement(By.id("lst-ib"));
			act.contextClick(we).build().perform();
			wd.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
			wd.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
			wd.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
			wd.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
			//wd.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			//wd.close();
			

	}

}
