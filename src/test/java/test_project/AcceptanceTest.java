package test_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="use_cases",
plugin = {"html:target/cucumber/wikipedia.html"},
monochrome=true,
snippets = SnippetType.CAMELCASE,
glue = {"test_project"},
strict=true
)



public class AcceptanceTest {

}
