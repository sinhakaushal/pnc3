package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"json"},features="src/test/resources/skeleton")
@CucumberOptions(plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
