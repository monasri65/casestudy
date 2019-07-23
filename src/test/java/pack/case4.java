package pack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browser.driverUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class case4 {
	WebDriver driver;
	@Given("^alex must be in login page$")
	public void alex_must_be_in_login_page() throws Throwable {
		driver= driverUtility.startBrowser("chrome","http://10.232.237.143:443/TestMeApp");
		   driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^alex enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void alex_enters_and(String arg1, String arg2) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Login"));
		  driver.findElement(By.id("userName")).sendKeys(arg1);
		  driver.findElement(By.name("password")).sendKeys(arg2);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^alex should be in home page$")
	public void alex_should_be_in_home_page() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}

	@Given("^Alex should be logged in and in home page$")
	public void alex_should_be_logged_in_and_in_home_page() throws Throwable {
		String user = driver.findElement(By.className("nav")).getText();
		Assert.assertTrue(user.contains("Lalitha"));
	}

	@When("^Alex search for headphones in search field$")
	public void alex_search_for_headphones_in_search_field() throws Throwable {
	    driver.findElement(By.id("myInput")).sendKeys("Head");
	    Actions act=new Actions(driver);
	    act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	    driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("^try to proceed with the payment without adding any item in the cart$")
	public void try_to_proceed_with_the_payment_without_adding_any_item_in_the_cart() throws Throwable {
	    
	}

	@Then("^testme doesn't display the cart icon$")
	public void testme_doesn_t_display_the_cart_icon() throws Throwable {
		 boolean a = element();
		 Assert.assertFalse(a);
			 driver.close();
	}
	public boolean element()
	{
		try{
			driver.findElement(By.partialLinkText("Cart"));
			return true;
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			return false;
		}
	}

	@When("^try to proceed with the payment after adding any item in the cart$")
	public void try_to_proceed_with_the_payment_after_adding_any_item_in_the_cart() throws Throwable {
	    driver.findElement(By.partialLinkText("Add")).click();
	}

	@Then("^testme should display the cart icon$")
	public void testme_should_display_the_cart_icon() throws Throwable {
		WebElement element = driver.findElement(By.partialLinkText("Cart"));
		Assert.assertTrue(element.isDisplayed());
		driver.close();
	}


}
