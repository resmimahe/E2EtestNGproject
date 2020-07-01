package Amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	public WebDriver driver;
	
	By yourName= By.id("ap_customer_name");
	By phoneNumber= By.id("ap_phone_number");
	By email= By.id("ap_email");
	By password= By.id("ap_password");
	By continueButton= By.id("continue");
	By NameAlert =By.xpath("//*[@id=\"auth-customerName-missing-alert\"]/div/div");
	By MobileAlert= By.xpath("//*[@id=\"auth-phoneNumber-missing-alert\"]/div/div");
	By PaswdAlert=By.xpath("//*[@id=\"auth-password-missing-alert\"]/div/div");
	By InvalidEntryAlert=By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span");
	By InvalidPhone=By.xpath("//*[@id=\"auth-phoneNumber-invalid-phone-alert\"]/div/div");
	
public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public WebElement getYourName() {
	return driver.findElement(yourName);
}	

public WebElement getPhoneNumber() {
	return driver.findElement(phoneNumber);
}

public WebElement getYourEmail() {
	return driver.findElement(email);
}

public WebElement getPassword() {
	return driver.findElement(password);
}

public WebElement getcontinueButton() {
	return driver.findElement(continueButton);
}

public String getFirstNameAlert() {
	return driver.findElement(NameAlert).getText();
}

public String getPhoneAlert() {
	return driver.findElement(MobileAlert).getText();
}

public String getPswrdAlert() {
	return driver.findElement(PaswdAlert).getText();
}

public String getInvalidPhoneAlert() {
	return driver.findElement(InvalidPhone).getText();
}

}
