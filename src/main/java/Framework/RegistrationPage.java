package Framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	public WebDriver driver;
	
	By firstName= By.xpath("//input[@placeholder='First Name']");
	By lastName= By.xpath("//input[@placeholder='Last Name']");
	By address= By.xpath("//textarea[@ng-model='Adress']");
	By email= By.xpath("//input[@type='email']");
	By phoneNumber= By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type='tel']");
	By maleradioButton= By.xpath("//input[@type='radio' and @value='Male']");
	By femaleradioButton= By.xpath("//input[@type='radio' and @value='FeMale']");
	By cricket= By.xpath("//input[@value='Cricket']");
	By movies= By.xpath("//input[@value='Movies']");
	By hockey= By.xpath("//input[@value='Hockey']");
	By skills= By.xpath("//select[@id='Skills']");
	By countries= By.xpath("//select[@id='countries']");
	By selectcountries= By.xpath("//span[@aria-labelledby='select2-country-container']");
	By yearbox= By.xpath("//select[@id='yearbox']");
	By month= By.xpath("//select[@placeholder='Month']");
	By day= By.xpath("//select[@id='daybox']");
	By password= By.xpath("//input[@id='firstpassword']");
	By confirmPassword= By.xpath("//input[@id='secondpassword']");
	By submit= By.xpath("///button[@id='submitbtn']");
	By refresh= By.xpath("//button[@id='Button1']");
	By chooseFile= By.xpath("//input[@id='imagesrc']");
	By attachedFile= By.xpath("//img[@id='imagetrgt']");
	By language= By.xpath("//div[@id='msdd']");
	By languageEn= By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li//a[text()='Arabic']");
	By SelectCountryText= By.xpath("//input[@class='select2-search__field']");
	
	
	public RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}


	public WebElement getFirtsName() {
		
		return driver.findElement(firstName);
	}
	
	
public WebElement getLastName() {
		
		return driver.findElement(lastName);
	}
public WebElement getAddress() {
	
	return driver.findElement(address);
}
public WebElement getEmail() {
	
	return driver.findElement(email);
}
public WebElement getPhoneNumber() {
	
	return driver.findElement(phoneNumber);
}
public WebElement getMaleRadioButton() {
	
	return driver.findElement(maleradioButton);
}
public WebElement getCricket() {
	
	return driver.findElement(cricket);
}
	
public WebElement getFemaleRadioButton() {
	
	return driver.findElement(femaleradioButton);
}
public WebElement getMovies() {
	
	return driver.findElement(movies);
}
public WebElement getHockey() {
	
	return driver.findElement(hockey);
}
public WebElement getSkills() {
	
	return driver.findElement(skills);
}
public WebElement getCountries() {
	
	return driver.findElement(countries);
}
public WebElement getSelectCountries() {
	
	return driver.findElement(selectcountries);
}
public WebElement getYearbox() {
	
	return driver.findElement(yearbox);
}
public WebElement getMonth() {
	
	return driver.findElement(month);
}
public WebElement getDay() {
	
	return driver.findElement(day);
}
	
public WebElement getPasword() {
	
	return driver.findElement(password);
}
	
public WebElement getConfPwd() {
	
	return driver.findElement(confirmPassword);
}
	
public WebElement getSubmitButton() {
	
	return driver.findElement(submit);
}
public WebElement getRefreshButton() {
	
	return driver.findElement(refresh);
}
public WebElement getChooseFile() {
	
	return driver.findElement(chooseFile);
}
public WebElement getAttachedFile() {
	
	return driver.findElement(attachedFile);
}

public Select selectSkill(String Value) {
	WebElement Skill= getSkills();
	Select S= new Select(Skill);
	S.selectByVisibleText(Value);
	return S;
}

public Select selectCountry(String Value) {
	WebElement Country= getCountries();
	Select S= new Select(Country);
	S.selectByVisibleText(Value);
	return S;
}

public void selectLanguage() throws InterruptedException {
	

    WebElement second=driver.findElement(language);
    second.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//li[@class='ng-scope']//a[text()='Catalan']")).click();
}


public void SelectCountry() throws InterruptedException {
	
	getSelectCountries().click();
	driver.findElement(By.xpath("//li[@class='select2-results__option' and text()='Denmark']")).click();

}

}
