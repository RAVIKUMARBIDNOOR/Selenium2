package lib.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoverandover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	    WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wd.get("https://www.rightstart.com/");
		wd.findElement(By.id("closewelcomeRedirectPopupDialog")).click();
		Actions act=new Actions(wd);
		WebElement we=wd.findElement(By.xpath(".//*[@id='navigation-top-cat-label-406']"));
		act.moveToElement(we).build().perform();
		Thread.sleep(3000);
		we=wd.findElement(By.xpath(".//*[@id='navigation-top-cat-label-2670']"));
		act.moveToElement(we).build().perform();
		Thread.sleep(2000);
		System.out.println(we.getText());
		wd.findElement(By.xpath(".//*[@id='navigation-top-cat-label-337']")).click();;
		//act.moveToElement(we).click().build().perform();
	    Thread.sleep(5000);
		wd.close();
		
		

	}

}
