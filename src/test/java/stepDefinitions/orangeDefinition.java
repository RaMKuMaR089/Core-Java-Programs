package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeDefinition
{
       WebDriver driver;
       
       @Given("url of orangehrm have to be open")
       public void url_of_orangehrm_have_to_be_open()
       {
    	driver = new ChromeDriver();
   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           //throw new io.cucumber.java.PendingException();
       }
       
	@Given("provided username is {string}")
	public void provided_username_is(String username)
	{
		
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	    element.sendKeys(username);
	}
	@Given("provided password is {string}")
	public void provided_password_is(String password) 
	{
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	    
	}
	@When("click login button")
	public void click_login_button()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			    
	}
	@Then("Home Dashboard should be open")
	public void home_dashboard_should_be_open()
	{
	    boolean status = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")).isDisplayed();
		System.out.println(status);
	}
	
}
