package CucV2.CucV2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class LoginUser {
	
	public WebDriver driver=null;
	
	@Given("^Open the Browser$")
	public void open_the_Browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDriver/Driver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();

	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String arg1) throws Throwable {
	   driver.get("http://practice.automationtesting.in");
	}

	@When("^Click on Account Menu$")
	public void click_on_Account_Menu() throws Throwable {
	 driver.findElement(By.linkText("My Account")).click();   
	}

	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
	    driver.findElement(By.id("password")).sendKeys("Test@selenium123");
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='submit'][@name='login']")).click();
	}

	@Then("^user must login successfully$")
	public void user_must_login_successfully() throws Throwable {
	  String val= driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
	  Assert.assertEquals(true,val.contains("pavanoltraining"));
	}

}
