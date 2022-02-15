package com.amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/amazon/step_definitions",
        dryRun = false,
        tags = "",
        plugin = {
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target"
        }
)
public class CucumberRunner {
}


