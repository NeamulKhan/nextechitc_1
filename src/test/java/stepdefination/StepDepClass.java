package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDepClass {
	
WebElement driver;
@Given("^Launch URL$")
public void launch_URL() throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\108\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://demoblaze.com");	
	
   
}

@When("^I click contact$")
public void i_click_contact() throws Throwable {
	
	WebElement contact = driver.findElement(By.linkText("Contact"));
	contact.click();
    
}

@Then("^new contact window open$")
public void new_contact_window_open() throws Throwable {
    
	
}



}
