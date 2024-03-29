package com.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//RunWith comes from JUnit and triggers the execution of the test
@RunWith(Cucumber.class)
@CucumberOptions
        (
                //To generate a report in html format
                plugin = {"html:target/html - reports/cucumber-report.html",
                        //to generate a report in JSON format
                "json:target/json-reports/json-report.json",
                "rerun:target/rerun.txt",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                //This is for the failed test report
                //"rerun:targer/rerun.txt"},
                //Path to feature file
                features = "src/test/resources/features/",
                //Path to step definiton classes
                glue = "com/loop/step_definitions",
                //It can be true or false.When dryRun=true, hook Class and any browser will not run
                dryRun =false ,
                tags = "@smoke123",
               //Make console output for the Cucumber test much more readable and remove any unreadable character
                monochrome = true
                //publish =false // online cucumber report but does not use it work due to privacy of data
        )
public class CukesRunner {
}
