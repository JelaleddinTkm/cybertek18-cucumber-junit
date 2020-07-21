package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",    //this line is for which feature it will run
        glue = "com/cybertek/step_defintitions"    //copy from the source root

)

public class FailedTestRunner {
}
