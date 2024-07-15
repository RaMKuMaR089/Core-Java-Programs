package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivencucmberstepdefinition 
{   
	WebDriver driver;	
	@Given("we have to enter login page of OrangeHRM")
	public void we_have_to_enter_login_page_of_orange_hrm() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);		
	}

	@When("we enter login credentials")
	public void we_enter_login_credentials(DataTable dataTable) throws Throwable
	{
	   	List<String> credentials = dataTable.asList(String.class);
	   	String username = credentials.get(0);
	   	String password = credentials.get(1);
	   	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
			}

	@Then("we have to click login button")
	public void we_have_to_click_login_button()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}

}
