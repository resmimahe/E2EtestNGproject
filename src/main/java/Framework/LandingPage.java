package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By Login= By.xpath("//button[@label='login-button']");
	By Email=By.xpath("//button[@data-testid='login-email-button']");
	By EmailInput=By.xpath("//input[@type='email']");
	By LoginNext=By.xpath("//button[@data-testid=\"account-detection-button\"]");
	By Password=By.xpath("//input[@type=\"password\"]");
	By LoginButton=By.xpath("//button[@data-testid=\"login-button\"]");
	
	
	//Created constructor for getting the driver life from test class
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		//Giving the life to this class driver
	}


	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	 
	public WebElement getLoginMethod()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getEmail() {
		return driver.findElement(EmailInput);
	}
	
	
	public WebElement nextButton() {
		return driver.findElement(LoginNext);
	}
	
	public WebElement passwordInput() {
		return driver.findElement(Password);
	}
	
	public WebElement loginButton() {
		return driver.findElement(LoginButton);
	}
	
}
