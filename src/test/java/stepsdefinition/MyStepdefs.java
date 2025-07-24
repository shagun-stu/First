package stepsdefinition;

import hooks.hooksClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs {
    @When("user is on OrangeHRM website")
    public void user_is_on_OrangeHRM_website() {
      hooksClass.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @And("user put valid {string} and {string}")
    public void user_put_valid(String username, String password) {
        hooksClass.driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        hooksClass.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        hooksClass.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user redirected to the dashboard")
    public void user_redirected_to_the_dashboard() {
        String actualUrl= hooksClass.driver.getCurrentUrl();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals("Url mismatched",expectedUrl,actualUrl);
    }

}
