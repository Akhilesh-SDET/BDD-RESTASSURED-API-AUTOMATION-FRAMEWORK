package cucumber.options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/feature",
    		plugin = {"pretty","json:target/jsonReports/cucumber-report.json"},
    glue = {"stepDefination"}
  //  tags= "@deleteResource"
)
public class TestRunner {
}

