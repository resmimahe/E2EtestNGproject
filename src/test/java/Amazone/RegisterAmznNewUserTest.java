package Amazone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.base;
import Utility.dataProvider;

public class RegisterAmznNewUserTest extends base{
	public WebDriver driver; 
	
@BeforeTest
public void SetupTest() throws IOException {
	
	driver=IntialSetup();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url1"));
}


@Test(dataProvider ="getData")
public void RegistrationTest(String FirstName, String Phonenumbr, String Email,String Passwrd) {
	
	LandinAmznPage lp = new LandinAmznPage(driver);
	lp.getSignInPage();
	RegisterPage rp=new RegisterPage(driver);
	rp.getYourName().sendKeys(FirstName);
	rp.getPhoneNumber().sendKeys(Phonenumbr);
	rp.getYourEmail().sendKeys(Email);
	rp.getPassword().sendKeys(Passwrd);
	rp.getcontinueButton().click();
	
}
	@DataProvider
	
	public Object[][] getData() {
		Object[][] Data= dataProvider.GetdataAmzn();
		return Data;
		
	}

}
