package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverUtility {
	static WebDriver driver;

	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
