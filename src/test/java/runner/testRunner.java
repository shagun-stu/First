package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = {"stepsdefinition","hooks"},
        monochrome = true,
        dryRun = false,
        plugin = "pretty"

)
public class testRunner {
}
