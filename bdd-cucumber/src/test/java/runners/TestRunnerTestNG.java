package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.SnippetType;
import org.testng.annotations.Test;
//plugin = "json:target/cucumber-report-composite.json", 

@CucumberOptions(features = "src/test/resources/features", glue = "classpath:com.cerner.automation.bdd_cucumber.ittool", snippets = SnippetType.CAMELCASE, plugin = "html:target/cucumber-report-html.html")
public class TestRunnerTestNG {

    @Test
    public void runCukes() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}
