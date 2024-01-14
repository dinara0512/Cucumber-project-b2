package com.loop.step_definitions;

import com.loop.utilities.utilities.BrowserUtilities;
import com.loop.utilities.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp (Scenario scenario) {

        Driver.getDriver();
      BrowserUtilities.myScenario = scenario;
    }

    @After
    public void tearDown(Scenario scenario) {

        //only takes a screenshot when scenario is failed
        if (scenario.isFailed()) {
            final byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
