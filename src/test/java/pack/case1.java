package pack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import browser.driverUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver;
	@Given("^user must open the TestMeApp in the desired browser$")
	public void user_must_open_the_TestMeApp_in_the_desired_browser() throws Throwable {
	   driver= driverUtility.startBrowser("chrome","http://10.232.237.143:443/TestMeApp");
	   driver.findElement(By.partialLinkText("SignUp")).click();
	}
	@When("^user fills the username with \"([^\"]*)\" , firstname with \"([^\"]*)\" ,lastname with \"([^\"]*)\" and password with \"([^\"]*)\"$")
	public void user_fills_the_username_with_firstname_with_lastname_with_and_password_with(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(arg1);
	    driver.findElement(By.name("firstName")).sendKeys(arg2);
		driver.findElement(By.name("lastName")).sendKeys(arg3);
		driver.findElement(By.name("password")).sendKeys(arg4);
		driver.findElement(By.name("confirmPassword")).sendKeys(arg4);
	}
	@When("^user fills email id with \"([^\"]*)\" ,mobile no\\. with \"([^\"]*)\" and dob with \"([^\"]*)\"$")
	public void user_fills_email_id_with_mobile_no_with_and_dob_with(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	    driver.findElement(By.name("mobileNumber")).sendKeys(arg2);
		driver.findElement(By.name("dob")).sendKeys(arg3);
	}
	@When("^user fills address as \"([^\"]*)\" and answer with \"([^\"]*)\"$")
	public void user_fills_address_as_and_answer_with(String arg1, String arg2) throws Throwable {
		 driver.findElement(By.name("address")).sendKeys(arg1);
		 Select ques=new Select(driver.findElement(By.name("securityQuestion")));
		 ques.selectByIndex(2);
		 driver.findElement(By.name("answer")).sendKeys(arg2);
		 Thread.sleep(4000);
		 driver.findElement(By.name("Submit")).click();
		 Thread.sleep(4000);
	}


	@Then("^user should be directed to login page$")
	public void user_should_be_directed_to_login_page() throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains("Login"));
	    driver.close();
	}

}
