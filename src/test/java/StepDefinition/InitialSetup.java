package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.*;

public class InitialSetup {
	WebDriver driver; 
	
	@BeforeAll
	public static void beforeall() {
		System.out.println("BeforeAll executed");
	}
	
	@Given("Initialize web deriver and open the google site")
	public void fun() {
		System.out.println("Given executed");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Closing the browser");
		driver.quit();
	}
	
	@When("execute when")
	public void testWhen() {
		System.out.println("When executed");
	}
	
	@Then("execute Then")
	public void testThen() {
		System.out.println("Then executed");
		
	}
   
	@AfterAll
	public static void endTest() {
		
		System.out.println("AfterAll execited");
	}
}
