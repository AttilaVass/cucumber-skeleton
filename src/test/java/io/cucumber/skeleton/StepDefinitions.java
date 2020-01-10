package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {


    WebDriver driver = new ChromeDriver();

    @Given("I navigate to {string}")
    public void I_navigate_to(String url) {
        driver.navigate().to(url);
    }


    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions

    }

    @After
        public void afterScenario(){
        System.out.println("this will run after scenario");
        driver.close();
    }


}
