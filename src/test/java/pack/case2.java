package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import browser.driverUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case2 {
	WebDriver driver;
	@Given("^user must be in login page$")
	public void user_must_be_in_login_page() throws Throwable {
		driver= driverUtility.startBrowser("chrome","http://10.232.237.143:443/TestMeApp");
		   driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		 Assert.assertTrue(driver.getTitle().contains("Login"));
		  driver.findElement(By.id("userName")).sendKeys(arg1);
		  driver.findElement(By.name("password")).sendKeys(arg2);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^user should be in home page$")
	public void user_should_be_in_home_page() throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains("Home"));
	    driver.close();
	}

}
