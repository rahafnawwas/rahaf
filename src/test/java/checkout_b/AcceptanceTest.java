package checkout_b;

import org.junit.runner.RunWith;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "case1",
                 plugin = "html:target/cucumber/wikipedia.html",
                 monochrome = true , 
                 snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE, 
                 glue = {"checkout_b"}
                 ,strict = true)

public class AcceptanceTest {

}
