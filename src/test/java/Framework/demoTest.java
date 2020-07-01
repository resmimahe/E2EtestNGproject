package Framework;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.base;





public class demoTest extends base {
	public WebDriver driver;	
@BeforeTest
	
	public void InitialSetup() throws IOException, InterruptedException {
		
		driver=IntialSetup();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000L); 
		
		driver.get(prop.getProperty("url"));
	}

@Test(dataProvider="getData")
	
	public void SigupTest(String Email) throws IOException {
		//the argument number should match with the data passing
	
	demoLandingPage dl=new demoLandingPage(driver);
	
	Assert.assertEquals(dl.getSignIn().getText(), "SignIn");
dl.getSignupInput().sendKeys(Email);
dl.getSignupButton().click();
	
	}
	
	@DataProvider
	public Object[] getData()
	{
		//the row should rep the number of data types we are passing
		//the column should rep the number of iteration
		//makesure that the object size should be number of data passed, not count from 0 start from 1	
		Object [] data= new Object[2];
		//Ist Iteration
		data[0]="jhgjhfhf@jg.hvh";
		data[1]="hjvjg@jgjg.vugu";
		//2nd iteration
			
		return data;
		
		
	}
@AfterTest
	
	public void TeatDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
