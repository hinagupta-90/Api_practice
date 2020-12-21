package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/Resources/FeatureFiles/"),
        glue = ("src/test/java/StepDefinition/UserListDef.groovy"),
        plugin = ("com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html")
      //  tags = "@001InsertFulfillmentService"
        )
public class UserList {
}
