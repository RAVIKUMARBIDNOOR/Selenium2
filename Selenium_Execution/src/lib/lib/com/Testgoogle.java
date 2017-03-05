package lib.lib.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testgoogle {

	
		// TODO Auto-generated method stub
		@Test(dependsOnMethods={"pqr"}, alwaysRun=true)
		public void xyz() {
		System.out.println("login");
		}
		@Test
		public void pqr()
		{
			System.out.println("login success");
			Assert.assertEquals("gmail","yahoo");
		}
		@Test
		public void abd() {
			System.out.println("logout");
		
		}
	}


