package lib.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EscapOption {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

	    WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wd.get("http://jqueryui.com/slider/");
		wd.navigate().refresh();
		Thread.sleep(3000);
		wd.switchTo().frame(wd.findElement(By.cssSelector(".demo-frame")));
		Actions act=new Actions(wd);
		WebElement wel=wd.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));
		Thread.sleep(3000);
		act.clickAndHold(wel).moveByOffset(100,0).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(wel).moveByOffset(20,0).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(wel).moveByOffset(-120,0).release().build().perform();

	}

}
