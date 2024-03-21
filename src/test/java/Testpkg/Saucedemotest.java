package Testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Saucedemologinpage;
import Utilities.Saucedemoutilities;

public class Saucedemotest extends Baseclass {
	
	@Test
	public void verifyloginpage()throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Saucedemologinpage ob=new Saucedemologinpage(driver);
		
		String xl="C:\\Users\\prave\\Downloads\\saucedemoprjct.xlsx";
		String Sheet="sheet1";
		int rowCount =Saucedemoutilities.getRowCount(xl, Sheet);
		
		for(int i=1;i<=rowCount;i++)
		{

            String un=Saucedemoutilities.getcellvalue(xl, Sheet, i,0);
               System.out.println("username---"+un);
            String Pwd=Saucedemoutilities.getcellvalue(xl, Sheet,i,1);
             System.out.println("password---"+Pwd);
             
             ob.setvalues(un, Pwd);
             ob.clickloginbtn();
             
             
             
             String expectedurl="https://www.saucedemo.com/v1/";
  			  String actualurl= driver.getCurrentUrl();
  			  
  			  
  			     if(actualurl.equals(expectedurl))
  			     {
  			    	System.out.println("pass");
  			     }else
  			     {
  			    	System.out.println("fail");
  			     }               
		}
		ob.Addtocart();
		ob.clickcart();
		Thread.sleep(2000);
		ob.checkout();
		Thread.sleep(5000);
		ob.adddetails();
		Thread.sleep(3000);
		ob.hamburgermenu();
		Thread.sleep(3000);
		ob.logout();
		
	}

}
