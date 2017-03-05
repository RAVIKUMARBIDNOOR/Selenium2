package testsuits.com;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import java.util.concurrent.*;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++){
WebDriver wd=new FirefoxDriver();
wd.manage().window().maximize();
wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
wd.get("http://www.google.com");
wd.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[3]/div/a")).click();
wd.findElement(By.xpath(".//*[@id='Email']")).sendKeys("rkbidnoor");
wd.findElement(By.xpath(".//*[@id='next']")).click();
wd.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("P@ssw0rd7");
wd.findElement(By.xpath(".//*[@id='signIn']")).click();
wd.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
Thread.sleep(5000);
wd.findElement(By.xpath(".//*[@id=':ih']/div/div")).click();
wd.findElement(By.cssSelector(".oj div textarea")).sendKeys("rkbidnoor7@gmail.com");
wd.findElement(By.cssSelector(".aoD.az6  input")).sendKeys("Test MSg");
wd.findElement(By.cssSelector(".Am.Al.editable.LW-avf")).sendKeys("Dear Ravi");
Thread.sleep(5000);
wd.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.T-I-atl.L3")).click();
wd.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
Thread.sleep(5000);
wd.findElement(By.cssSelector(".gb_Ha.gb_4e.gb_bf.gb_yb")).click();
//Thread.sleep(50000);
wd.close();

	}}

}
