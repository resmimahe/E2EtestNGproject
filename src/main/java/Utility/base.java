package Utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver IntialSetup() throws IOException {
		
		
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Resmi Mahesan\\EclipseWorkspaceNew\\E2Eproject\\src\\main\\resources\\data.properties");
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		//If you are getting a prpty value u can not put = , u should use the function instead
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			//Firefox code
		}
		else if(BrowserName.equals("IE"))
				{
			//IE code
				}
		//Set the Implicit wait for initialization
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//always remember to return the driver so that which ever class is using this could access the driver
		return driver;
		
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	public String getScreenshot(String TestName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String Destination= System.getProperty("user.dir")+"\\reports\\"+TestName+".png";
		FileUtils.copyFile(source,new File(Destination));
		return Destination;
		
		
	}

}
