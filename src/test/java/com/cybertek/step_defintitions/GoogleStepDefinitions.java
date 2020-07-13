package com.cybertek.step_defintitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @Given("User is on the google search page")
    public void user_is_on_the_google_serarch_page() {

        Driver.getDriver().get("https://www.google.com");

    }


    @Then("User should see title is Google")
    public void user_should_see_tittle_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals("Actual title does not match expected title!", actualTitle,expectedTitle);
    }


}
