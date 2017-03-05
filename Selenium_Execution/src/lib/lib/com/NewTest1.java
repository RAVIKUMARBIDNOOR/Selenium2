package lib.lib.com;


import java.util.Scanner;

import org.testng.annotations.*;

public class NewTest1 {
  @Test(groups={"purchase"})
  public void po1() {
	  
	  System.out.println("Purchase order 1");
	
  }
 
  @AfterClass(groups={"purcahse","sales"})
  public void afterf1()
  {
	  
System.out.println("Running after fun");
	  
	  
  }
  @BeforeClass(groups={"purcahse","sales"})
  public void bforef1()
  {
	  System.out.println("running before fun");
	  
	 
	  
  }

			
  @Test(groups={"sales","purchase"})

  public void so1()
  {
  	  System.out.println("Sales and Purcahse order 1");
  }
  
@Test(groups={"purchase"})

public void po2()
{
	  System.out.println("Purchase order 2");
}
		
@Test(groups={"purchase"})

public void po3()
{
	System.out.println("Purchase order 3");
	
}

@Test(groups={"sales"})

public void so2()
{
	  System.out.println("Sales order 2");
}
		
@Test(groups={"sales"})

public void so3()
{
	System.out.println("Sales order 3");
	
}


}

