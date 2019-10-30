package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitons
{
	WebDriver driver;
	
	@When("^I login into stockAccounting Url on Chrome Browser$")
	public void i_login_into_stockAccounting_Url_on_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\mrng930batch\\CucumberFramework\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://webapp.qedge.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("^I click reset button on Login Page$")
	public void i_click_reset_button_on_Login_Page() throws Throwable {
	  driver.findElement(By.id("btnreset")).click();
	   
	}

	@When("^I enter admin in UserName Field$")
	public void i_enter_admin_in_UserName_Field() throws Throwable {
		 driver.findElement(By.id("username")).sendKeys("admin");
	}
	
	@When("^I enter master in Password Field$")
	public void i_enter_master_in_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("master");
	}

	@When("^I click login Button$")
	public void i_click_login_Button() throws Throwable {
		driver.findElement(By.id("btnsubmit")).click();
	}

	@When("^I wait for Logout Link$")
	public void i_wait_for_Logout_Link() throws Throwable {
	  Thread.sleep(5000);
	}

	@Then("^I validate the title of the Home page and close the Browser$")
	public void i_validate_the_title_of_the_Home_page_and_close_the_Browser() throws Throwable {
	   String expTitle="Dashboard « Stock Accounting";
	   String actTitle=driver.getTitle();
	   if(expTitle.equalsIgnoreCase(actTitle))
	   {
		   System.out.println("title validation passed");
	   }
	   else
	   {
		   System.out.println("title validation failed");
	   }
	   driver.close();
	  
	}
}
