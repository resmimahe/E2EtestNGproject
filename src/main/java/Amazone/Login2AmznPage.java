package Amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login2AmznPage {
	public WebDriver driver; 
	
	By Password = By.id("ap_password");
	By LoginButton = By.id("signInSubmit");
	By PwdAlert= By.xpath("//*[@id=\"auth-password-missing-alert\"]/div/div");
	By AlertTitle=By.xpath("//div[@class='a-box-inner a-alert-container']/h4");
	By AlertMsg=By.xpath("//span[@class='a-list-item']");
	
	
	public Login2AmznPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}

	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
	}
	
	public String getInvalidAlert() {
		return driver.findElement(PwdAlert).getText();
	}
	
	public String getAlertTitle() {
		return driver.findElement(AlertTitle).getText();
	}
	
	public String getAlertMsg() {
		return driver.findElement(AlertMsg).getText();
	}
	

}
