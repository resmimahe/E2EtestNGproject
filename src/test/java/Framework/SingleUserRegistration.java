package Framework;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.base;
import Utility.dataProvider;


public class SingleUserRegistration extends base {
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

@Test(dataProvider ="RegData")

public void registrationNew(Map<String, String> data) throws InterruptedException {
	

demoLandingPage dl=new demoLandingPage(driver);
dl.getSkipsignIn().click();
RegistrationPage rp= new RegistrationPage(driver);

//rp.selectLanguage();
rp.getFirtsName().sendKeys(data.get("FirstName"));
rp.getLastName().sendKeys(data.get("LastName"));
rp.getAddress().sendKeys((data.get("Address")));
rp.getEmail().sendKeys((data.get("Email")));
rp.getPhoneNumber().sendKeys((data.get("Phone")));
if((data.get("Gender")).equalsIgnoreCase("male"))
{rp.getMaleRadioButton().click();
	}
else {
	rp.getFemaleRadioButton().click();
}


if((data.get("Hobbies")).equalsIgnoreCase("cricket"))
{
	rp.getCricket().click();}
else if((data.get("Hobbies")).equalsIgnoreCase("movies")) {
	rp.getMovies().click();
}
else if((data.get("Hobbies")).equalsIgnoreCase("hockey")) {
	rp.getHockey().click();
}

rp.selectSkill((data.get("Skill")));
rp.selectCountry((data.get("Country")));

rp.getPasword().sendKeys((data.get("Password")));
rp.getConfPwd().sendKeys((data.get("ConfirmPassword")));

rp.SelectCountry();
rp.getSubmitButton().click();


	
}

@DataProvider
public Object[][] RegData()
{ 
	Object[][] Data= dataProvider.getData();
	return Data;
	}


@AfterTest

public void TearDown() {
//driver.quit();
}

}
