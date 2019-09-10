package progressive.steps;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import progressive.common.progressiveBase;

public class proUserLogin extends progressiveBase {
	@Given("^Launch Browser$")
	public void launch_Browser() throws Throwable {
		driver = getDriver();
		driver.get(url);

	}

	@When("^click on signin button$")
	public void click_on_signin_button() throws Throwable {

		driver.findElement(By.cssSelector("a[id*='login_link']")).click();

	}

	@When("^put user name$")
	public void put_user_name() throws Throwable {
		driver.findElement(By.cssSelector("input[data-pgr-id*='inputUserName']")).sendKeys("ibrahimgaziqa@gmail.com");

	}

	@When("^password$")
	public void password() throws Throwable {
		driver.findElement(By.cssSelector("input[data-pgr-id*='inputPassword']")).sendKeys("passme");
		//driver.wait(5000);

	}

	@When("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
		driver.findElement(By.cssSelector("button[data-pgr-id*='buttonSubmitLogin']")).click();

	}

	@Then("^login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
		driver.quit();

	}

}
