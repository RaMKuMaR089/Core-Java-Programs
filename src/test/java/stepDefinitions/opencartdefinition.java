package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class opencartdefinition
{
	WebDriver driver;

	@Given("user is entering opencart link by {string}")
	public void userIsEnteringOpencartLinkBy(String string)
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    //throw new io.cucumber.java.PendingException();
	}
	@When("user have to check logo is diplayed or not")
	public void userHaveToClickTabletsTabInViewbar() throws InterruptedException 
	{
		Thread.sleep(3000);
	   boolean status =driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();		
	   System.out.println(status);
	}
	
	    
	@When("user need to search mobile in search bar")
	public void userNeedToClickAnyTabLists() 
	{
	 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mobile");
	    
	}
	@Then("user can able to close window")
	public void userCanAbleToFindProductsWhatTheyWant() throws InterruptedException 
	{
	 Thread.sleep(3000);  
	 
	 driver.close();
	}




}
