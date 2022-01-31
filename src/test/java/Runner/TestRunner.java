package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/saucedemo.feature"},
        glue = {"StepDefinition"},
        plugin = {
                "pretty","html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/",
        },
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests  {
}
