package com.wavenet;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber-reports/cucumber.json",
        retryCount = 0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        featureOverviewChart = true,
        jsonUsageReport = "target2/cucumber-usage.json",
        usageReport = true,
        screenShotLocation = "/screenshots/",
        screenShotSize = "300px",
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target")

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},
        features = {"src/test/resources/stories/OddPhrase.feature"},
        glue = {"com.wavenet.stepDefinition"}
)

public class TestRunner {
}
