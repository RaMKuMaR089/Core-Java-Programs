package runner;

import org.junit.runner.RunWith;
//import io.cucumber.core.cli.Main;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="featurefiles/opencartdemo.feature" , 
glue= "stepDefinitions"
//plugin = {"pretty", "html:target/cucumber-reports"},
//snippets = CucumberOptions.SnippetType.CAMELCASE,
//dryRun = true
)

public class opencartrunnerclass
{

}
