package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",   //this line is for which feature it will run
        glue = "com/cybertek/step_defintitions",    //copy from the source root
        dryRun = false,                            //if we say true, it will skip whole scenario
        tags = "@loginWithBackground"              //this line says us what will be run
  )


public class CukesRunner {
}
