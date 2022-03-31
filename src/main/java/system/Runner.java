package system;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Report/report.html"},
        features = {"features"},
        monochrome = true,
        glue = {"steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
}
