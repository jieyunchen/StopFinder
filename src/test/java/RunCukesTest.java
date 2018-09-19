
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue="step_definitions", plugin={"pretty", "html:out"}, snippets=SnippetType.CAMELCASE)
public class RunCukesTest {
}
 