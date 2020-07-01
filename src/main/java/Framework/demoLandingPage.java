package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoLandingPage {
	
	public WebDriver driver;
	
	By signIn= By.xpath("//button[@id='btn1']");
	
	By SkipsignIn= By.xpath("//button[@id='btn2']");
	By Email= By.id("email");
	By SignupButton= By.xpath("//img[@id='enterimg']");
	
	
	
	public demoLandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getSignIn() {
		return driver.findElement(signIn);
	} 
	
	public WebElement getSkipsignIn() {
		return driver.findElement(SkipsignIn);
	} 
	
	public WebElement getSignupInput() {
		return driver.findElement(Email);
	} 
	
	public WebElement getSignupButton() {
		return driver.findElement(SignupButton);
	} 
	
}
