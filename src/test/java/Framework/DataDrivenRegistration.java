package Framework;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.base;
import Utility.excelGetData;



public class DataDrivenRegistration extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
@BeforeTest
	
	public void InitialSetup() throws IOException, InterruptedException {
		
		driver=IntialSetup();
		log.info("Broswer setup is done");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000L); 
		
		driver.get(prop.getProperty("url"));
		log.info("Reached Home page ");
	}

@Test(dataProvider="UserSignup")

public void registrationNew(String FirstName, String LastName,String Address, String Email ,String Phone,
		String Password,String ConfirmPassword, String Gender, String Hobbies) {
	
demoLandingPage dl=new demoLandingPage(driver);
dl.getSkipsignIn().click();
RegistrationPage rp= new RegistrationPage(driver);
rp.getFirtsName().sendKeys(FirstName);
rp.getLastName().sendKeys(LastName);
rp.getAddress().sendKeys(Address);
rp.getEmail().sendKeys(Email);
rp.getPhoneNumber().sendKeys(Phone);
if(Gender.equalsIgnoreCase("male"))
{rp.getMaleRadioButton().click();
	}
else {
	rp.getFemaleRadioButton().click();
}

if(Hobbies.equalsIgnoreCase("cricket"))
{
	rp.getCricket().click();}
else if(Hobbies.equalsIgnoreCase("movies")) {
	rp.getMovies().click();
}
else if(Hobbies.equalsIgnoreCase("hockey")) {
	rp.getHockey().click();
}

rp.getPasword().sendKeys(Password);
rp.getConfPwd().sendKeys(ConfirmPassword);
	
}
excelGetData data= new excelGetData(driver);

@DataProvider(name="UserSignup")
public  ArrayList<String> DataProvider() throws IOException {
	ArrayList<String> Object =data.getData("C:\\Users\\Resmi Mahesan\\eclipse-workspace\\E2EProject\\src\\main\\resources\\TestData.xlsx",
			"Registration");
	 
	return Object;
}

@AfterTest

public void TearDown() {
//driver.quit();
}

}
