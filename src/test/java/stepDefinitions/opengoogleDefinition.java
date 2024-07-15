package stepDefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogleDefinition 
{
     WebDriver driver;

	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	   
	}
	@When("user is typing the searchterm as {string}")
	public void user_is_typing_the_searchterm_as(String searchTerm)throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	   
	}
	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	}
	@Then("it should be open perfectly")
	public void it_should_be_open_perfectly() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("ja")).isDisplayed();
		if(status) {
		System.out.println("result displayed");
	
	}else
	{
		System.out.println("result failed");
	}

	
}}
