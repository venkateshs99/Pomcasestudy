package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver BrowserOptions(String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\S VENKATESH\\eclipse-workspace\\PomCasestudy\\SeleniumBrowerJars\\chromedriver.exe");
			
			driver= new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\Locators in selinium1\\FirefoxBrowser\\geckodriver.exe");
		
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
}



