package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/orangehrm.feature" , glue ="stepDefinitions" )
public class orangerunnerclass
{

}
