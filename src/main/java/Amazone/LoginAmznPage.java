package Amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAmznPage {
	public WebDriver driver;
	
	By userName= By.id("ap_email");
	By continueButton= By.id("continue");
	By userNameAlert= By.xpath("//*[@id=\"auth-email-missing-alert\"]/div/div");
	By AlertTextBox=By.xpath("//div[@class='a-box-inner a-alert-container'][1]");
	By InvalidAlertText=By.xpath("//span[@class='a-list-item']");
	By AlertTitle=By.xpath("//div[@class='a-box-inner a-alert-container'][1]/h4");
	
	
	
	
	
	
	
	public LoginAmznPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	

	public WebElement getEmailId() {
		return driver.findElement(userName);
	}
	
	public WebElement getContinueBttn() {
		return driver.findElement(continueButton);
	}
	
	public String getUserAlertMsg() {
		return driver.findElement(userNameAlert).getText();
	}
	
	public WebElement getAlertTextBox() {
		return driver.findElement(AlertTextBox);
	}
	
	public String getAlertTitle() {
		return driver.findElement(AlertTitle).getText();
	}
	
	public String getAlertMsg() {
		return driver.findElement(InvalidAlertText).getText();
	}
}
