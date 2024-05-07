package LoginPage;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage {
	
		@Given("^Open Browser$")
		public void opne_browser() throws InterruptedException {
			
			ChromeDriver driver;
			driver= new ChromeDriver();
			driver.navigate().to("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Open Browser");
		}

		@When("^Search Product$")
		public void search_product() {
			System.out.println("search_product");
		}
	

}
