package runner;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        },
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = true,
        tags = "@wip"
)



public class CukesRunner {

}
