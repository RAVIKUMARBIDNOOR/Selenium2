package lib.lib.com;

import org.testng.annotations.*;

public class NewTest2 {
	
	@Test
	public void teststub()
	{
		System.out.println("Second class running");
		System.out.println("Class name"+getClass().getSimpleName()+"   with  "+Thread.currentThread().getId());
		
	}
	@Test
	public void teststub1()
	{
		System.out.println("Second class running");
		System.out.println("Class name"+getClass().getSimpleName()+"   with  "+Thread.currentThread().getId());
		
	}
	@Test
	public void teststub2()
	{
		System.out.println("Second class running");
		System.out.println("Class name"+getClass().getSimpleName()+"   with  "+Thread.currentThread().getId());
		
	}

	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("Running before suite");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("Running after suite");
	}
	

}
