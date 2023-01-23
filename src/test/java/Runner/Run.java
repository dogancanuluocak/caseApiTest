package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/resources/scenario.features"},
                glue    = "StepDefination/MyStepdef",
                dryRun = false,
                monochrome = true
                //strict = true
        )

public class Run extends AbstractTestNGCucumberTests {

}