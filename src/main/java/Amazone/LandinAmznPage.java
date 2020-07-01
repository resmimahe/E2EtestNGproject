package Amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LandinAmznPage {

	public WebDriver driver;
	
By signInNav= By.xpath("//a[@id='nav-link-accountList']");
By startHere=By.xpath("//a[@class='nav-a' and text()='Start here.'][1]");
By signInButton=By.xpath("//span[@class='nav-action-inner' and text()='Sign in'][1]");
By LoginUser=By.xpath("//div[@class='nav-line-1-container']//span[@class='nav-line-1'][1]");



public LandinAmznPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public void getSignInPage() {
	
	Actions A= new Actions(driver);
	A.moveToElement(driver.findElement(signInNav)).perform();
	A.moveToElement(driver.findElement(startHere)).click();
	A.build().perform();
	
	
}

public void getSignIn() {
	Actions A = new Actions(driver);
	A.moveToElement(driver.findElement(signInNav)).perform();
	A.moveToElement(driver.findElement(signInButton)).click();
	A.build().perform();
}

public String getLoginDetails() {
	
	return driver.findElement(LoginUser).getText();
}

	
}


